package com.demo.patterns.strategy.after.service;

import com.demo.patterns.strategy.TaxType;
import com.demo.patterns.strategy.after.domain.Tax;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class TaxRegistry {
  List<Tax> taxes;

  public TaxRegistry(List<Tax> taxes){
    this.taxes = taxes;
  }

  public Optional<Tax> getTaxStrategy(TaxType taxType){
    return taxes.stream()
        .filter(tax -> tax.taxType().equals(taxType))
        .findFirst();
  }
}
