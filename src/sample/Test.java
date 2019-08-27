package sample;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double sum = 0;
        double n1 = 1, n2 = 3;
        for (; n2 <= 99; n1 = +2, n2 += 2) {
            sum = sum + n1 / n2;//end for i
            System.out.println(sum);

        }
    }
}
