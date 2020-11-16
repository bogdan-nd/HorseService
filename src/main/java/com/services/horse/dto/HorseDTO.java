package com.services.horse.dto;

import com.services.horse.enums.HorsemanStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class HorseDTO {
    private final String name;
    private final UUID ownerId;
    private final HorsemanStatus horsemanStatus;
    private final int price;

}
