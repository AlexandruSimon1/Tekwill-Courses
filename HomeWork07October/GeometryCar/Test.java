package TekwillCourses.HomeWork07October.GeometryCar;

public class Test {
    public static void main(String[] args) {
        Printable vec[] = {new Rectangle(200, 100), new SportCar("Fiat", 7892321), new Rectangle(34, 32), new Manager("Gidi", 32),
                new Rectangle(54, 10), new SportCar("Audi", 4322344), new SportCar("Mazda", 432243), new Manager("Moshe", 2344322)};
        for (int index = 0; index < vec.length; index++) {
            vec[index].print();
        }
    }
}
