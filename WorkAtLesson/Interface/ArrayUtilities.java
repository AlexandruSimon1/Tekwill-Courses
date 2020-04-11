package TekwillCourses.WorkAtLesson.Interface;

public class ArrayUtilities {
    static void intializeElementsFiveByFive(int[] array,int variableToInitialize) {
        if (array.length < 5) {
            System.out.println("array lenght is to short");
        } else {
            for (int i = 0; i < array.length / 5; i++) {
                for (int j = i * 5; j < (i * 5) + 5; j++){
                    array[j]=variableToInitialize;
                }
            }
        }
    }
}
