package il.study.spring.friday_day_task;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class UnluckyFriday {

    public static void printUnluckyFridayDays (int first, int last) {
        LocalDate startDate = LocalDate.of(first, 1, 13);
        LocalDate endDate = LocalDate.of(last, 12,14);
        Stream.iterate(startDate, localDate -> localDate.plusMonths(1))
            .limit(ChronoUnit.MONTHS.between(startDate, endDate))
            .filter(localDate -> localDate.getDayOfWeek() == DayOfWeek.FRIDAY)
            .collect(groupingBy(LocalDate::getYear, counting()))
            .entrySet()
                .stream()
                .sorted(((o1, o2) -> (int) (o2.getValue() - o1.getValue())))
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
        printUnluckyFridayDays(2005, 2020);
    }
}
