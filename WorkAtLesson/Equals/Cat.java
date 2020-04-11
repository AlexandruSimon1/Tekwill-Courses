package TekwillCourses.WorkAtLesson.Equals;

public class Cat {
    private String name;
    private int age;
    private String breed;

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object instanceof Cat) {
            Cat that = (Cat) object;
            return this.name.equals(that.name) && this.age == that.age && this.breed.equals(that.breed);
        } else {
            return false;
        }
    }
}
