package TekwillCourses.WorkAtLesson.Interface;

public class ArrayDemo {
    public static void main(String[] args) {
        LightBulb b = new LightBulb();
        TV tv = new TV();
        Radio r = new Radio();

        Switchable radio = new Radio();
        Switchable tv1 = new TV();
        Switchable lightBulb = new LightBulb();

        Startable microwave = new Microwave();
        Startable washMachine = new WashMachine();

        Switchable[] allDevices = new Switchable[]{radio, tv1, lightBulb};
        Startable[] allStartableDevices = new Startable[]{microwave, washMachine};
        for (int i = 0; i < allDevices.length; i++) {
            allDevices[i].turnOn();
            allDevices[i].tunrOff();
        }
        for (int i=0;i<allStartableDevices.length;i++){
            allStartableDevices[i].start();
            allStartableDevices[i].stop();
        }
        Hatchback h= new Hatchback();


        Object[]allWeirdUnrelatedObjects=new Object[]{radio,tv,h,microwave};


        int[]first=new int[17];
        ArrayUtilities.intializeElementsFiveByFive(first,8);
        for (int number: first){
            System.out.print(number+" ");
        }
    }
}
