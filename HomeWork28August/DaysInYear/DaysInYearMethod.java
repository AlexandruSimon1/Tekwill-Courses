package TekwillCourses.HomeWork28August.DaysInYear;

public class DaysInYearMethod {

    public void result() {
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "       " + numberOfDays(year));
        }
    }

    public static int numberOfDays(int year) {
        if (leapYear(year))
            return 366;
        else
            return 365;
    }

    public static boolean leapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
