package TekwillCourses.HomeWork02October.EmployeeHomeWork;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Employee e = new Employee("Mike");
        Employee e1 = new Employee("Mike", "123-B", LocalDate.now());
        Employee e21 = new Employee("Mike", "123-BHHH", LocalDate.now());
        Employee e22 = new Employee("Mike", "123-Z", LocalDate.now());
        Employee e23 = new Employee("Mike", "123#B", LocalDate.now());
        Employee e24 = new Employee("Mike", "1B3-A", LocalDate.now());
        System.out.println(e);
        System.out.println(e1);
        System.out.println(e21);
        System.out.println(e22);
        System.out.println(e23);
        System.out.println(e24);

        Employee em = new ProductionWorker("John", LocalDate.now(), 0, 8);
        System.out.println(em);

        Employee me = new ShiftSupervisor("Alex", LocalDate.now(), 15, 1000, 100,9);
        System.out.println(me);

        Employee ne = new TeamLeader("John", LocalDate.now(), 10, 12, 100, 30, 25);
        System.out.println(ne);
    }
}
