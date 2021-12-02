package com.demo.patterns.strategy.after.domain;

import com.demo.patterns.strategy.TaxType;

public interface Tax {

  TaxType taxType();
  double calculateTax(double value);

}
