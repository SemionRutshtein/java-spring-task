package il.study.spring.my_spring;

public class IRobot {
    private Capabilities function = new CapabilitiesImpl();

    public void cleanFunction() {
        function.speakFunction("Robot start working");
        function.cleanFunction();
        function.speakFunction("Robot stopped working");

    }

    public static void main(String[] args) {
        IRobot robot = new IRobot();
        robot.cleanFunction();
    }
}
