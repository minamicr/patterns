package com.demo.patterns.strategy.after.domain;

import com.demo.patterns.strategy.TaxType;
import org.springframework.stereotype.Component;

@Component
public class IPI implements Tax{
  private static final double IPI_VALUE = 0.1;

  @Override
  public TaxType taxType() {
    return TaxType.IPI;
  }

  @Override
  public double calculateTax(double value) {
    System.out.println("Strategy - Calculando valor do IPI com taxa " + IPI_VALUE);
    return value * IPI_VALUE;
  }
}
