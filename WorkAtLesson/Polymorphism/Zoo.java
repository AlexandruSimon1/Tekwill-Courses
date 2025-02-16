package TekwillCourses.WorkAtLesson.Polymorphism;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Animal a = new Cat("Cheshire");
        Animal b = new Dog("K9");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(a);
        animals.add(b);

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.walk();
        }
        a.makeNoise();
        b.walk();
    }
}
