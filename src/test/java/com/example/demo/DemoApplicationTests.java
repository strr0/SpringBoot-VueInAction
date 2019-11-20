package com.example.demo;

import com.example.demo.config.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private MailService mailService;
    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void sendSimpleMail() {
        mailService.sendSimpleMail("",
                "",
                "测试邮件主题",
                "测试邮件内容");
    }

    @Test
    public void sendAttachFileMail() {
        mailService.sendAttachFileMail("",
                "",
                "测试邮件主题",
                "测试邮件内容",
                new File(""));
    }

    @Test
    public void sendMailWithImg() {
        mailService.sendMailWithImg("",
                "",
                "测试邮件主题（图片）",
                "<div>hello, 这是一封带图片资源的邮件: " +
                        "这是图片1: <div><img src='cid:p01'/></div>" +
                        "这是图片2: <div><img src='cid:p02'/></div>" +
                        "</div>",
                new String[]{"",
                        ""},
                new String[]{"p01", "p02"});
    }

    @Test
    public void sendHtmlMail() {
        Context ctx = new Context();
        ctx.setVariable("username", "strr");
        ctx.setVariable("gender", "女");
        String mail = templateEngine.process("mailtemplate.html", ctx);
        mailService.sendHtmlMail("",
                "",
                "测试邮件主题",
                mail);
    }

}
