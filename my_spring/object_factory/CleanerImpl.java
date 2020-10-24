package il.study.spring.my_spring.object_factory;

public class CleanerImpl implements Cleaner {
    @InjectRandomInt(min = 7, max = 10)
    private int repeat;

    public CleanerImpl() {
        System.out.println(repeat + " -> repeat");
    }

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Robot in use");
        }
    }
}
