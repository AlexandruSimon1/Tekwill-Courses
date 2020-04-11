package TekwillCourses.HomeWork19August;

public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0;
        double value = 10000.0;
        for (double n = 1;n <= (2*value-1); n +=2){
            sum += 1/n;
            n +=2;
            sum -= 1/n;
        }
        double pi = 4 * sum;
        System.out.println("Value PI for 10000 " + pi);

        sum = 0.0;
        value = 20000.0;
        for (double n = 1;n <= (2*value-1); n +=2){
            sum += 1/n;
            n +=2;
            sum -= 1/n;
        }
        pi = 4 * sum;
        System.out.println("Value PI for 20000 " + pi);
        sum = 0.0;
        value = 100000.0;
        for (double n = 1;n <= (2*value-1); n +=2){
            sum += 1/n;
            n +=2;
            sum -= 1/n;
        }
        pi = 4 * sum;
        System.out.println("Value PI for 100000 " + pi);
    }
}
