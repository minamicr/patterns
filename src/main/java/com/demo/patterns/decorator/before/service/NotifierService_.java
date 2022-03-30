package com.demo.patterns.decorator.before.service;

import com.demo.patterns.decorator.before.model.EmailNotifier_;
import com.demo.patterns.decorator.before.model.FacebookNotifier_;
import com.demo.patterns.decorator.before.model.SlackNotifier_;
import com.demo.patterns.decorator.before.model.SmsNotifier_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotifierService_ {
  @Autowired
  private EmailNotifier_ emailNotifier;

  @Autowired
  private FacebookNotifier_ facebookNotifier;

  @Autowired
  private SlackNotifier_ slackNotifier;

  @Autowired
  private SmsNotifier_ smsNotifier;

  public void setEmailNotifier(EmailNotifier_ emailNotifier){
    this.emailNotifier = emailNotifier;
  }

  public void sendMessage(String ... notifiersName){
    emailNotifier.sendMessage();

    for(String notifierName : notifiersName){
      if (notifierName.equals("FACEBOOK")) {
        facebookNotifier.setMessage(emailNotifier.getMessage());
        facebookNotifier.sendMessage();
      }
      if (notifierName.equals("SLACK")) {
        slackNotifier.setMessage(emailNotifier.getMessage());
        slackNotifier.sendMessage();
      }
      if (notifierName.equals("SMS")) {
        smsNotifier.setMessage(emailNotifier.getMessage());
        smsNotifier.sendMessage();
      }
    }
  }
}
