package TekwillCourses.WorkAtLesson.ObjectReference;

public class PersonWrapper {
    Person p;
    PersonWrapper(Person person){
        p=person;
    }
    public Person getPerson(){
        return p;
    }
    public void setP(Person person){
        this.p=p;
    }
}
