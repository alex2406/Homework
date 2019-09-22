package HomewrokSep.Sep19.SumDigits;

import java.util.Scanner;

public class SumDigitsUtils {

    public static String readString() {
        Scanner s = new Scanner(System.in);
        String userString;
        userString = s.nextLine();
        return userString;
    }

    public static int findNumbers(String numberSum) {
        int numberSumInt = 0;
        char[] chars = numberSum.toCharArray();
        for (int i = 0; i < numberSum.length(); i++) numberSumInt += chars[i];
        return numberSumInt;
    }

}

