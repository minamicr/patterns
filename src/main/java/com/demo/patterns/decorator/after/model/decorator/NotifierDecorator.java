package com.demo.patterns.decorator.after.model.decorator;

import com.demo.patterns.decorator.NotifierType;
import com.demo.patterns.decorator.after.model.Notifier;
import org.springframework.stereotype.Component;

@Component
public abstract class NotifierDecorator implements Notifier {
  private Notifier notifier;

  public abstract void setNotifier(Notifier notifier);

  public abstract NotifierType getNotifierType();

  public void setMessage(String message) {
    notifier.setMessage(message);
  }

  @Override
  public String getMessage() {
    return notifier.getMessage();
  }

  @Override
  public void sendMessage() {
    notifier.sendMessage();
  }
}
