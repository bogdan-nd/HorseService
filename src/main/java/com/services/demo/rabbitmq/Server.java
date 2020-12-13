package com.services.demo.rabbitmq;

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
    public void addHorse(Horse horse){
        horseService.saveHorse(horse);
    }
}
