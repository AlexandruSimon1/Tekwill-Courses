package TekwillCourses.HomeWork02August;

public class ParticularStatic {
    static int staticVariable= 25;
    int instanceVariable=3;
    public static void main(String args[]){
        ParticularStatic a= new ParticularStatic();
        ParticularStatic b= new ParticularStatic();
        ParticularStatic c= new ParticularStatic();
        ParticularStatic d= new ParticularStatic();
        System.out.println(" Static Variable without changes");
        System.out.print(" " + a.staticVariable);
        System.out.print(" " + b.staticVariable);
        System.out.print(" " + c.staticVariable);
        System.out.print(" " + d.staticVariable);
        System.out.println(" Instance Variable without changes");
        System.out.print(" " + a.instanceVariable);
        System.out.print(" " + b.instanceVariable);
        System.out.print(" " + c.instanceVariable);
        System.out.print(" " + d.instanceVariable);

        a.staticVariable = 15;
        System.out.println(" Static Variable with changes");
        System.out.print(" " + a.staticVariable);
        System.out.print(" " + b.staticVariable);
        System.out.print(" " + c.staticVariable);
        System.out.print(" " + d.staticVariable);
        a.instanceVariable = 5;
        d.instanceVariable = 7;
        System.out.println(" Instance Variable without changes");
        System.out.print(" " + a.instanceVariable);
        System.out.print(" " + b.instanceVariable);
        System.out.print(" " + c.instanceVariable);
        System.out.print(" " + d.instanceVariable);
    }
}
