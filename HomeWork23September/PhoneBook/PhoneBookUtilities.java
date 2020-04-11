package TekwillCourses.HomeWork23September.PhoneBook;

import java.util.ArrayList;

public class PhoneBookUtilities {

    public static void main(String[] args) {
        ArrayList<PhoneBookEntry> phoneBookEntries = new ArrayList<>();
        phoneBookEntries.add(new PhoneBookEntry("Alex", "+373-68-31-33-36"));
        phoneBookEntries.add(new PhoneBookEntry("Ion", "+373-68-65-67-68"));
        phoneBookEntries.add(new PhoneBookEntry("Valentin", "+373-69-19-41-92"));
        phoneBookEntries.add(new PhoneBookEntry("Grigore", "+373-68-69-62-63"));

        PhoneBookEntry p1 = new PhoneBookEntry("Alex", "+373-68-31-33-36");
        PhoneBookEntry p2 = new PhoneBookEntry("Ion","+373-68-65-67-68");
        PhoneBookEntry p3=new PhoneBookEntry("","");
        System.out.println(p1.equals(p2));
    }
}
