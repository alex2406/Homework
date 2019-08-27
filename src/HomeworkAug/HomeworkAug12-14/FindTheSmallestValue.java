package Domashka;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheSmallestValue {
    public static int getSmallest(int[] a, int total){
        Arrays.sort(a);
        return a[0];
    }
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int [] myArray = new int[length];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<length; i++ ) {
            myArray[i] = s.nextInt();
        }
        System.out.println("Smallest: "+getSmallest(myArray,length));
    }
}