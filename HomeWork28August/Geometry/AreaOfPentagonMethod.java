package TekwillCourses.HomeWork28August.Geometry;

public class AreaOfPentagonMethod {
    double side = 0;

    public void userSize() {
        System.out.println("Enter the side :");
    }

    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }

    public void result() {
        System.out.println("The area of the pentagon is " + area(side));
    }
}
