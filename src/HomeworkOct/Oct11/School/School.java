package HomeworkOct.Oct11.School;

import java.util.ArrayList;
import java.util.function.Predicate;

public class School {
    public static void main(String[] args) {
        Mentor mathsMentor = new Mentor("Pythagoras", "Maths");
        Mentor geographyMentor = new Mentor("Columb", "Geography");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 7.8, mathsMentor));
        students.add(new Student("Joshua", 5.7, mathsMentor));
        students.add(new Student("George", 9.9, geographyMentor));
        students.add(new Student("Neils", 8.7, geographyMentor));
        students.add(new Student("Alex", 8.1, mathsMentor));
        students.add(new Student("Abraham", 6.3, geographyMentor));
        students.add(new Student("Lincoln", 5.2, mathsMentor));

        System.out.println();
        System.out.println("Students with grades bigger than 8.0");
        filter(students, e -> e.getAverageGrade() > 8.0);
        System.out.println();
        System.out.println("Students with grades smaller than 8.0");
        filter(students, e -> e.getAverageGrade() < 8.0);
        System.out.println();
        System.out.println("Students with names bigger than 5");
        filter(students, e -> e.getName().length() > 5);
        System.out.println();
        System.out.println("Students with names start J");
        filter(students, e -> e.getName().startsWith("J"));
        System.out.println();
        System.out.println("Math mentor");
        filter(students,e->e.getMentor().equals(mathsMentor));
        System.out.println();
        System.out.println("Geography mentor");
        filter(students,e->e.getMentor().equals(geographyMentor));
    }

    private static void filter(ArrayList<Student> students, Predicate<Student> validator) {
        for (Student student : students) {
            if (validator.test(student))
                System.out.println(student);
        }
    }
}
