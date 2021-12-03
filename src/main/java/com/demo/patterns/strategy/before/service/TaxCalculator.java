package com.demo.patterns.strategy.before.service;

import com.demo.patterns.strategy.TaxType;
import org.springframework.stereotype.Service;

@Service
public class TaxCalculator {
  private static final double ICMS_TAX = 0.15;
  private static final double IOF_TAX = 0.13;

  public double calculateTax(TaxType taxType, double value){

    if(taxType.equals(TaxType.ICMS)){
      System.out.println("Calculando ICMS com taxa de " + ICMS_TAX);
      return value * ICMS_TAX;
    } else if (taxType.equals(TaxType.IOF)){
      System.out.println("Calculando ICMS com taxa de " + IOF_TAX);
      return value * IOF_TAX;
    } else {
      return 0;
    }

  }
}
