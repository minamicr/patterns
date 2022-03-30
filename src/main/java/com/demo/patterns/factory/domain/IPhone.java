package com.demo.patterns.factory.domain;

import com.demo.patterns.factory.enumeration.Generation;
import com.demo.patterns.factory.enumeration.Level;

public abstract class IPhone {
  private String deviceName;

  public abstract String getHardware();
  public abstract Generation getGeneration();
  public abstract Level getLevel();

  public String getDeviceName(){
    return this.deviceName;
  }

  public String certificates() {
    return "Testing all the certificates";
  }

  public String pack() {
    return "Packing the device";
  }

}
