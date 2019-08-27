package HomeworkAug.HomeworkAug12;

import java.util.Scanner;

public class Num2Wtf {
    private static int numsum = 0;
    private static int num1 = 0;
    private static int num2 = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a num");
        num1 = input.nextInt();
        System.out.println("Input a bigger num");
        num2 = input.nextInt();
        for(;num1<=num2;num1++){
            numsum=num1+numsum;

        }
        System.out.println("Yor number sum is: "+ numsum);
    }
}
