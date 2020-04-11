package TekwillCourses.WorkAtLesson.Interface;
class Radio implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Radio is turn on");
    }

    @Override
    public void tunrOff() {
        System.out.println("Radio is turn off");
    }
}
