package il.study.spring.my_spring.object_factory;

public class Main {
    public static void main(String[] args) {
//        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
//        iRobot.cleanRoom();

        Worker worker = ObjectFactory.getInstance().createObject(Worker.class);
        worker.drinkBeer();
        worker.work();
    }
}
