package com.demo.patterns.factory.domain;

import com.demo.patterns.factory.enumeration.Generation;
import com.demo.patterns.factory.enumeration.Level;
import org.springframework.stereotype.Component;

@Component
public class IPhone11Pro extends IPhone {

  @Override
  public String getHardware() {
    return "Hardware list: 6.5in Screen, A13 Chipset, 4Gb RAM, 512Gb Memory";
  }

  @Override
  public Generation getGeneration() {
    return Generation.IPHONE_11;
  }

  @Override
  public Level getLevel() {
    return Level.HIGH_END;
  }
}
