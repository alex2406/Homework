package doljoc;

import java.util.Scanner;

public class romanNumerals {
    public static void main(String[] args) {
        System.out.println("Input a rom numeral");
        Scanner input = new Scanner(System.in);
        String rom = String.valueOf(input.next());
        switch (rom) {
            case "I":
                System.out.println("Your value is - 1");
                break;
            case "II":
                System.out.println("Your value is - 2");
                break;
            case "III":
                System.out.println("Your value is - 3");
                break;
            case "IV":
                System.out.println("Your value is - 4");
                break;
            case "V":
                System.out.println("Your value is - 5");
                break;
            case "VI":
                System.out.println("Your value is - 6");
                break;
            case "VII":
                System.out.println("Your value is - 7");
                break;
            case "VIII":
                System.out.println("Your value is - 8");
                break;
            case "IX":
                System.out.println("Your value is - 9");
                break;
            case "X":
                System.out.println("Your value is - 10");
                break;
            default:
            System.out.println("Input a valid numeral");
            break;

        }
    }
}
