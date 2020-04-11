package TekwillCourses.HomeWork11October.Exam;

public class Essay extends GradedActivity {
    private int grammar;
    private int spelling;
    private int correctLength;
    private int content;

    Essay() {
        grammar = 0;
        spelling = 0;
        correctLength = 0;
        content = 0;
    }

    Essay(int grammarScore, int spellingScore, int correctLengthScore, int contentScore) {
        grammar = grammarScore;
        spelling = spellingScore;
        correctLength = correctLengthScore;
        content = contentScore;
    }

    public int getGrammarScore() {
        return grammar;
    }

    public int getSpellingScore() {
        return spelling;
    }

    public int getCorrectLengthScore() {
        return correctLength;
    }

    public int getContentScore() {
        return content;
    }

    public double getScore() {
        return grammar + spelling + correctLength + content;
    }

    public int getGrammar() {
        return grammar;
    }

    public void setGrammar(int grammar) {
        this.grammar = grammar;
    }

    public int getSpelling() {
        return spelling;
    }

    public void setSpelling(int spelling) {
        this.spelling = spelling;
    }

    public int getCorrectLength() {
        return correctLength;
    }

    public void setCorrectLength(int correctLength) {
        this.correctLength = correctLength;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Essay{" +
                "grammar=" + grammar +
                ", spelling=" + spelling +
                ", correctLength=" + correctLength +
                ", content=" + content +
                ", score=" + score +
                '}';
    }
}
