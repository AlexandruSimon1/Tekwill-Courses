package TekwillCourses.HomeWork14August;

public class Factorials {
    public static void main (String args[]){
        Integer counter;
        long factorials = 1;
        System.out.println("Number          " + "        Factorials");
        for (counter = 1; counter <= 20;counter++, factorials *= counter) {
            System.out.printf("%4d%,30d\n", counter, factorials);
        }
    }
}
