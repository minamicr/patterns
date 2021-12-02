package com.demo.patterns.strategy.after.domain;

import com.demo.patterns.strategy.TaxType;
import org.springframework.stereotype.Component;

@Component
public class ICMS implements Tax {
  private static final double ICMS_VALUE = 0.15;

  @Override
  public TaxType taxType() {
    return TaxType.ICMS;
  }

  @Override
  public double calculateTax(double value) {
    System.out.println("Strategy - Calculando ICMS com taxa de " + ICMS_VALUE);
    return value * ICMS_VALUE;
  }
}
