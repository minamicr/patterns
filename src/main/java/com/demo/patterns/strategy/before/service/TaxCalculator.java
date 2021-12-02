package com.demo.patterns.strategy.before.service;

import com.demo.patterns.strategy.TaxType;
import org.springframework.stereotype.Service;

@Service
public class TaxCalculator {
  private static final double ICMS_VALUE = 0.15;
  private static final double IOF_VALUE = 0.13;

  public double calculateTax(TaxType taxType, double value){

    if(taxType.equals(TaxType.ICMS)){
      System.out.println("Calculando ICMS com taxa de " + ICMS_VALUE);
      return value * ICMS_VALUE;
    } else if (taxType.equals(TaxType.IOF)){
      System.out.println("Calculando ICMS com taxa de " + IOF_VALUE);
      return value * IOF_VALUE;
    } else {
      return 0;
    }

  }
}
