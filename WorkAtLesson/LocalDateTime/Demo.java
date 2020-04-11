package TekwillCourses.WorkAtLesson.LocalDateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Demo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 12, 27);
        LocalDate date1 = LocalDate.of(2019, Month.DECEMBER, 25);
        LocalDate date2 = LocalDate.parse("19/12/12", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate sevenWeeksBeforeTodayDate = LocalDate.now().minusWeeks(7).minusDays(3);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfWeek().getValue());
        System.out.println(date.getMonth());
        System.out.println(date.getMonth().getValue());

        Period period = Period.of(1, 2, 3);
        Period period2 = Period.ofDays(3);
        Period period1 = Period.parse("P5Y7M");

        System.out.println(period);
        System.out.println(period1);
        System.out.println(period2);
    }
}
