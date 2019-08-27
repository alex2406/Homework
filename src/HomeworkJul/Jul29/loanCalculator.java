package HomeworkJul.Jul29;

import java.util.Scanner;

public class loanCalculator {

    public static void main(String[] args) {
        System.out.println("Input loan amount");
        Scanner input = new Scanner(System.in);
        double loan = input.nextDouble();

        System.out.println("Input monthly interest amount");
        input = new Scanner(System.in);
        double interest = input.nextDouble();

        System.out.println("Input monthly payment amount");
        input = new Scanner(System.in);
        double mPayment = input.nextDouble();

        loan= loan - mPayment - (mPayment * interest)/100 ;

        System.out.println("Balance remaining after firts payment- " + loan);

        loan= loan - mPayment - (mPayment * interest)/100 ;

        System.out.println("Balance remaining after second payment- " + loan);

        loan= loan - mPayment - (mPayment * interest)/100 ;

        System.out.println("Balance remaining after third payment- " + loan);


    }
}