package il.study.spring.radio_clock_task;

public class RadioClock implements Radio, AlarmClock{
    @Override
    public void setChannel() {
        System.out.println("Channel was set");
    }

    @Override
    public void setVolume() {
        System.out.println("Volume was set");

    }
    @Override
    public void setAlarmTime() {
        System.out.println("set alarm time");
    }

    @Override
    public void stopAlarmTime() {
        System.out.println("set alarm time");
    }
}
