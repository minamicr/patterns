package com.demo.patterns.decorator;

import com.demo.patterns.decorator.after.model.EmailNotifier;
import com.demo.patterns.decorator.after.service.NotifierService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NotifierServiceTest {
  @Autowired
  NotifierService notifierService;

  @Autowired
  EmailNotifier emailNotifier;

  @Test
  void givenEmailNotifierWhenSendMessageThenSendEmailMessageAndOthers(){

    emailNotifier.setMessage("primeiro teste de email");
    notifierService.setNotifier(emailNotifier);
    notifierService.sendMessage("SLACK", "FACEBOOK", "SMS");

    System.out.println("---------------------------------------------------------");

    emailNotifier.setMessage("segundo teste de email");
    notifierService.sendMessage("SLACK", "SMS");

  }

}
