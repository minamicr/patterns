package com.demo.patterns.factory.domain;

import com.demo.patterns.factory.enumeration.Generation;
import com.demo.patterns.factory.enumeration.Level;

public abstract class IPhone {

  public abstract String getHardware();
  public abstract Generation getGeneration();
  public abstract Level getLevel();

  public String getDeviceName(){
    return getClass().getSimpleName();
  }

  public String getDeviceModel(){
    return getGeneration().toString() + " " + getLevel().toString();
  }

  public String certificates() {
    return "Testing all the certificates";
  }

  public String pack() {
    return "Packing the device";
  }

}
