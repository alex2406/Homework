package HomeworkOct.Oct11.School;

public class Student {
    private String name;
    private double averageGrade;
    private Mentor mentor;

    public Student(String name, double averageGrade, Mentor mentor) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.mentor = mentor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", mentor=" + mentor +
                '}';
    }
}
