package TekwillCourses.HomeWork02October.EmployeeHomeWork;

import java.time.LocalDate;

class ProductionWorker extends Employee {
    private int shift = 0;
    private int hourlyPayRate;

    public ProductionWorker(String name, LocalDate hireDate, int shift, int hourlyPayRate) {
        super(name, hireDate);
        setShift(shift);
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        if (shift > 1 || shift < 0)
            this.shift = 0;
        else
            this.shift = shift;
    }

    public int getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(int hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "ProductionWorker{" +
                "shift=" + shift +
                ", hourlyPayRate=" + hourlyPayRate +
                ", name='" + name + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
