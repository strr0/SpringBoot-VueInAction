package com.example.demo;

import com.example.demo.config.MailService;
import com.example.demo.entity.User;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.StringWriter;

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
        try{
            Configuration configuration = new Configuration(Configuration.VERSION_2_3_0);
            ClassLoader loader = DemoApplication.class.getClassLoader();
            configuration.setClassLoaderForTemplateLoading(loader, "templates");
            Template template = configuration.getTemplate("mailtemplate.ftl");
            StringWriter mail = new StringWriter();
            User user = new User("strr", "女");
            template.process(user, mail);
            mailService.sendHtmlMail("",
                    "",
                    "测试邮件主题",
                    mail.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
