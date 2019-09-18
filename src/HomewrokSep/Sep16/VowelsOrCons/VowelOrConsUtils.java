package HomewrokSep.Sep16.VowelsOrCons;

import java.util.Scanner;

public class VowelOrConsUtils {

    public static void separateConsOrVowel() {
        Scanner s = new Scanner(System.in);
        String userContinue = "";
        do {
            System.out.println("Enter a string");
            String str = s.next();

            int vCount = 0, cCount = 0, all = 0;
            str = str.toLowerCase();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                    vCount++;
                else
                    cCount++;
            }
            all = vCount + cCount;
            System.out.println("Number of vowels: " + vCount);
            System.out.println("Number of consonants: " + cCount);
            System.out.println("Number of vowels and consonants: " + all);
            System.out.println("Do you want to continue ?");
            userContinue = s.next();

        }
        while (!userContinue.equals("e"));
    }
}



