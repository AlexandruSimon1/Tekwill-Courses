package TekwillCourses.WorkAtLesson.Lambda;

class ValidateName implements Validate {
    @Override
    public boolean check(Employee e) {
        return e.name.length() > 0;
    }
}
