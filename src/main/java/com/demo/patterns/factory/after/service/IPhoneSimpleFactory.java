package com.demo.patterns.factory.after.service;

import com.demo.patterns.factory.domain.IPhone;
import com.demo.patterns.factory.enumeration.Generation;
import com.demo.patterns.factory.enumeration.Level;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class IPhoneSimpleFactory {

  private List<IPhone> iPhones;

  public IPhoneSimpleFactory(List<IPhone> iPhones){
    this.iPhones = iPhones;
  }

  public IPhone createIPhone(Generation generation, Level level) {
    return
        iPhones.stream()
          .filter(iPhone -> iPhone.getGeneration().equals(generation)
                             && iPhone.getLevel().equals(level))
          .findFirst()
          .orElseThrow(() -> new IllegalArgumentException("IPhone não encontrado !"));

  }

}
