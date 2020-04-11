package TekwillCourses.HomeWork02October.EmployeeHomeWork;

import java.time.LocalDate;

public class ShiftSupervisor extends Employee {
    private int annualSalary = 0;
    private int annualProductionBonus = 0;
    private int productionGoals = 0;
    private int shift = 0;

    public ShiftSupervisor(String name, LocalDate hireDate, int shift, int annualSalary, int annualProductionBonus, int productionGoals) {
        super(name, hireDate);
        if (productionGoals < 10)
            setAnnualProductionBonus(0);
        else
            setAnnualProductionBonus(annualProductionBonus * 3);
        setAnnualSalary(annualSalary + (annualProductionBonus * 3));
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getAnnualProductionBonus() {
        return annualProductionBonus;
    }

    public void setAnnualProductionBonus(int annualProductionBonus) {
        this.annualProductionBonus = annualProductionBonus;
    }

    public int productionGoals() {
        return productionGoals;
    }

    public void setProductionGoals(int productionGoals) {
        this.productionGoals = productionGoals;
    }

    public int getShift() {
        return shift;
    }

    public void setShift() {
        if (shift > 1 || 0 < shift)
            this.shift = 0;
        else
            this.shift = shift;
    }

    @Override
    public String toString() {
        return "Shift Supervisor{" +
                "annual salary=" + annualSalary +
                ", annual production bonus=" + annualProductionBonus +
                ", name='" + name + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
