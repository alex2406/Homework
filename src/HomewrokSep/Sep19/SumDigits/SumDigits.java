package HomewrokSep.Sep19.SumDigits;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println("Input your String Number");
        String userInput = SumDigitsUtils.readString();
        System.out.println(SumDigitsUtils.findNumbers(userInput));
    }
}

