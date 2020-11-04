package il.study.spring.real_spring.post_processor_task;

import il.study.spring.my_spring.object_factory.InjectRandomInt;

public class TronsGamesImpl implements GamesOfTronsPersons {
    @InjectRandomInt(min = 1, max = 5)
    private int repeat;
    private String message;


    @Override
    public void sayName() {
        for (int i = 0; i < repeat; i++) {
        System.out.println(message);
        }
    }
}
