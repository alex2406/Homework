package HomeworkAug.Aug31;

public class IntReverse {

    public static void main(String[] args) {
        System.out.println("Your num in reverse is: "+ reverse(3456));
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
