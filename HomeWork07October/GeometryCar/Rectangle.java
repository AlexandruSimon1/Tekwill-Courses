package TekwillCourses.HomeWork07October.GeometryCar;

public class Rectangle implements Printable {
    double w;
    double h;

    public Rectangle(double w,double h){
        this.w=w;
        this.h=h;
    }

    @Override
    public void print() {
        System.out.println("Area is "+w*h);
    }
}
