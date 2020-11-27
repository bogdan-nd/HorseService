package com.services.demo.api.grpc;

import com.services.demo.entities.Horse;
import com.services.demo.enums.HorsemanStatus;
import com.services.demo.service.HorseService;
import com.services.grpc.server.horse.*;
import com.services.grpc.server.horse.HorseServiceGrpc.HorseServiceImplBase;
import io.grpc.stub.StreamObserver;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@GrpcService
@AllArgsConstructor
public class HorseGrpcController extends HorseServiceImplBase {
    private final HorseService horseService;

    @Override
    public void getHorses(Empty request, StreamObserver<HorseResponse> responseObserver) {
        List<Horse> horses = horseService.findAll();
        List<ProtoHorse> protoHorses = transformHorses(horses);

        HorseResponse response = HorseResponse.newBuilder()
                .addAllHorse(protoHorses).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getHorseById(IdRequest request, StreamObserver<HorseResponse> responseObserver) {
        UUID id = UUID.fromString(request.getId());
        HorseResponse response;
        try {
            Horse horse = horseService.getById(id);
            ProtoHorse protoHorse = transformHorseToProto(horse);
            response = HorseResponse.newBuilder()
                    .addHorse(protoHorse).build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (NotFoundException e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void getSuitableHorse(HorsemanRequest request, StreamObserver<HorseResponse> responseObserver) {
        String status = request.getStatus();
        HorsemanStatus horsemanStatus = HorsemanStatus.valueOf(status);
        HorseResponse response;
        try {
            Horse horse = horseService.findSuitable(horsemanStatus);
            ProtoHorse protoHorse = transformHorseToProto(horse);
            response = HorseResponse.newBuilder()
                    .addHorse(protoHorse)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (NotFoundException e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void addHorse(HorseRequest request, StreamObserver<HorseResponse> responseObserver) {
        ProtoHorse protoHorse = request.getHorse();
        Horse horse = createHorseFromProto(protoHorse);

        Horse createdHorse = horseService.saveHorse(horse);
        ProtoHorse createdProtoHorse = transformHorseToProto(createdHorse);

        HorseResponse response = HorseResponse.newBuilder()
                .addHorse(protoHorse)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void feedHorse(IdRequest request, StreamObserver<StringResponse> responseObserver) {
        UUID horseId = UUID.fromString(request.getId());
        StringResponse response;

        try {
            horseService.feedHorse(horseId);
            response = StringResponse.newBuilder()
                    .setAnswer(String.format("Horse with %s id was fed", horseId))
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (NotFoundException e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void recoverHorse(IdRequest request, StreamObserver<StringResponse> responseObserver) {
        UUID horseId = UUID.fromString(request.getId());
        StringResponse response;

        try {
            horseService.recoverHorse(horseId);
            response = StringResponse.newBuilder()
                    .setAnswer(String.format("Horse with %s id was recovered", horseId))
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (NotFoundException e) {
            responseObserver.onError(e);
        }
    }

    private ProtoHorse transformHorseToProto(Horse horse) {
        String horseId = horse.getId().toString();
        UUID ownerId = horse.getOwnerId();
        String ownerIdString = null;

        if (ownerId != null)
            ownerIdString = ownerId.toString();

        String horsemanStatus = horse.getHorsemanStatus().toString();
        String lastTimeEat = horse.getLastTimeEat().toString();

        ProtoHorse protoHorse = ProtoHorse.newBuilder()
                .setId(horseId)
                .setName(horse.getName())
                .setOwnerId(ownerIdString)
                .setHorsemanStatus(horsemanStatus)
                .setPrice(horse.getPrice())
                .setIsIll(horse.isIll())
                .setLastTimeEat(lastTimeEat)
                .build();

        return protoHorse;
    }

    private Horse createHorseFromProto(ProtoHorse protoHorse) {
        String name = protoHorse.getName();
        String ownerIdString = protoHorse.getOwnerId();
        UUID ownerId;
        if (ownerIdString != null)
            ownerId = UUID.fromString(ownerIdString);
        else
            ownerId = null;

        HorsemanStatus status = HorsemanStatus.valueOf(protoHorse.getHorsemanStatus());
        int price = protoHorse.getPrice();

        return new Horse(name, ownerId, status, price);
    }

    public List<ProtoHorse> transformHorses(List<Horse> horses) {
        List<ProtoHorse> protoHorses = new ArrayList<>();

        for (Horse horse : horses) {
            ProtoHorse protoHorse = transformHorseToProto(horse);
            protoHorses.add(protoHorse);
        }

        return protoHorses;
    }
}
