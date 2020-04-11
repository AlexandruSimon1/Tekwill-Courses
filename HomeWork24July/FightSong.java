public class FightSong {
    public static void main(String args[]){
        song2();
        song4();
        song4();
        song1();
    }
    public static void song1() {
        System.out.println("Go, team, go!");
        System.out.println("You can do it.");
    }
    public static void song2() {
        song1();
        System.out.println();
    }
    public static void song3() {
        System.out.println("You're the best,");
        System.out.println("In the West.");
    }
    public static void song4() {
        song1();
        song3();
        song2();
    }
}