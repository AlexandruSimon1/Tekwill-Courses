package TekwillCourses.HomeWork;

public class Motorcycle {
    public static final String TYPE_OF_BIKE = "Motorcycle";
    public String brand;
    public String model;
    public int speed;
    public int power;

    {
        System.out.println("Motorcycle is started to be manufactured");
    }

    public Motorcycle() {
        this("Yamaha", " VMAX", 180, 102);
    }

    public Motorcycle(String model) {
        this("Yamaha ", model, 170, 110);
    }

    public Motorcycle(String brand, String model, int speed, int power) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.power = power;
    }

    public void produce() {
        System.out.println(TYPE_OF_BIKE + " workers started to work on the motorcycle");
    }

    public void test() {
        System.out.println(TYPE_OF_BIKE + " managers started to test if everything was done by the rules");
    }

    public void produceMotorcycle(String motorcycle) {
        System.out.println(TYPE_OF_BIKE + " started manufactured this brand " + motorcycle);
    }

    public void produceMotorcycle(String motorcycle, int numberOfTimes) {
        for (int i = 1; i <= numberOfTimes; i++) {
            produceMotorcycle(motorcycle);
        }
    }

    public String toString() {
        return TYPE_OF_BIKE + " brand " + this.brand + " model " + this.model + " speed " + speed + " km/h     power" + this.power;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
