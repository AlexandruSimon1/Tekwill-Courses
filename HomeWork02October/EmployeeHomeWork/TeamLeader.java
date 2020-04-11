package TekwillCourses.HomeWork02October.EmployeeHomeWork;

import java.time.LocalDate;

public class TeamLeader extends ProductionWorker {
    private int monthlyBonusAmount = 0;
    private int numberOfTrainings = 0;
    private int numberOfTrainingsThatAreDone = 0;

    public TeamLeader(String name, LocalDate hireDate, int shift, int hourlyPayRate, int monthlyBonusAmount, int numberOfTrainings, int numberOfTrainingsThatAreDone) {
        super(name, hireDate, shift, hourlyPayRate);
        setNumberOfTrainings(numberOfTrainings);
        setNumberOfTrainingsThatAreDone(numberOfTrainingsThatAreDone);
        if (numberOfTrainingsThatAreDone<numberOfTrainings)
            setMonthlyBonusAmount(0);
        else
        setMonthlyBonusAmount(monthlyBonusAmount*3);
    }

    public int getMonthlyBonusAmount() {
        return monthlyBonusAmount;
    }

    public void setMonthlyBonusAmount(int monthlyBonusAmount) {
            this.monthlyBonusAmount = monthlyBonusAmount;
    }

    public int getNumberOfTrainings() {
        return numberOfTrainings;
    }

    public void setNumberOfTrainings(int numberOfTrainings) {
        this.numberOfTrainings = numberOfTrainings;
    }

    public int getNumberOfTrainingsThatAreDone() {
        return numberOfTrainingsThatAreDone;
    }

    public void setNumberOfTrainingsThatAreDone(int numberOfTrainingsThatAreDone) {
        this.numberOfTrainingsThatAreDone = numberOfTrainingsThatAreDone;
    }

    @Override
    public String toString() {
        return "Team Leader{" +
                "monthly bonus amount=" + monthlyBonusAmount +
                ", number of trainings=" + numberOfTrainings +
                ", number of trainings that are done=" + numberOfTrainingsThatAreDone +
                ", name='" + name + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
