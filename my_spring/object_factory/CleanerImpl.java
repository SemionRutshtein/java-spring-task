package il.study.spring.my_spring.object_factory;

import lombok.SneakyThrows;

@Benchmark
public class CleanerImpl implements Cleaner {
    @InjectRandomInt(min = 1, max = 10)
    private int repeat;

    @InjectByType
    public CleanerImpl() {
        System.out.println(repeat + " -> repeat");
    }


    @SneakyThrows
    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            Thread.sleep(500);
            System.out.println("Robot in use");
        }
    }
}
