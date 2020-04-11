package TekwillCourses.WorkAtLesson.Constructor;

public class Cat {
    private int age;
    private String name;
    private String breed;
    private String color;

    Cat() {
        this.age = 999;
        this.name = "Ceshire";
        this.breed = "Magic";
        this.color = "Gray/Blue";
    }

    Cat(int age, String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        if (age < 0)
            this.age = 1;
        else
            this.age = age;
    }
    {
        System.out.println("Still coming alive...");
    }
    Cat(int age, String name, String color) {
        if (age < 0)
            this.age = 1;
        else
            this.age = age;
        this.name = name;
        this.color = color;
        this.breed = "Magic";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return age + " " + name + " " + breed + " " + color;
    }
}
