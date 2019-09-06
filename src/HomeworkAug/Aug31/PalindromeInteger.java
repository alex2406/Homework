package HomeworkAug.Aug31;

public class PalindromeInteger {

    public static void main(String[] args) {
        System.out.println("Enter a number: "+ reverse(656));
        if (isPalindrome(656))
            System.out.println("Your num is a palindrome");
        else
            System.out.println("Your num is not a palindrome");
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
    public static boolean isPalindrome(int num){
        if (num == reverse(num))
            return true;
        else
        return false;
    }

}
