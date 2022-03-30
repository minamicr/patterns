package com.demo.patterns.factory.after.service;

import com.demo.patterns.factory.domain.IPhone;
import com.demo.patterns.factory.enumeration.Generation;
import com.demo.patterns.factory.enumeration.Level;
import org.springframework.stereotype.Service;

@Service
public class IPhoneServiceFactory {
  IPhoneSimpleFactory factory;

  public IPhone orderIPhone(Generation generation, Level level) {
    IPhone device = factory.createIPhone(generation, level);

    System.out.println(device.getHardware());
    System.out.println(device.certificates());
    System.out.println(device.pack());

    return device;

  }

}
