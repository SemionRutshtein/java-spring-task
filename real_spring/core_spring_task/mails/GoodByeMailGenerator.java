package il.study.spring.real_spring.core_spring_task.mails;

import org.springframework.stereotype.Component;

@Component
public class GoodByeMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        return "<HTML> GOOD BYE CLASS have not problem</HTML>";
    }

    @Override
    public int mailCode() {
        return 3;
    }
}
