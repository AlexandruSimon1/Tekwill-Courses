package TekwillCourses.HomeWork07October.PersonalOfTheCompany;

public class Clerk extends Employee {

    public Clerk(String name,double age,double hourRate){
        this.age=age;
        this.name=name;
        this.hourRate=hourRate;
    }

    @Override
    public double salary(double hours) {
        return hours;
    }
}
