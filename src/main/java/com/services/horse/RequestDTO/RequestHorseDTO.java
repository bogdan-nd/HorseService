package com.services.horse.RequestDTO;

import com.services.horse.enums.HorsemanStatus;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import lombok.Data;

import java.util.UUID;

@Data
public class RequestHorseDTO {
    private final String name;
    private final UUID ownerId;
    private final HorsemanStatus horsemanStatus;
    private final int price;

}
