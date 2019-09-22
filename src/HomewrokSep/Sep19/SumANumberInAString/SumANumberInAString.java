package HomewrokSep.Sep19.SumANumberInAString;

public class SumANumberInAString {
    public static void main(String[] args) {
        System.out.println("Input your String Number");
        String userInput = SumANumberInAStringUtils.readString();
        System.out.println(SumANumberInAStringUtils.findNumbers(userInput));
    }
}
