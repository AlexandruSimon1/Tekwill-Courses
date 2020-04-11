package TekwillCourses.WorkAtLesson.InheritenceAbstract;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Manager m = new Manager("John", "Toronto", 5);
        String[] programmingLanguages = new String[]{"Java", "Groovy"};
        Programmer p = new Programmer("Mike", "New York", "Java,C++");
        Programmer p2 = new Programmer("Mike", "New York", programmingLanguages);
        Programmer p3 = new Programmer("Mike", "New York", "Java,C++");
        Programmer p4 = new Programmer("Mike", "New York", "Java,C++");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(m);
        employees.add(p);
        employees.add(p2);
        employees.add(p3);
        employees.add(p4);

        HR hr = new HR();
        hr.sendInvitation(m);
        hr.sendInvitation(p);

        for (Employee e : employees) {
            hr.sendInvitation(e);
        }
        System.out.println(m);
        System.out.println(p);
        System.out.println(p2);

    }
}
