package HomeworkOct.Oct6.Office;

public class Office {
    public static void main(String[] args) {

        Employee vec[] = {new Manager("Moshe", 52, 104),
                new Clerk("Daniel", 26, 110),
                new Manager("Ramy", 42, 110),
                new Manager("Ronen", 34, 120)};

        double hours[] = {140, 150, 130, 180};
        double total = 0;

        for (int i = 0; i < vec.length; i++) {
            total += vec[i].salary(hours[i]);
            System.out.println(vec[i]);
        }
        System.out.println("Total payment: " + total);
    }
}
