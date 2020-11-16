package com.services.horse.controller;

import com.services.horse.dto.HorseDTO;
import com.services.horse.entities.Horse;
import com.services.horse.enums.HorsemanStatus;
import com.services.horse.service.HorseService;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("horses")
@AllArgsConstructor
public class HorseController {
    private final HorseService horseService;

    @GetMapping
    public ResponseEntity<List<Horse>> getHorses(){
        return ResponseEntity.ok(horseService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Horse> getHorseById(@PathVariable UUID id) throws NotFoundException {
        return ResponseEntity.ok(horseService.getById(id));
    }

    @GetMapping("status/{horsemanStatus}")
    public ResponseEntity<List<Horse>> getSuitableHorses(@PathVariable HorsemanStatus horsemanStatus){
        return ResponseEntity.ok(horseService.findSuitable(horsemanStatus));
    }

    @GetMapping("ill")
    public ResponseEntity<List<Horse>> getIllHorses(){
        return ResponseEntity.ok(horseService.getIllHorses());
    }

    @PatchMapping("{horseId}/eat")
    public ResponseEntity<String> feedHorse(@PathVariable UUID horseId){
        try{
            horseService.feedHorse(horseId);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(String.format("Horse with %s id was fed",horseId));
        }
        catch (NotFoundException e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    @PatchMapping("{horseId}/recover")
    public ResponseEntity<String> recoverHorse(@PathVariable UUID horseId){
        try{
            horseService.recoverHorse(horseId);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(String.format("Horse with %s id was recovered",horseId));
        }
        catch (NotFoundException e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }


    @PostMapping
    public ResponseEntity<Horse> addHorse(@RequestBody HorseDTO horseDTO){
        Horse newHorse = new Horse(horseDTO.getName(), horseDTO.getOwnerId(),
                horseDTO.getHorsemanStatus(), horseDTO.getPrice());

        return ResponseEntity.ok(horseService.saveHorse(newHorse));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteHorse(@PathVariable UUID id){
        horseService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
