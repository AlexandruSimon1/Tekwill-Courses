package TekwillCourses.WorkAtLesson.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        System.out.println(strings);
        ArrayList<String> string = new ArrayList<>();
        string.add("first string");
        string.add("second string");
        string.add("forth string");
        string.add("Ecaterina");
        System.out.println(string);

        ArrayList<String> students = new ArrayList<>();
        //students.add(new Student("Alexandru"));
        //students.add(new Student("Roman"));
        //students.add(new Student("Vasile"));
        //for (Student student : students) {
        //  System.out.println(student.toString() + " ");
        //}
        System.out.println();
        Iterator<String> iterator = string.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("forth string"))
                iterator.remove();
        }
        System.out.println(string);

        ListIterator<String> listIterator = string.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().equals("second string")) {
                //   while (listIterator.hasPrevious()){
                //       System.out.println(listIterator.previous());
                // }
            }
        }
        ArrayList<StringBuilder> stringBulder = new ArrayList<>();
        stringBulder.add(new StringBuilder("Samsung"));
        stringBulder.add(new StringBuilder("Apple"));
        stringBulder.add(new StringBuilder("LG"));
        stringBulder.add(new StringBuilder("Xiaomi"));
        for (StringBuilder phone : stringBulder) {
            phone.append(" ");
            phone.append(phone.length());
        }
        System.out.println(stringBulder);
        string.remove(new Student("Ecaterina"));
        System.out.println(string);
        ArrayList<String> initialStrings = new ArrayList<>();
        initialStrings.add("First");
        initialStrings.add("Forth");
        ArrayList<String> laterAddedStrings = new ArrayList<>();
        laterAddedStrings.add("Second");
        laterAddedStrings.add("Third");
        initialStrings.addAll(laterAddedStrings);
        System.out.println(initialStrings);
        initialStrings.addAll(1,laterAddedStrings);
        System.out.println(initialStrings);
    }

}
