package HomeworkAug.Aug21;

import java.util.Scanner;

public class CountUppercaseLetters {
    public static void main(String[] args) {
        CountUppercaseLetters c = new CountUppercaseLetters();
        c.countUpperCase();

    }
    private void countUpperCase(){

        Scanner s = new Scanner(System.in);
        System.out.println("Give a string ");
        String input=s.nextLine();

        int upperCase=0;
        int lowerCase=0;

        for (int k = 0; k < input.length(); k++) {
            if (Character.isUpperCase(input.charAt(k))) upperCase++;
            if (Character.isLowerCase(input.charAt(k))) lowerCase++;
        }

        System.out.printf("There are %d uppercase letters and %d lowercase letters.",upperCase,lowerCase);

    }
}
