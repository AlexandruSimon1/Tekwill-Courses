package TekwillCourses.WorkAtLesson.HomeWork;


public class Cars {
    public static final String CAR = "Automobile";
    private int age;
    private double power;
    private String transmision;
    private String brand = "Unknown";
    private String model;
    private String color;

    {
        System.out.println(brand + " is being manufactured");
    }


    Cars() {
        this(2005, 2.4, "Automatic", "Toyota", "Avensis", "Blue");
    }

    Cars(String brand, String model) {
        this(2005, 2.4, "Automatic", brand, model, "Yellow");
    }

    Cars(int age, double power, String transmision, String brand, String model, String color) {
        this.power = power;
        this.transmision = transmision;
        this.brand = brand;
        this.model = model;
        this.color = color;
        if (age < 0)
            this.age = 1;
        else
            this.age = age;

    }

    public void workers() {
        System.out.println("Workers produce the " + brand);
    }

    public void boss() {
        System.out.println("Managers is checking if the " + brand + " is done accordingly the company policy");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return age + " " + power + " " + transmision + " " + brand + " " + model + " " + color;
    }
}
