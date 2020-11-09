package il.study.spring.real_spring.context_task.business;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class TalkingRobotImpl implements TalkingRobot {

    @Autowired
    private  List<Quoter> quoters;


    @Override
    @EventListener(ContextRefreshedEvent.class)
    @Secured
    public void talk() {
        System.out.println("Start here");
        quoters.forEach(Quoter::sayQuote);
    }
}
