package TekwillCourses.HomeWork23September.ArrayDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtilitiesDemo {
    public static void addElementToArrayListAtIndex(ArrayList<String> arrayList, String element, int indexAt) {
        arrayList.add(indexAt, element);
    }

    public static void getElementToArrayListAtIndex(ArrayList<String> arrayList, int indexAt) {
        arrayList.get(indexAt);
    }

    public static void setElementToArrayListAtIndex(ArrayList<String> arrayList, String element, int indexAt) {
        arrayList.set(indexAt, element);
    }

    public static void removeElementToArrayListAtIndex(ArrayList<String> arrayList, int indexAt) {
        arrayList.remove(indexAt);
    }

    public static void containsElementToArrayListAtIndex(ArrayList<String> arrayList, String element) {
        arrayList.contains(element);
    }

    public static ArrayList<String> cloneElementToArrayAtIndex(ArrayList<String> arrayList) {
        return (ArrayList<String>) arrayList.clone();
    }

    public static void reverseElementToArrayListAtIndex(ArrayList<String> arrayList) {
        Collections.reverse(arrayList);
    }

    public static void extractElementToArrayListAtIndex(ArrayList<String> arrayList, int indexAt, int indexAt2) {
        arrayList.subList(indexAt, indexAt2);
    }

    public static void swapElementToAttayListAtIndex(ArrayList<String> arrayList, int indexAt, int indexAt2) {
        Collections.swap(arrayList, indexAt, indexAt2);
    }

    public static void addNewListElementToArrayListAtIndex(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        arrayList.addAll(arrayList2);
    }

    public static void emptyElementToArrayListAtIndex(ArrayList<String> arrayList) {
        arrayList.clear();
    }

    public static void checkElementToArrayListAtIndex(ArrayList<String> arrayList) {
        boolean check = arrayList.isEmpty();
        if (check == true)
            System.out.println("Array is empty");
        else
            System.out.println("Array is not empty");
    }
}
