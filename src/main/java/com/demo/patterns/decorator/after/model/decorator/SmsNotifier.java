package com.demo.patterns.decorator.after.model.decorator;

import com.demo.patterns.decorator.NotifierType;
import com.demo.patterns.decorator.after.model.Notifier;
import org.springframework.stereotype.Component;

@Component
public class SmsNotifier extends NotifierDecorator{
  Notifier notifier;

  @Override
  public void setNotifier(Notifier notifier) {
    this.notifier = notifier;
  }

  @Override
  public NotifierType getNotifierType() {
    return NotifierType.SMS;
  }

  @Override
  public void sendMessage(){
    System.out.println(String.format("Mensagem [%s] enviada por SMS", notifier.getMessage()));
  }

}
