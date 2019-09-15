package HomewrokSep.Sep14.AssignGrades;


import java.util.Scanner;

public class AssignGradesDemo {

    public static int[] readUserData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int students = s.nextInt();
        int scoreArray[] = new int[students];
        for (int i = 0; i < students; i++) {
            System.out.println("Enter student " + i + " score");
            int score = s.nextInt();
            scoreArray[i] = score;
        }
        return scoreArray ;
    }

    public static void computeStudentScore() {
         int ints [] = readUserData();

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] >= 90)
                System.out.println("student " + i + " score is A");

            else if (ints[i] >= 80)
                System.out.println("student " + i + " score is B");

            else if (ints[i] >= 60)
                System.out.println("student " + i + " score is C");

            else if (ints[i] >= 40)
                System.out.println("student " + i + " score is D");

            else
            System.out.println("student " + i + " score is F");
        }
    }
}
