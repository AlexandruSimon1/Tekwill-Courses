package TekwillCourses.HomeWork23August.BarChart;

public class BarChartMethod {
    public int number (int bar){
        int result = 0;
        for (int i =0;i <bar;i++){
            result -= i%100;
        }
        return result;
    }
}
