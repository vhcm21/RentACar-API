package com.school.mindera.rentacar.command;

import com.school.mindera.rentacar.enumerators.CarBrands;
import com.school.mindera.rentacar.enumerators.CarSegment;
import com.school.mindera.rentacar.enumerators.EngineType;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import java.util.Date;

@Data
@Builder
public class CreateOrUpdateCarDto {

    private CarBrands brand;

    @NotBlank(message = "Must have model description")
    private String modelDescription;

    private EngineType engineType;

    private CarSegment carSegment;

    @PastOrPresent
    private Date dateOfPurchase;

    @NotBlank(message = "Must have plate")
    private String plate;
}
