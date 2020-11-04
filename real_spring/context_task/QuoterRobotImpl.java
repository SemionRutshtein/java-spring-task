package il.study.spring.real_spring.context_task;

import lombok.Data;

import javax.annotation.PostConstruct;
import java.util.List;

@Data
public class QuoterRobotImpl implements QuoterRobot {

    private List<Quoter> quoters;

    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}
