package com.buynhold.compoundinterest.domain.services.impl;

import com.buynhold.compoundinterest.domain.entities.ValuesIn;
import com.buynhold.compoundinterest.domain.services.CalculatorService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private static final int CONSTANT_VALUE = 1;

    @Override
    public BigDecimal calculateStandardCompound(ValuesIn valuesIn) {
        Double sum = CONSTANT_VALUE + (valuesIn.getInterestRate() / 100);
        Double potentiation = Math.pow(sum, valuesIn.getPeriod());

        return new BigDecimal(valuesIn.getPrincipal() * potentiation)
                .setScale(2, RoundingMode.HALF_UP);
    }

}
