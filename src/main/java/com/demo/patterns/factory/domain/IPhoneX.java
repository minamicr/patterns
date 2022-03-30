package com.demo.patterns.factory.domain;

import com.demo.patterns.factory.enumeration.Generation;
import com.demo.patterns.factory.enumeration.Level;
import org.springframework.stereotype.Component;

@Component
public class IPhoneX extends IPhone{

  @Override
  public String getHardware() {
    return "Hardware list: 5.8in Screen, A11 Chipset, 3Gb RAM, 256Gb Memory";
  }

  @Override
  public Generation getGeneration() {
    return Generation.IPHONE_X;
  }

  @Override
  public Level getLevel() {
    return Level.STANDARD;
  }
}
