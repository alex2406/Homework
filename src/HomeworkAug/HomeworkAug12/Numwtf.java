package HomeworkAug.HomeworkAug12;

import java.util.Scanner;

public class Numwtf {
    private static int numsum = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        for (int num = 0; 0 == num;){
            System.out.println("Input a num");
            int num2 = input.nextInt();
            System.out.println("Input a num");
            num = input.nextInt();
            numsum = num2 + num;
        }
        System.out.println("Your sum is: "+numsum);
    }
}