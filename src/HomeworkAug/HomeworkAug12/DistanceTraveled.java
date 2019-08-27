package HomeworkAug.HomeworkAug12;

import java.util.Scanner;

public class DistanceTraveled {
    private static int time = 0;
    private static int dist = 0;

    public static void main (String [] args) {
        System.out.println("What speed is your vehicle traveling in km/h");
        Scanner input = new Scanner(System.in);
        int speed = input.nextInt();

        System.out.println("Hour     Distance traveled");
        System.out.println("___________________________");

            for (;time<=120;time++){
            dist=speed*time;
            System.out.println(time+"           "+dist);

        }

    }
}
