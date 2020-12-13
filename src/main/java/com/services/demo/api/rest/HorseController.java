package com.services.demo.api.rest;

import com.services.demo.api.rest.dto.HorseDTO;
import com.services.demo.entities.Horse;
import com.services.demo.entities.enums.HorsemanStatus;
import com.services.demo.service.HorseService;
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
    public ResponseEntity<Horse> getHorseById(@PathVariable UUID id){
        try {
            return ResponseEntity.ok(horseService.getById(id));
        }
        catch (NotFoundException e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .build();
        }
    }

    @GetMapping("status/{horsemanStatus}")
    public ResponseEntity<Horse> getSuitableHorse(@PathVariable HorsemanStatus horsemanStatus){
        try {
            return ResponseEntity.ok(horseService.findSuitable(horsemanStatus));
        }
        catch (NotFoundException e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .build();
        }
    }

    @PostMapping("{horseId}/eat")
    public ResponseEntity<String> feedHorse(@PathVariable UUID horseId){
        try{
            horseService.feedHorse(horseId);
            return ResponseEntity.ok(String.format("Horse with %s id was fed",horseId));
        }
        catch (NotFoundException e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    @PostMapping("{horseId}/recover")
    public ResponseEntity<String> recoverHorse(@PathVariable UUID horseId){
        try{
            horseService.recoverHorse(horseId);
            return ResponseEntity.ok(String.format("Horse with %s id was recovered",horseId));
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
}
