package TekwillCourses.HomeWork28August.Geometry;

import java.util.Scanner;

public class AriaOfPentagon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AreaOfPentagonMethod userEnter = new AreaOfPentagonMethod();
        userEnter.userSize();
        userEnter.side = in.nextDouble();
        userEnter.result();
    }
}
