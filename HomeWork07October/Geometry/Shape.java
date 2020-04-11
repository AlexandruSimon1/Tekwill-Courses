package TekwillCourses.HomeWork07October.Geometry;

public abstract class Shape {
    public abstract double area();

    @Override
    public String toString() {
        return "The area is " + area();
    }
}
