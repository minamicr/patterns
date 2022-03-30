package com.demo.patterns.decorator.after.model;

import org.springframework.stereotype.Component;

@Component
public class EmailNotifier implements Notifier{
  private String message;

  @Override
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message;
  }

  @Override
  public void sendMessage() {
    System.out.println(String.format("Mensagem [%s] enviada por e-mail", message));
  }
}
