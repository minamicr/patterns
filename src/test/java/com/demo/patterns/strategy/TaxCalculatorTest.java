package com.demo.patterns.strategy;


import static org.assertj.core.api.BDDAssertions.then;

import com.demo.patterns.strategy.after.service.TaxCalculatorStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaxCalculatorTest {
  @Autowired
  //TaxCalculator taxCalculator;
  TaxCalculatorStrategy taxCalculator;

  @Test
  void givenICMSTaxWhenCalculateTaxThenReturnICMSValue(){
    double valueICMS = taxCalculator.calculateTax(TaxType.ICMS, 100);
    then(valueICMS).isEqualTo(15);
  }

  @Test
  void givenIOFTaxWhenCalculateTaxThenReturnIOFValue(){
    double valueIOF = taxCalculator.calculateTax(TaxType.IOF, 100);
    then(valueIOF).isEqualTo(13);
  }

  @Test
  void givenIRTaxWhenCalculateTaxThenReturnIRValue(){
    double valueIR = taxCalculator.calculateTax(TaxType.IR, 100);
    then(valueIR).isEqualTo(5);
  }
/*
  @Test
  void givenInvalidTaxTypeWhenCalculateTaxThenThrowException(){
    assertThatCode(() -> taxCalculator.calculateTax(
        null, 0)).hasMessageContaining("Tipo de Imposto não encontrado");
  }
*/

}