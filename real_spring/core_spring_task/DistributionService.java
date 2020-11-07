package il.study.spring.real_spring.core_spring_task;

import il.study.spring.real_spring.core_spring_task.mails.MailDao;
import il.study.spring.real_spring.core_spring_task.mails.MailGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class DistributionService {

    @Autowired
    private Map<Integer, MailGenerator> map;

    @Autowired
    private MailDao mailDao;

    @Scheduled(fixedDelay = 500)
    public void sendMail () {
        int mailCode = mailDao.getMailCode();
        MailGenerator mailGenerator = map.get(mailCode);
        if(mailGenerator == null) {
            throw new UnsupportedOperationException(mailCode + "not supported");
        }
        String html = mailGenerator.generateMail();
        send(html);
    }

    private void send(String html) {
        System.out.println("html" + html);
    }
}
