package TekwillCourses.HomeWork09October.Ships;

public class Test {
    public static void main(String[] args) {
        Ship test[]={new Ship("Mermaid","1678"),new CruiseShip("Apollo","1958",130),new CargoShip("Panamax","1968",100)};

        for (int i = 0; i <test.length ; i++) {
            System.out.println(test[i]);
        }
    }
}
