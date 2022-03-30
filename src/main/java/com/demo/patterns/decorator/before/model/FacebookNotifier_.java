package com.demo.patterns.decorator.before.model;

import org.springframework.stereotype.Component;

@Component
public class FacebookNotifier_ {
  private String message;

  public void setMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void sendMessage(){
    System.out.println(String.format("Mensagem [%s] enviada por FACEBOOK", message));
  }

}
