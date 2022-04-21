package com.buynhold.compoundinterest.application.web;

import com.buynhold.compoundinterest.domain.entities.ValuesIn;
import com.buynhold.compoundinterest.domain.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.BigDecimal;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping
    public ResponseEntity<BigDecimal> calculateStandardCompound(@Valid @RequestBody ValuesIn valuesIn) {
        return ResponseEntity.ok(this.calculatorService.calculateStandardCompound(valuesIn));
    }
}
