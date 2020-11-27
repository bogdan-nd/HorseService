package com.services.grpc.server.horse;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: Horse.proto")
public final class HorseServiceGrpc {

  private HorseServiceGrpc() {}

  public static final String SERVICE_NAME = "com.services.grpc.server.horse.HorseService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.services.grpc.server.horse.Empty,
      com.services.grpc.server.horse.HorseResponse> METHOD_GET_HORSES =
      io.grpc.MethodDescriptor.<com.services.grpc.server.horse.Empty, com.services.grpc.server.horse.HorseResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.services.grpc.server.horse.HorseService", "getHorses"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.services.grpc.server.horse.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.services.grpc.server.horse.HorseResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.services.grpc.server.horse.IdRequest,
      com.services.grpc.server.horse.HorseResponse> METHOD_GET_HORSE_BY_ID =
      io.grpc.MethodDescriptor.<com.services.grpc.server.horse.IdRequest, com.services.grpc.server.horse.HorseResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.services.grpc.server.horse.HorseService", "getHorseById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.services.grpc.server.horse.IdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.services.grpc.server.horse.HorseResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.services.grpc.server.horse.HorsemanRequest,
      com.services.grpc.server.horse.HorseResponse> METHOD_GET_SUITABLE_HORSE =
      io.grpc.MethodDescriptor.<com.services.grpc.server.horse.HorsemanRequest, com.services.grpc.server.horse.HorseResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.services.grpc.server.horse.HorseService", "getSuitableHorse"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.services.grpc.server.horse.HorsemanRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.services.grpc.server.horse.HorseResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.services.grpc.server.horse.HorseRequest,
      com.services.grpc.server.horse.HorseResponse> METHOD_ADD_HORSE =
      io.grpc.MethodDescriptor.<com.services.grpc.server.horse.HorseRequest, com.services.grpc.server.horse.HorseResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.services.grpc.server.horse.HorseService", "addHorse"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.services.grpc.server.horse.HorseRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.services.grpc.server.horse.HorseResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.services.grpc.server.horse.IdRequest,
      com.services.grpc.server.horse.StringResponse> METHOD_FEED_HORSE =
      io.grpc.MethodDescriptor.<com.services.grpc.server.horse.IdRequest, com.services.grpc.server.horse.StringResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.services.grpc.server.horse.HorseService", "feedHorse"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.services.grpc.server.horse.IdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.services.grpc.server.horse.StringResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.services.grpc.server.horse.IdRequest,
      com.services.grpc.server.horse.StringResponse> METHOD_RECOVER_HORSE =
      io.grpc.MethodDescriptor.<com.services.grpc.server.horse.IdRequest, com.services.grpc.server.horse.StringResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.services.grpc.server.horse.HorseService", "recoverHorse"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.services.grpc.server.horse.IdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.services.grpc.server.horse.StringResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HorseServiceStub newStub(io.grpc.Channel channel) {
    return new HorseServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HorseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HorseServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HorseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HorseServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HorseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getHorses(com.services.grpc.server.horse.Empty request,
        io.grpc.stub.StreamObserver<com.services.grpc.server.horse.HorseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_HORSES, responseObserver);
    }

    /**
     */
    public void getHorseById(com.services.grpc.server.horse.IdRequest request,
        io.grpc.stub.StreamObserver<com.services.grpc.server.horse.HorseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_HORSE_BY_ID, responseObserver);
    }

    /**
     */
    public void getSuitableHorse(com.services.grpc.server.horse.HorsemanRequest request,
        io.grpc.stub.StreamObserver<com.services.grpc.server.horse.HorseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SUITABLE_HORSE, responseObserver);
    }

    /**
     */
    public void addHorse(com.services.grpc.server.horse.HorseRequest request,
        io.grpc.stub.StreamObserver<com.services.grpc.server.horse.HorseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_HORSE, responseObserver);
    }

    /**
     */
    public void feedHorse(com.services.grpc.server.horse.IdRequest request,
        io.grpc.stub.StreamObserver<com.services.grpc.server.horse.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FEED_HORSE, responseObserver);
    }

    /**
     */
    public void recoverHorse(com.services.grpc.server.horse.IdRequest request,
        io.grpc.stub.StreamObserver<com.services.grpc.server.horse.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RECOVER_HORSE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_HORSES,
            asyncUnaryCall(
              new MethodHandlers<
                com.services.grpc.server.horse.Empty,
                com.services.grpc.server.horse.HorseResponse>(
                  this, METHODID_GET_HORSES)))
          .addMethod(
            METHOD_GET_HORSE_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.services.grpc.server.horse.IdRequest,
                com.services.grpc.server.horse.HorseResponse>(
                  this, METHODID_GET_HORSE_BY_ID)))
          .addMethod(
            METHOD_GET_SUITABLE_HORSE,
            asyncUnaryCall(
              new MethodHandlers<
                com.services.grpc.server.horse.HorsemanRequest,
                com.services.grpc.server.horse.HorseResponse>(
                  this, METHODID_GET_SUITABLE_HORSE)))
          .addMethod(
            METHOD_ADD_HORSE,
            asyncUnaryCall(
              new MethodHandlers<
                com.services.grpc.server.horse.HorseRequest,
                com.services.grpc.server.horse.HorseResponse>(
                  this, METHODID_ADD_HORSE)))
          .addMethod(
            METHOD_FEED_HORSE,
            asyncUnaryCall(
              new MethodHandlers<
                com.services.grpc.server.horse.IdRequest,
                com.services.grpc.server.horse.StringResponse>(
                  this, METHODID_FEED_HORSE)))
          .addMethod(
            METHOD_RECOVER_HORSE,
            asyncUnaryCall(
              new MethodHandlers<
                com.services.grpc.server.horse.IdRequest,
                com.services.grpc.server.horse.StringResponse>(
                  this, METHODID_RECOVER_HORSE)))
          .build();
    }
  }

  /**
   */
  public static final class HorseServiceStub extends io.grpc.stub.AbstractStub<HorseServiceStub> {
    private HorseServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HorseServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HorseServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HorseServiceStub(channel, callOptions);
    }

    /**
     */
    public void getHorses(com.services.grpc.server.horse.Empty request,
        io.grpc.stub.StreamObserver<com.services.grpc.server.horse.HorseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_HORSES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHorseById(com.services.grpc.server.horse.IdRequest request,
        io.grpc.stub.StreamObserver<com.services.grpc.server.horse.HorseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_HORSE_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSuitableHorse(com.services.grpc.server.horse.HorsemanRequest request,
        io.grpc.stub.StreamObserver<com.services.grpc.server.horse.HorseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SUITABLE_HORSE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addHorse(com.services.grpc.server.horse.HorseRequest request,
        io.grpc.stub.StreamObserver<com.services.grpc.server.horse.HorseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_HORSE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void feedHorse(com.services.grpc.server.horse.IdRequest request,
        io.grpc.stub.StreamObserver<com.services.grpc.server.horse.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FEED_HORSE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recoverHorse(com.services.grpc.server.horse.IdRequest request,
        io.grpc.stub.StreamObserver<com.services.grpc.server.horse.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RECOVER_HORSE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HorseServiceBlockingStub extends io.grpc.stub.AbstractStub<HorseServiceBlockingStub> {
    private HorseServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HorseServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HorseServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HorseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.services.grpc.server.horse.HorseResponse getHorses(com.services.grpc.server.horse.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_HORSES, getCallOptions(), request);
    }

    /**
     */
    public com.services.grpc.server.horse.HorseResponse getHorseById(com.services.grpc.server.horse.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_HORSE_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public com.services.grpc.server.horse.HorseResponse getSuitableHorse(com.services.grpc.server.horse.HorsemanRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SUITABLE_HORSE, getCallOptions(), request);
    }

    /**
     */
    public com.services.grpc.server.horse.HorseResponse addHorse(com.services.grpc.server.horse.HorseRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_HORSE, getCallOptions(), request);
    }

    /**
     */
    public com.services.grpc.server.horse.StringResponse feedHorse(com.services.grpc.server.horse.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FEED_HORSE, getCallOptions(), request);
    }

    /**
     */
    public com.services.grpc.server.horse.StringResponse recoverHorse(com.services.grpc.server.horse.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RECOVER_HORSE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HorseServiceFutureStub extends io.grpc.stub.AbstractStub<HorseServiceFutureStub> {
    private HorseServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HorseServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HorseServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HorseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.services.grpc.server.horse.HorseResponse> getHorses(
        com.services.grpc.server.horse.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_HORSES, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.services.grpc.server.horse.HorseResponse> getHorseById(
        com.services.grpc.server.horse.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_HORSE_BY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.services.grpc.server.horse.HorseResponse> getSuitableHorse(
        com.services.grpc.server.horse.HorsemanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SUITABLE_HORSE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.services.grpc.server.horse.HorseResponse> addHorse(
        com.services.grpc.server.horse.HorseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_HORSE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.services.grpc.server.horse.StringResponse> feedHorse(
        com.services.grpc.server.horse.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FEED_HORSE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.services.grpc.server.horse.StringResponse> recoverHorse(
        com.services.grpc.server.horse.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RECOVER_HORSE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HORSES = 0;
  private static final int METHODID_GET_HORSE_BY_ID = 1;
  private static final int METHODID_GET_SUITABLE_HORSE = 2;
  private static final int METHODID_ADD_HORSE = 3;
  private static final int METHODID_FEED_HORSE = 4;
  private static final int METHODID_RECOVER_HORSE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HorseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HorseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HORSES:
          serviceImpl.getHorses((com.services.grpc.server.horse.Empty) request,
              (io.grpc.stub.StreamObserver<com.services.grpc.server.horse.HorseResponse>) responseObserver);
          break;
        case METHODID_GET_HORSE_BY_ID:
          serviceImpl.getHorseById((com.services.grpc.server.horse.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.services.grpc.server.horse.HorseResponse>) responseObserver);
          break;
        case METHODID_GET_SUITABLE_HORSE:
          serviceImpl.getSuitableHorse((com.services.grpc.server.horse.HorsemanRequest) request,
              (io.grpc.stub.StreamObserver<com.services.grpc.server.horse.HorseResponse>) responseObserver);
          break;
        case METHODID_ADD_HORSE:
          serviceImpl.addHorse((com.services.grpc.server.horse.HorseRequest) request,
              (io.grpc.stub.StreamObserver<com.services.grpc.server.horse.HorseResponse>) responseObserver);
          break;
        case METHODID_FEED_HORSE:
          serviceImpl.feedHorse((com.services.grpc.server.horse.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.services.grpc.server.horse.StringResponse>) responseObserver);
          break;
        case METHODID_RECOVER_HORSE:
          serviceImpl.recoverHorse((com.services.grpc.server.horse.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.services.grpc.server.horse.StringResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class HorseServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.services.grpc.server.horse.Horse.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HorseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HorseServiceDescriptorSupplier())
              .addMethod(METHOD_GET_HORSES)
              .addMethod(METHOD_GET_HORSE_BY_ID)
              .addMethod(METHOD_GET_SUITABLE_HORSE)
              .addMethod(METHOD_ADD_HORSE)
              .addMethod(METHOD_FEED_HORSE)
              .addMethod(METHOD_RECOVER_HORSE)
              .build();
        }
      }
    }
    return result;
  }
}
