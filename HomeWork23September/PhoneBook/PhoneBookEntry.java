package TekwillCourses.HomeWork23September.PhoneBook;

import java.util.Objects;

public class PhoneBookEntry {
    private String name;
    private String number;


    @Override
    public String toString() {
        return "PhoneBook name= " + name + " phone number " + number;
    }

    PhoneBookEntry(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object instanceof PhoneBookEntry) {
            PhoneBookEntry that = (PhoneBookEntry) object;
            return this.name.equals(that.name) && this.number.equals(that.number);
        } else
            return false;
    }

    //  public int hashCode() {
    //      int hash = 7;
    //      hash = 31 * hash + name.hashCode();
    //      hash = 31 * hash + number.hashCode();
    //      return hash;
    //  }
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
