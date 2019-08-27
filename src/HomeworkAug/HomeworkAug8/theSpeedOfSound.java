package doljoc;

import java.util.Scanner;

public class theSpeedOfSound {
    private static double time = 0 ;
    public static void main(String[] args) {

        System.out.println("Input a medium");
        Scanner input = new Scanner(System.in);
        String typeofmedium = String.valueOf(input.next());

        System.out.println("Input the distance");

        input = new Scanner(System.in);
        int distance = input.nextInt();


        switch (typeofmedium) {
            case "sound" :
                time = distance / 1110 ;
                System.out.println("Time in air " + time );
                break;
            case "water" :
                time = distance / 4900 ;
                System.out.println("Time in water " + time);
                break;
            case "steel" :
                time = distance / 16400 ;
                System.out.println("Time in steel " + time );
                break;
            default:
                System.out.println("Input a valid medium");
        }
    }
}