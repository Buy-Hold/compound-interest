package com.buynhold.compoundinterest.domain.services;

import com.buynhold.compoundinterest.domain.entities.ValuesIn;

import java.math.BigDecimal;

public interface CalculatorService {

    BigDecimal calculateStandardCompound(ValuesIn valuesIn);

}
