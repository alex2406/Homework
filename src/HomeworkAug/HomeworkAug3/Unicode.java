package HomeworkAug3;

import java.util.Scanner;

public class Unicode {

    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        int castAscii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
 }
}
