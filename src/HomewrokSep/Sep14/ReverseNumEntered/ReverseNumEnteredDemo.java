package HomewrokSep.Sep14.ReverseNumEntered;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumEnteredDemo {
    public static int[] readUserData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Num");
        int[] numArray = new int[10];
        for (int i = 0; i < 10; i++) {
            int anInt = s.nextInt();
            numArray[i] = anInt;
        }
        return numArray;
    }

    public static String reverseArray() {

        int[] ints;
        ints = readUserData();
        int[] reverse = new int[10];

        for (int i = ints.length; i > 0; i--) {
            reverse[i] = ints [i];
        }
        return Arrays.toString(reverse);
    }

}
