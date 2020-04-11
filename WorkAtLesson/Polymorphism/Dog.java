package TekwillCourses.WorkAtLesson.Polymorphism;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof,Woof!");
    }

    @Override
    public void walk() {
        System.out.println("Leaving dog's footprints....");
    }

    public void lovePeople() {
        System.out.println("Love people");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
