package il.study.spring.my_spring.object_factory;

public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    public void init(){
        System.out.println(speaker.getClass().getName());
    }

    public void cleanRoom () {
        speaker.speak("Again? Hi my little Peppa. I started...");
        cleaner.clean();
        speaker.speak("Hate this JOB!  Bye...");
    }

}
