package TekwillCourses.HomeWork23August.UpperLetters;

public class UpperLetterMethod {
    static int upperLetters(String a){
        int upperCases = 0;
        for (int i =0 ; i< a.length();i++){
            if (Character.isUpperCase(a.charAt(i))){
                upperCases ++;
            }
        }
        return upperCases;
    }
}
