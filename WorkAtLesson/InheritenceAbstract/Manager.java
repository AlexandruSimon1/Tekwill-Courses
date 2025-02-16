package TekwillCourses.WorkAtLesson.InheritenceAbstract;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String address, int teamSize) {
        super(name, address);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void reportProjectStatus(){
        System.out.println("Status is ok!");
    }

    @Override
    public void work() {
        System.out.println("As a Manager working!");
        reportProjectStatus();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "teamSize=" + this.teamSize +
                ", name='" + super.name + '\'' +
                ", address='" + super.address + '\'' +
                '}';
    }

}
