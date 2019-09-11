package HomewrokSep.Sep10.FormatAnInteger;

public class FormatAnInteger {
    public static String format(int num, int width) {
        String result = "";
        int length = String.valueOf(num).length();
        for (int i = 0; i < width - length; i++) {
            result += "0";
        }
        return result + num;
    }
}


