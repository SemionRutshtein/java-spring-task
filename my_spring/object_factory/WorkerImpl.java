package il.study.spring.my_spring.object_factory;

public class WorkerImpl implements Worker {
    @Benchmark
    @Override
    public void work() {
        System.out.println("Working");
    }

    @Override
    public void drinkBeer() {
        System.out.println("Drink Beer always good");
    }
}
