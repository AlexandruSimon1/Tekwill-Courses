package TekwillCourses.HomeWork;

public class MotorcycleDemo {
    public static void main(String[] args) {
        Motorcycle honda=new Motorcycle("Honda "," CR ",185,99);
        Motorcycle yamaha=new Motorcycle("Star Venture");
        Motorcycle bmw=new Motorcycle();
        System.out.println(honda);
        System.out.println(yamaha);
        System.out.println(bmw);
        System.out.println(honda.TYPE_OF_BIKE);
        System.out.println(yamaha.TYPE_OF_BIKE);
        System.out.println(bmw.TYPE_OF_BIKE);
        honda.produce();
        honda.test();
        honda.produceMotorcycle("Honda");
        honda.produceMotorcycle("Honda ",10);
    }
}
