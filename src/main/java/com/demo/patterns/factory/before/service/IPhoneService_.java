package com.demo.patterns.factory.before.service;

import com.demo.patterns.factory.domain.IPhone;
import com.demo.patterns.factory.domain.IPhone11;
import com.demo.patterns.factory.domain.IPhone11Pro;
import com.demo.patterns.factory.domain.IPhoneX;
import com.demo.patterns.factory.domain.IPhoneXSMax;
import com.demo.patterns.factory.enumeration.Generation;
import com.demo.patterns.factory.enumeration.Level;
import org.springframework.stereotype.Service;

@Service
public class IPhoneService_ {

  public IPhone orderIPhone(Generation generation, Level level) {
    IPhone device = null;

    if (generation.equals(Generation.IPHONE_X)){
      if(level.equals(Level.STANDARD)){
        device = new IPhoneX();
      } else if (level.equals(Level.HIGH_END)){
        device = new IPhoneXSMax();
      }
    } else if (generation.equals(Generation.IPHONE_11)){
      if (level.equals(Level.STANDARD)){
        device = new IPhone11();
      } else if (level.equals(Level.HIGH_END)){
        device = new IPhone11Pro();
      }
    }

    System.out.println(device.getDeviceName());
    System.out.println(device.getDeviceModel());
    System.out.println(device.getHardware());
    System.out.println(device.certificates());
    System.out.println(device.pack());

    return device;

  }

}
