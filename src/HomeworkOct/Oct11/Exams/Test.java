package HomeworkOct.Oct11.Exams;

public class Test {
    public static void main(String[] args) {
        GradeActivity  essays [] = {new Essay(30,20,20,30)};

        for (int i = 0; i <essays.length ; i++) {
            System.out.println(essays[i].getGrade());
        }
    }
}
