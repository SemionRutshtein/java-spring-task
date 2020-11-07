package il.study.spring.real_spring.core_spring_task.mails;


import org.springframework.stereotype.Component;

@Component
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        return "<HTML> some frontend code from EMAIL CLASS to you work </HTML>";
    }

    @Override
    public int mailCode() {
        return 2;
    }
}
