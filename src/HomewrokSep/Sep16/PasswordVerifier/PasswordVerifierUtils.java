package HomewrokSep.Sep16.PasswordVerifier;

public class PasswordVerifierUtils {
    public static boolean length(String str) {
        boolean verify = false;
        if (str.length() >= 6)
            verify = true;
        return verify;
    }

    public static boolean upperANDlowerCase(String str) {
        boolean verify = false;
        boolean hasUppercase = !str.equals(str.toLowerCase());
        boolean hasLowercase = !str.equals(str.toUpperCase());
        if (hasLowercase && hasUppercase)
            verify = true;
        return verify;
    }

    public static boolean digitChecker(String str) {
        boolean verify = false;
        if (str.matches("1234567890"))
            verify = true;
        return verify;
    }
}
