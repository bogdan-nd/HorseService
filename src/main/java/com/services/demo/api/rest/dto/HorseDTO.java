package com.services.demo.api.rest.dto;

import com.services.demo.entities.enums.HorsemanStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
public class HorseDTO {
    private String name;
    private UUID ownerId;
    private HorsemanStatus horsemanStatus;
    private int price;

}
