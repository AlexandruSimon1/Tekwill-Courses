package TekwillCourses.WorkAtLesson.Interface;

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb is turn on");
    }

    @Override
    public void tunrOff() {
        System.out.println("LightBulb is turn off");
    }
}
