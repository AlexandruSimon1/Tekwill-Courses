package TekwillCourses.WorkAtLesson;

public class WhileLoop {
    public static void main(String args []){
        boolean bunsAvailable=true;
        Integer totalbuns=40;
        Integer numberOfBurgers = 1;

        while (bunsAvailable){

            System.out.println("Preparing burgers " + numberOfBurgers );
            --totalbuns;
            System.out.println("Pacing the meat");
            System.out.println("Pacing the cheese");
            System.out.println("Pacing the pickles");
            System.out.println("Pacing the tomatoes");
            System.out.println("Pacing the meat");
            --totalbuns;
            System.out.println("Burger is prepared\n");
            if(totalbuns == 0)
                bunsAvailable= false;
            else
            numberOfBurgers++;
        }
        System.out.println("Prepared " + numberOfBurgers + " burgers");
    }
}
