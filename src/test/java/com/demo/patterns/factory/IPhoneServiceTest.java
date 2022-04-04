package com.demo.patterns.factory;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.demo.patterns.factory.after.service.IPhoneService;
import com.demo.patterns.factory.after.service.IPhoneSimpleFactory;
import com.demo.patterns.factory.before.service.IPhoneService_;
import com.demo.patterns.factory.domain.IPhone;
import com.demo.patterns.factory.domain.IPhone11Pro;
import com.demo.patterns.factory.domain.IPhoneX;
import com.demo.patterns.factory.domain.IPhoneXSMax;
import com.demo.patterns.factory.enumeration.Generation;
import com.demo.patterns.factory.enumeration.Level;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IPhoneServiceTest {

  @Mock
  IPhoneSimpleFactory factory;

  @InjectMocks
  IPhoneService iPhoneService;

  @Autowired
  IPhoneService_ iPhoneService_;

  @Test
  void givenGenerationXLevelStandardWhenOrderIPhoneOriginalClassThenReturnIPhoneX(){
    IPhone device = iPhoneService_.orderIPhone(Generation.IPHONE_X, Level.STANDARD);
    then(device.getHardware()).contains("5.8in", "A11", "3Gb", "256Gb");
    then(device).isExactlyInstanceOf(IPhoneX.class);

  }

  @Test
  void givenGenerationXLevelHighEndWhenOrderIPhoneOriginalClassThenReturnIPhoneXSMax(){
    IPhone device = iPhoneService_.orderIPhone(Generation.IPHONE_X, Level.HIGH_END);
    then(device.getHardware()).contains("6.5in", "A12", "4Gb", "512Gb");
    then(device).isExactlyInstanceOf(IPhoneXSMax.class);
  }

  @Test
  void givenGeneration11LevelHighEndWhenOrderIPhoneOriginalClassThenReturnIPhone11Pro(){
    IPhone device = iPhoneService_.orderIPhone(Generation.IPHONE_11, Level.HIGH_END);
    then(device.getHardware()).contains("6.5in", "A13", "4Gb", "512Gb");
    then(device).isExactlyInstanceOf(IPhone11Pro.class);
  }

  @Test
  void givenGenerationXLevelStandardWhenOrderIPhoneThenReturnIPhoneX(){
    when(factory.createIPhone(any(Generation.class), any(Level.class)))
        .thenReturn(new IPhoneX());
    IPhone device = iPhoneService.orderIPhone(Generation.IPHONE_X, Level.STANDARD);
    then(device.getHardware()).contains("5.8in", "A11", "3Gb", "256Gb");
    then(device).isExactlyInstanceOf(IPhoneX.class);
  }

  @Test
  void givenGenerationXLevelHighEndWhenOrderIPhoneThenReturnIPhoneXSMax(){
    when(factory.createIPhone(any(Generation.class), any(Level.class)))
        .thenReturn(new IPhoneXSMax());
    IPhone device = iPhoneService.orderIPhone(Generation.IPHONE_X, Level.HIGH_END);
    then(device.getHardware()).contains("6.5in", "A12", "4Gb", "512Gb");
    then(device).isExactlyInstanceOf(IPhoneXSMax.class);
  }

  @Test
  void givenGeneration11LevelHighEndWhenOrderIPhoneThenReturnIPhone11Pro(){
    when(factory.createIPhone(any(Generation.class), any(Level.class)))
        .thenReturn(new IPhone11Pro());
    IPhone device = iPhoneService.orderIPhone(Generation.IPHONE_11, Level.HIGH_END);
    then(device.getHardware()).contains("6.5in", "A13", "4Gb", "512Gb");
    then(device).isExactlyInstanceOf(IPhone11Pro.class);

  }


}