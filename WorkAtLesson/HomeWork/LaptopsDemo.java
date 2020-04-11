package TekwillCourses.WorkAtLesson.HomeWork;

public class LaptopsDemo {
    public static void main(String[] args) {
        Laptops dell=new Laptops("Dell","G3",1000,"N3300");
        Laptops lenovo = new Laptops("B530");
        Laptops lenovo1 = new Laptops();
        System.out.println(dell);
        System.out.println(lenovo);
        System.out.println(lenovo1);
        System.out.println(dell.LAPTOP);
        System.out.println(lenovo.LAPTOP);
        System.out.println(lenovo1.LAPTOP);
        dell.produce();
        dell.tested();
        dell.produceLaptops("G500");
        dell.produceLaptops("G530",5);

    }
}
