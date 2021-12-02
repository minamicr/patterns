package com.demo.patterns.strategy.after.service;

import com.demo.patterns.strategy.TaxType;
import org.springframework.stereotype.Service;

@Service
public class TaxCalculatorStrategy {
  TaxRegistry taxRegistry;

  public TaxCalculatorStrategy(TaxRegistry taxRegistry){
    this.taxRegistry = taxRegistry;
  }

  public double calculateTax(TaxType taxType, double value) {
    return taxRegistry.getTaxStrategy(taxType)
        .orElseThrow(() -> new IllegalArgumentException("Tipo de Imposto não encontrado"))
        .calculateTax(value);
  }
}
