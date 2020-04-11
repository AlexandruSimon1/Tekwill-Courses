package TekwillCourses.HomeWork07October.GeometryCar;

public class SportCar implements Printable {
    String name;
    int number;

    public SportCar(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("The name of the brand is " + name + " number " + number);
    }
}
