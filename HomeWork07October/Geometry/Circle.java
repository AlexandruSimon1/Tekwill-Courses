package TekwillCourses.HomeWork07October.Geometry;

public class Circle extends Shape {
    double area;

    public Circle(double area) {
        this.area = area;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(area,2);
    }
}
