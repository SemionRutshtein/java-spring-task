package il.study.spring.radio_clock_task;

import lombok.AllArgsConstructor;
import lombok.experimental.Delegate;

@AllArgsConstructor
public class RadioClock implements Radio, AlarmClock{

    @Delegate
    private Radio radio = new RadioImpl();

    @Delegate(excludes = AlarmClockExclusions.class)
    private AlarmClock alarmClock = new AlarmClockImpl();

    @Override()
    public void stopAlarmTime() {
        System.out.println("set alarm time");
    }

}
