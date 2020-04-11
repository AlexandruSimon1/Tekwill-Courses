package TekwillCourses.WorkAtLesson.Equals;

public class Demo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Pushok", 7, "Seam");
        Cat cat2 = new Cat("Barsik", 5, "Dvorneashka");
        Cat cat3 = new Cat("Elvis", 6, "England");
        System.out.println(cat1.equals(cat1));
        System.out.println(cat2.equals(cat2));
        System.out.println(cat3.equals(cat3));

        Cat cat4 = new Cat("Pushok", 7, "Seam");
        Cat cat5 = new Cat("Pushok", 7, "Seam");
        System.out.println(cat4.equals(cat5));
        System.out.println(cat5.equals(cat4));
        Cat cat6 = new Cat("Barsik", 2, "Seam");
        Cat cat7 = new Cat("Barsik", 2, "Seam");
        Cat cat8 = new Cat("Barsik", 2, "Seam");
        System.out.println(cat6.equals(cat7));
        System.out.println(cat7.equals(cat8));
        System.out.println(cat6.equals(cat8));

        for (int i = 0; i < 10; i++) {
            System.out.println(cat7.equals(cat8));
        }
    }
}
