package TekwillCourses.HomeWork07October.GeometryCar;

public class Manager implements Printable {
    String name;
    int number;

    public Manager(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Manager name is " + name + " number " + number);
    }
}
