package HomeworkAug.Aug21;

import java.util.Scanner;

public class RandomNumGuessingGame {
    public static void main(String[] args) {
        RandomNumGuessingGame r = new RandomNumGuessingGame();
        computeRandomNum();
    }

    static void computeRandomNum() {

        Scanner s = new Scanner(System.in);
        System.out.println("Input a num between 1-10000 : ");
        double randomNum = Math.random();
        randomNum = randomNum * 10000 + 1;
        int randomInt1 = (int) randomNum;
        for (int i = 0;; i++) {
            int num = s.nextInt();
            if (num == randomInt1)
                break;
           else if (num < randomNum)
                System.out.println("Too low, try again");
           else if (num > randomInt1)
                System.out.println("Too high, try again");
        }
        System.out.println("Good job");
    }
}
