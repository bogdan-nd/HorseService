package com.services.demo.api.rest.dto;

import com.services.demo.entities.enums.HorsemanStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class HorseDTO {
    private final String name;
    private final UUID ownerId;
    private final HorsemanStatus horsemanStatus;
    private final int price;

}
