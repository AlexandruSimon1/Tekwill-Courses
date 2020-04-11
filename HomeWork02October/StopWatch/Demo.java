package TekwillCourses.HomeWork02October.StopWatch;

public class Demo {
    public static void main(String[] args) {
        StopWatchUtilities stopwatch = new StopWatchUtilities();
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        stopwatch.setStartTime();

        sortSelection(array);

        stopwatch.setEndTime();
        System.out.println(stopwatch.getElapsedTime());
    }

    public static void sortSelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                array[index] = array[i];
                array[i] = min;
            }
        }
    }
}
