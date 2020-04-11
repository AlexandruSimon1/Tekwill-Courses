package TekwillCourses.HomeWork23September.ArrayDemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayUtilities {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        System.out.println(colors);
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println(colors);
        ArrayList<String> otherColor = new ArrayList<>();
        otherColor.add("Purple");
        otherColor.add("Aqua");

        ListIterator<String> listIterator = colors.listIterator();
        while (listIterator.hasNext()) {
            String currentColor = listIterator.next();
            System.out.println(currentColor);
            //     if (currentColor.equals("Blue")) {
            //       colors.add("Black");
            // }
        }
        for (String color : colors) {
            System.out.println(color);
        }
        ArrayUtilitiesDemo.addElementToArrayListAtIndex(colors, "Black", 0);
        System.out.println(colors);
        ArrayUtilitiesDemo.getElementToArrayListAtIndex(colors, 2);
        ArrayUtilitiesDemo.setElementToArrayListAtIndex(colors, "Pink", 4);
        System.out.println(colors);
        ArrayUtilitiesDemo.removeElementToArrayListAtIndex(colors, 3);
        System.out.println(colors);
        ArrayUtilitiesDemo.containsElementToArrayListAtIndex(colors, "Green");
        ArrayList<String> clonedColor = ArrayUtilitiesDemo.cloneElementToArrayAtIndex(colors);
        System.out.println(clonedColor);
        ArrayUtilitiesDemo.reverseElementToArrayListAtIndex(colors);
        System.out.println(colors);
        ArrayUtilitiesDemo.extractElementToArrayListAtIndex(colors, 1, 3);

        ArrayUtilitiesDemo.swapElementToAttayListAtIndex(colors, 0, 3);
        System.out.println(colors);
        ArrayUtilitiesDemo.addNewListElementToArrayListAtIndex(colors,otherColor);
        System.out.println(colors);
        ArrayUtilitiesDemo.emptyElementToArrayListAtIndex(colors);
        System.out.println(colors);
        ArrayUtilitiesDemo.checkElementToArrayListAtIndex(colors);
    }
}
