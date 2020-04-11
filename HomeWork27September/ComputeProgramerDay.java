package TekwillCourses.HomeWork27September;

import java.time.LocalDate;

public class ComputeProgramerDay {
    public static void main(String[] args) {
        LocalDate from = LocalDate.now();
        computeDate(256,from);
    }

    public static int computeDate(int day, LocalDate from) {
        int computeDay = 0;
        if (from.getDayOfYear() == day) {
            computeDay++;
            System.out.println(computeDay);
        }
        return computeDay;
    }
}
