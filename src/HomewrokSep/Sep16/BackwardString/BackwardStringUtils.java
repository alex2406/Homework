package HomewrokSep.Sep16.BackwardString;

import java.util.Scanner;

public class BackwardStringUtils {
    Scanner s = new Scanner(System.in);

    public static String readString() {
        Scanner s = new Scanner(System.in);
        String userString;
        userString = s.nextLine();
        return userString;
    }

    public static void reverseString() {
        System.out.println("==========================");
        char [] reverse = readString().toCharArray();
        for (int i = reverse.length-1; i >= 0 ; i--) {
            System.out.print(reverse[i]);
        }
    }
}
