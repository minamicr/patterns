package com.demo.patterns.decorator.after.service;

import com.demo.patterns.decorator.NotifierType;
import com.demo.patterns.decorator.after.model.Notifier;
import com.demo.patterns.decorator.after.model.decorator.NotifierDecorator;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NotifierService {
  List<NotifierDecorator> notifierDecorators;
  Notifier notifier;

  public NotifierService(List<NotifierDecorator> notifierDecorators){
    this.notifierDecorators = notifierDecorators;
  }

  public void setNotifier(Notifier notifier){
    this.notifier= notifier;
  }

  public void sendMessage(String ... notifiersName){
    notifier.sendMessage();
    for(String notifierName : notifiersName){
      NotifierDecorator decorator = getNotifier(notifierName);
      decorator.setNotifier(notifier);
      decorator.sendMessage();
    }
  }

  public NotifierDecorator getNotifier(String notifierName){
    return notifierDecorators.stream().filter(notifier ->
        notifier.getNotifierType()
            .equals(NotifierType.valueOf(notifierName)))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("Notificador não encontrado"));
  }
}
