package TekwillCourses.WorkAtLesson.Enum;

enum IceCream {
    VANILLA("white"), STRAWBERRY("pink");
    private String color;

    IceCream(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.name() + " / " + this.color;
    }
}
