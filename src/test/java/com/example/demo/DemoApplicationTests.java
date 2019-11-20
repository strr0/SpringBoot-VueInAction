package com.example.demo;

import com.example.demo.config.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private MailService mailService;

    @Test
    public void sendSimpleMail() {
        mailService.sendSimpleMail("",
                "",
                "测试邮件主题",
                "测试邮件内容");
    }

}
