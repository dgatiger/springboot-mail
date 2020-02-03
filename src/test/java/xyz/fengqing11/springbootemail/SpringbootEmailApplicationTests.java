package xyz.fengqing11.springbootemail;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootEmailApplicationTests {
    @Autowired
    MailService mailService;

    @Test
    public void sendSimpleMail() {
        mailService.sendSimpleMail("572873201@qq.com", "572873201@qq.com",
                "572873201@qq.com", "测试邮件主题", "测试邮件内容");
    }

}
