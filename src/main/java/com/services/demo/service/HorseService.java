package com.services.demo.service;

import com.services.demo.entities.Horse;
import com.services.demo.enums.HorsemanStatus;
import com.services.demo.repo.HorseRepository;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class HorseService {
    private final HorseRepository repository;

    @Transactional
    public List<Horse> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Horse findSuitable(HorsemanStatus status) throws NotFoundException {
        List<Horse> suitableHorses =  repository.getSuitableHorses(status.ordinal());
        if (suitableHorses.size() ==0)
            throw new NotFoundException("There are any suitable horses");
        return suitableHorses.get(0);

    }

    @Transactional
    public Horse saveHorse(Horse horse) {
        return repository.save(horse);
    }

    @Transactional
    public Horse getById(UUID id) throws NotFoundException {
        Optional<Horse> horse =  repository.findById(id);
        if (horse.isPresent())
            return horse.get();
        else
            throw new NotFoundException(String.format("Horse with %s id does not exist",id));
    }

    @Transactional
    public void feedHorse(UUID id) throws NotFoundException {
        Horse horse = getById(id);
        horse.eat();
        saveHorse(horse);
    }

    @Transactional
    public void recoverHorse(UUID id) throws NotFoundException {
        Horse horse = getById(id);
        horse.getRecovered();
        saveHorse(horse);
    }
}
