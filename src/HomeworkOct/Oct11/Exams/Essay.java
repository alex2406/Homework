package HomeworkOct.Oct11.Exams;

public class Essay extends GradeActivity {
    private final int maxPoints = 100;
    private int grammar;
    private int spelling;
    private int correctLength;
    private int content;

    public Essay(int grammar, int spelling, int correctLength, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.correctLength = correctLength;
        this.content = content;
    }

    @Override
    public double getScore() {
        return super.getScore();
    }

    @Override
    public void setScore(double score) {
        score = getContent()+getGrammar()+getCorrectLength()+getSpelling();
        super.setScore(score);
    }

    @Override
    public char getGrade() {
        return super.getGrade();
    }
    public int getMaxPoints() {
        return maxPoints;
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



}
