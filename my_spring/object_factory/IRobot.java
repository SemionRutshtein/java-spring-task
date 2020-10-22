package il.study.spring.my_spring.object_factory;

public class IRobot {

    private Speaker speaker = ObjectFactory.getInstance().createObject(Speaker.class);
    private Cleaner cleaner = ObjectFactory.getInstance().createObject(Cleaner.class);


    public void cleanRoom () {
        speaker.speak("Again? Hi my little Peppa. I started...");
        cleaner.clean();
        speaker.speak("Hate this JOB!  Bye...");
    }

}
