package HomeworkAug.HomeworkAug8;

import java.util.Scanner;

public class fatCalc {


    public static void main(String[] args) {

        System.out.println("Input food cal");
        Scanner input = new Scanner(System.in);
        int food = input.nextInt();

        System.out.println("Input fat grams");
        input = new Scanner(System.in);
        int fat = input.nextInt();

        if ((food * fat) / 100 < 30) {
            System.out.print("Your food is low in fat");
            fat = fat * 9;
            food = fat + food;
            System.out.println("and has this many calories: " + food);
        } else {
            fat = fat * 9;
            food = fat + food;
            System.out.println("Your food has this many calories: " + food);


        }
    }
}
