package TekwillCourses.WorkAtLesson.Polymorphism;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void walk() {
        System.out.println("Leaving cat's footprints...");
    }

    public void annoyingPeople() {
        System.out.println("Annoying people");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
