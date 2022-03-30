package com.demo.patterns.decorator.after.model;

public interface Notifier {
  void setMessage(String message);
  String getMessage();
  void sendMessage();

}
