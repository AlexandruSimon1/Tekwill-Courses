package TekwillCourses.HomeWork09October.Ships;

public class CargoShip extends Ship {
    int tonnage;

    CargoShip(String name, String year, int tonnage) {
        super(name, year);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "CargoShip{" +
                "tonnage=" + tonnage +
                ", name='" + name + '\'' +
                '}';
    }
}
