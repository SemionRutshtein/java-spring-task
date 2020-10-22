package il.study.spring.my_spring.object_factory;

public class CleanerImpl implements Cleaner {

    @Override
    public void clean() {
        System.out.println("Robot in use");
    }
}
