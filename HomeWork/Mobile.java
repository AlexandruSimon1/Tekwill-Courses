package TekwillCourses.HomeWork;

public class Mobile {
    public static final String TYPE_OF_MOBILE = "Smartphones";
    public String brand;
    public String model;
    public int memory;
    public int power;

    {
        System.out.println("Mobile phone is manufactured");
    }

    public Mobile() {
        this("Samsung", "i-9500", 64, 3500);
    }

    public Mobile(String model) {
        this("Lenovo", model, 128, 3000);
    }

    public Mobile(String brand, String model, int memory, int power) {
        this.brand = brand;
        this.model = model;
        this.memory = memory;
        this.power = power;
    }

    public void produce() {
        System.out.println("Work started and the phones are in producing");
    }

    public void test() {
        System.out.println("Tester are testing if everything is working");
    }

    public void producePhone(String phone) {
        System.out.println(TYPE_OF_MOBILE + " for this company " + brand + " start manufactured " + phone);
    }

    public void producePhone(String phone, int numberofTimes) {
        for (int i = 1; i <= numberofTimes; i++) {
            producePhone(phone);
        }
    }

    public String toString() {
        return TYPE_OF_MOBILE + " the brand " + this.brand + " the model " + this.memory + " memory " + this.power;
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

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
