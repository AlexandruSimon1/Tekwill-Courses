package TekwillCourses.WorkAtLesson.HomeWork;

public class Laptops {
    public static final String LAPTOP = "NoteBook";
    private String brand;
    private int memory;
    private String proccesor;
    private String model;

    {
        System.out.println("The new laptop is manufactured");
    }

    public Laptops() {
        this("Lenovo", "G530", 500, "i3-6100U");
    }

    public Laptops(String model) {
        this("Lenovo", model, 500, "i5-6300U");
    }

    public Laptops(String brand, String model, int memory, String proccesor) {
        this.brand = brand;
        this.model = model;
        this.memory = memory;
        this.proccesor = proccesor;
    }

    public void produce() {
        System.out.println(brand + " start producing");
    }

    public void tested() {
        System.out.println(brand + " start the testing of the device");
    }

    public void produceLaptops(String laptop) {
        System.out.println(brand + " producing " + laptop);
    }

    public void produceLaptops(String laptop, int numberOfLaptops) {
        for (int i = 1; i <= numberOfLaptops; i++) {
            produceLaptops(laptop);
        }
    }

    public String toString() {
        return LAPTOP + " the brand " + this.brand + " the model " + this.model + " memory " + this.memory + " GB " + this.proccesor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getProccesor() {
        return proccesor;
    }

    public void setProccesor(String proccesor) {
        this.proccesor = proccesor;
    }
}
