package HomewrokSep.Sep19.SumANumberInAString;

import java.util.Scanner;

public class SumANumberInAStringUtils {

    public static String readString() {
        Scanner s = new Scanner(System.in);
        String userString;
        userString = s.nextLine();
        return userString;
    }

    public static int findNumbers(String numberSum) {
        int numberSumInt = 0;
        char[] chars = numberSum.toCharArray();
        for (int i = 0; i < numberSum.length(); i++) {
            if (chars[i] == '0' || chars[i] == '1' || chars[i] == '2' || chars[i] == '3' || chars[i] == '4' || chars[i] == '5' || chars[i] == '6' || chars[i] == '7' || chars[i] == '8' || chars[i] == '9') {
                numberSumInt += chars[i];
            }
        }

        return numberSumInt;
    }

}
