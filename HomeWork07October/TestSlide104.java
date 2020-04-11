package TekwillCourses.HomeWork07October;

interface Interviewer {
    int MIN_SAL = 9999;

    default void sumbitInterviewerStatus() {
        System.out.println(this);
        System.out.println(this.MIN_SAL);
        System.out.println(this.print());
    }
    String print();
}

class Manager implements Interviewer {
    public String print() {
        return ("I am " + this);
    }
}

class Foo {
    public static void main(String[] args) {
        Interviewer m = new Manager();
        m.sumbitInterviewerStatus();
    }
}
