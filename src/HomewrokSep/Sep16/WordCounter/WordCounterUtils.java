package HomewrokSep.Sep16.WordCounter;

import java.util.Scanner;

public class WordCounterUtils {
    public static String readString() {
        Scanner s = new Scanner(System.in);
        String userString;
        userString = s.nextLine();
        return userString;
    }

    public static void countWord() {
        System.out.println("==========================");
        char[] string = readString().toCharArray();
        char space = ' ';
        int wordCounter = 1;
        for (int i = 0; i < string.length; i++) {
            if ((string[i]) == space) {
                wordCounter++;
            }
        }
        System.out.println("You have " + wordCounter + " words");
    }
}
