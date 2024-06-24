package com.demo.patterns.strategy.after.domain;

import com.demo.patterns.strategy.TaxType;
import org.springframework.stereotype.Component;

@Component
public class IR implements Tax{
  private static final double IR_TAX = 0.05;

  @Override
  public TaxType taxType() {
    return TaxType.IR;
  }

  @Override
  public double calculateTax(double value) {
    System.out.println("Strategy - Calculando IR com taxa de " + IR_TAX);
    return value * IR_TAX;
  }
}
