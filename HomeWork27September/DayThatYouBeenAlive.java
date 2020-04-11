package TekwillCourses.HomeWork27September;

import java.time.LocalDate;

public class DayThatYouBeenAlive {
    public static void main(String[] args) {
        LocalDate from = LocalDate.of(1990, 4, 21);
        LocalDate to = LocalDate.now();
        birthDate(from,to);
    }
    public static int birthDate(LocalDate from,LocalDate to){
        int daysBirth=0;
        while (!from.isEqual(to)) {
            if (from.getDayOfYear() <= to.getDayOfYear()) {
                daysBirth++;
                System.out.println(daysBirth);
            }
            to=to.minusDays(1);
        }
        return daysBirth;
    }
}
