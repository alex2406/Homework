package HomewrokSep.Sep16.PasswordVerifier;

import java.util.Scanner;

public class PassVerify {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your password");
        String str = s.nextLine();
        if (PasswordVerifierUtils.length(str) && PasswordVerifierUtils.upperANDlowerCase(str))
            System.out.println("your password works");
        else
            System.out.println("Your password does not work");
    }
}
