package TekwillCourses.HomeWork11October.Exam;

public class PassFailActivity extends GradedActivity {
    private double minPassingScore;

    public PassFailActivity(double mps) {
        minPassingScore = mps;
    }

    @Override
    public char getGrade() {
        char letterGrade;
        if (super.getGrade() >= minPassingScore)
            letterGrade = 'P';
        else
            letterGrade = 'F';
        return letterGrade;
    }
}
