package HomeworkAug.Aug5;

import java.util.Scanner;

public class convLetToNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String let = String.valueOf(input.next());
        switch (let) {
            case "a":
            case "A":
                System.out.println("Your number is 4");
                break;
            case "b":
            case "B":
                System.out.println("Your number is 3");
                break;
            case "c":
            case "C":
                System.out.println("Your number is 2");
                break;
            case "d":
            case "D":
                System.out.println("Your number is 1");
                break;
            case "f":  case "F":
                System.out.println("Your number is 0 lol");
                break;
            default:
                System.out.println("input a valid num");
        }
    }
}