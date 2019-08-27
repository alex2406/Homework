package HomeworkAug.Aug8;

import java.util.Scanner;

public class montToDays {
    public static void main (String [] args){
        System.out.println("Input a month");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();

        switch (m){
            case 1 :
                System.out.println("Total number of days: 31");
break;

            case 2 :
                System.out.println("Total number of days: 28/29");
                break;

            case 3 :
                System.out.println("Total number of days: 31");
                break;

            case 4 :
                System.out.println("Total number of days: 30");
                break;

            case 5 :
                System.out.println("Total number of days: 31");
                break;

            case 6 :
                System.out.println("Total number of days: 30");
                break;

            case 7 :
                System.out.println("Total number of days: 31");
                break;

            case 8 :
                System.out.println("Total number of days: 30");
                break;

            case 9 :
                System.out.println("Total number of days: 31");
                break;

            case 10 :
                System.out.println("Total number of days: 30");
                break;

            case 11:
                System.out.println("Total number of days: 31");
                break;

            case 12 :
                System.out.println("Total number of days: 30");
                break;
            default:
                System.out.println("Input a valid number");
                break;

        }
    }
}
