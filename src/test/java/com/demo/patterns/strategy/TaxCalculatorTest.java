package com.demo.patterns.strategy;

import static org.assertj.core.api.BDDAssertions.then;

import com.demo.patterns.strategy.after.service.TaxCalculatorStrategy;
import com.demo.patterns.strategy.before.service.TaxCalculator;
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

  /*
  @Test
  void givenIPITaxWhenCalculateTaxThenReturnIPIValue(){
    double valueIPI = taxCalculator.calculateTax(TaxType.IPI, 100);
    then(valueIPI).isEqualTo(10);
  }

  @Test
  void givenTipoImpostoInvalidoWhenCalcularThenLancarExcecao(){
    assertThatCode(() -> taxCalculator.calculateTax(
        null, 0)).hasMessageContaining("Tipo de Imposto não encontrado");
  }

   */

}