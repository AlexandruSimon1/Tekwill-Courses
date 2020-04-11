package TekwillCourses.HomeWork14August;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        boolean running = true;
        boolean inputIsIncorrect = true;
        char c = '0';
        while (running){
            System.out.println("a - tree          b - apple");
            System.out.println("c - car           d - game");
            System.out.println("Enter a letter:  ");
            while (inputIsIncorrect) {
                c = in.nextLine().toLowerCase().charAt(0);
                if (c == 'a' || c == 'b' || c == 'c'|| c == 'd') {
                    inputIsIncorrect = false;
                }
                else if (c =='$'){
                    inputIsIncorrect = false;
                    running = false;
                }
                else {
                    System.out.println("Input not correct");
                }
            }
            switch (c){
                case 'a':System.out.println("tree");
                break;
                case 'b':System.out.println("apple");
                break;
                case 'c':System.out.println("car");
                break;
                case 'd':System.out.println("game");
                break;
            }
            inputIsIncorrect = true;
        }
    }
}
