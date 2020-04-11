package TekwillCourses.HomeWork07October.Geometry;

public class Rectangle extends Shape {
    double w;
    double h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return w * h;
    }
}
