package il.study.spring.my_spring;

public class CapabilitiesImpl implements Capabilities {

    @Override
    public void speakFunction(String str) {
        System.out.println(str);
    }

    @Override
    public void cleanFunction() {
        System.out.println("Clean logic");
    }
}
