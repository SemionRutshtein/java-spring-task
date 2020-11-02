package il.study.spring.real_spring.context_task;

import lombok.Data;

import java.util.List;

@Data
public class QuoterRobotImpl implements QuoterRobot {

    List<Quoter> quoters;

    @Override
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}
