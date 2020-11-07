package il.study.spring.real_spring.core_spring_task.mails;

import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public class MailDao {
    private static Random randomNumber = new Random();
    public int getMailCode() {
        return randomNumber.nextInt(3)+1;
    }
}
