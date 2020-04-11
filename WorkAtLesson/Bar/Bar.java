package TekwillCourses.WorkAtLesson.Bar;

public class Bar {
    private Integer foo = 15;
    static String text = " ";

    public Integer getFoo() {
        return foo;
    }

    public void setFoo(Integer foo) {
        this.foo = foo;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, int b) {
        return a + b;
    }

    public static double getAverage(short a, short b) {
        return (a + b) / 2.0;
    }

    public static double getAverage(byte a, byte b, byte c) {
        return (a + b + c) / 3.0;
    }

    public static double getAverage(double... values) {
        double result = 0;
        for (int i = 0; i < values.length; i++){
            result +=values[i];
        }
        return result/values.length;
    }
}
