package TekwillCourses.WorkAtLesson.HomeWork;

public class Unicorn {
    public static final String TYPE_OF_ANIMAL = "Mythic";
    private String color;
    private String name;
    private int ageInYears;

    {
        System.out.println("An unicorn is being born");
    }

    public Unicorn() {
        this("Unknown", "Unknown", 0);
    }

    {
        System.out.println("An unicorn is getting ready");
    }

    public Unicorn(String name) {
        this(name, "Pink", 1001);
    }

    public Unicorn(String name, String color, int ageInYears) {
        this.name = name;
        this.color = color;
        this.ageInYears = ageInYears;
    }

    public void fly() {
        System.out.println(name + " flying...");
    }

    public void run() {
        System.out.println(name + " running...");
    }

    public void executeSuperpower(String superpower) {
        System.out.println(name + " executing < " + superpower + " >");
    }

    public void executeSuperpower(String superpower, int numberOfTimes) {
        for (int i = 1; i <= numberOfTimes; i++) {
            executeSuperpower(superpower);
        }
    }

    public void singVerses(String... verses){
        System.out.println("Singing");
        for (int i =0;i< verses.length;i++){
            System.out.println(verses[i]+ " ");
        }
        System.out.println();
    }
    //overriding
    @Override
    public String toString() {
        return "Unicorn{ name = " + this.name + " , color = " + this.color + " , age = " + this.ageInYears + "}";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }
}
