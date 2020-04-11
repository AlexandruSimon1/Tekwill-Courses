package TekwillCourses.HomeWork19August;

public class CancellationError {
    public static void main(String[] args) {
        double sumLeftRight = 0.0;
        for ( double n = 1.0 ; n <=50000.0 ; n++){
            sumLeftRight +=1/n;
        }
        System.out.println("Sum series from left to right " + sumLeftRight);
        double sumRightLeft = 0.0;
        for (double n = 50000.0 ; n >= 1 ; n--){
            sumRightLeft += 1/n;
        }
        System.out.println("Sum series from right to left " + sumRightLeft);
        System.out.println("Sum series from left to right -" + " Sum series from right to left " + (sumRightLeft - sumLeftRight));
    }
}
