package HomeworkAug.HomeworkAug3;

import java.util.Scanner;

public class DecToHex {
    public static void main(String[] args) {
        System.out.println("Enter a dec value (0-15)");
        Scanner input = new Scanner(System.in);
        String hex = String.valueOf(input.next());

        System.out.println("Your value in hex is: "+ Integer.toHexString(Integer.parseInt(hex)));
    }
}