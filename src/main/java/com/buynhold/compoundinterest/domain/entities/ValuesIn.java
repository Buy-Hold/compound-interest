package com.buynhold.compoundinterest.domain.entities;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

@Data
@Validated
public class ValuesIn {

    @Min(value = 1)
    @NotNull
    private Double principal;

    @Min(value = 0)
    @NotNull
    private Double interestRate;

    @Min(value = 1)
    @NotNull
    private Double period;

}
