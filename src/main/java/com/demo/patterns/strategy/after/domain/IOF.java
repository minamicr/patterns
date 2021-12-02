package com.demo.patterns.strategy.after.domain;

import com.demo.patterns.strategy.TaxType;
import org.springframework.stereotype.Component;

@Component
public class IOF implements Tax{
  private static final double IOF_VALUE = 0.13;

  @Override
  public TaxType taxType() {
    return TaxType.IOF;
  }

  @Override
  public double calculateTax(double value) {
    System.out.println("Strategy - Calculando IOF com taxa de " + IOF_VALUE);
    return value * IOF_VALUE;
  }
}
