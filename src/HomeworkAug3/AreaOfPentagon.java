package doljoc;

import java.util.Scanner;
import java.lang.Math;

public class AreaOfPentagon {
    private static double s = 0 ;
    private static double area = 0 ;


    public static void main(String[] args) {
        System.out.println("Enter the length from the center of a pentagon to a vertex");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        s= 2*r*Math.sin(Math.PI/5);
        area=(5*s*s)/(4*Math.tan(Math.PI/5));
        System.out.printf("Area of the pentagon is: "+area);

    }
}
