package com.services.demo.rabbitmq;

import com.services.demo.api.rest.dto.HorseDTO;
import com.services.demo.entities.Horse;
import com.services.demo.service.HorseService;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Server {
    private final HorseService horseService;

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void addHorse(HorseDTO horseDTO){
        Horse horse = new Horse(horseDTO.getName(),horseDTO.getOwnerId(),horseDTO.getHorsemanStatus(),horseDTO.getPrice());
        horseService.saveHorse(horse);
    }
}
