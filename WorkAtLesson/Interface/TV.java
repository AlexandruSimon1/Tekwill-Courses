package TekwillCourses.WorkAtLesson.Interface;

class TV implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("TV is turn on");
    }

    @Override
    public void tunrOff() {
        System.out.println("TV is turn off");
    }
}
