package HomeworkAug.HomeworkAug21;

import java.util.Scanner;

public class CountConsOrVowelV2 {
    public static void main(String... args) {
        CountConsOrVowelV2 c = new CountConsOrVowelV2();
        c.ConsOrVowel();
    }


    public void ConsOrVowel() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = s.next();
        int vCount = 0, cCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                vCount++;
            else
                cCount++;
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}
