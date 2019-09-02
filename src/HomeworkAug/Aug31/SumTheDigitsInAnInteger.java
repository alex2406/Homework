package HomeworkAug.Aug31;

public class SumTheDigitsInAnInteger {
    public static void main(String[] args) {
        System.out.println(sumDigits( 1111111111));
    }

    public static int sumDigits(long n) {

        int sum = 0;
        for (int i = 1; ; i++) {
            sum += n % 10;
            n /= 10;
            if (n <= 0)
                break;
        }
        return sum;
    }
}
