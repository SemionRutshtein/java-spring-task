package il.study.spring.real_spring.core_spring_task.mails;


import org.springframework.stereotype.Component;

@Component
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        return "<HTML> WELCOME CLASS </HTML>";
    }

    @Override
    public int mailCode() {
        return 1;
    }
}
