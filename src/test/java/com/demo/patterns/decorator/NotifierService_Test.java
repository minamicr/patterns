package com.demo.patterns.decorator;


import com.demo.patterns.decorator.before.model.EmailNotifier_;
import com.demo.patterns.decorator.before.model.FacebookNotifier_;
import com.demo.patterns.decorator.before.model.SlackNotifier_;
import com.demo.patterns.decorator.before.model.SmsNotifier_;
import com.demo.patterns.decorator.before.service.NotifierService_;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class NotifierService_Test {
  @Spy
  EmailNotifier_ emailNotifier;

  @Spy
  SlackNotifier_ slackNotifier;

  @Spy
  FacebookNotifier_ facebookNotifier;

  @Spy
  SmsNotifier_ smsNotifier;

  @InjectMocks
  NotifierService_ notifierService;

  @Test
  void givenEmailNotifierWhenSendMessageThenSendEmailMessageAndOthers(){
    emailNotifier.setMessage("primeiro teste de email");
    notifierService.setEmailNotifier(emailNotifier);
    notifierService.sendMessage("SLACK", "FACEBOOK", "SMS");

    System.out.println("---------------------------------------------------------");

    emailNotifier.setMessage("segundo teste de email");
    notifierService.sendMessage("SLACK", "SMS");

  }
}
