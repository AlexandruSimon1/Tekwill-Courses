package TekwillCourses.WorkAtLesson.Inheritence;

public class HR {
    public void sendInvitation(Employee e) {
        System.out.println("Invitation sent to " + e.getName() + " at " + e.address);
    }
}
