package com.services.horse.RequestDTO;

import com.services.horse.enums.HorsemanStatus;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import lombok.Data;

import java.util.UUID;

@Data
public class RequestHorseDTO {
    @NotNull(message = "Name field is required")
    private final String name;
    private final UUID ownerId;
    @NotNull(message = "Horseman status field is required")
    private final HorsemanStatus horsemanStatus;

    @Positive(message = "Price must be positive")
    private final int price;

}
