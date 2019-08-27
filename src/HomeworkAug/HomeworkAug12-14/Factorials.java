package Domashka;

import java.util.Scanner;

public class
 Factorials {
    private static long n = 1 ;
    public static void main(String[] args){
        System.out.println("Write your factorial");
        Scanner s = new Scanner(System.in);
        int fact = s.nextInt();

        for (int i = 1; i <= fact;i++ ) {
            n=n*i;
        }

        System.out.println("Your num is: "+n);
    }
}
