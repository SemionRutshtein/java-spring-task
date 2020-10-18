package il.study.spring.radio_clock_task;

public class RadioImpl implements Radio {
    @Override
    public void setChannel() {
        System.out.println("Channel was set");
    }

    @Override
    public void setVolume() {
        System.out.println("Volume was set");
    }
}
