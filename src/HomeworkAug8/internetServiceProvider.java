package doljoc;

import java.util.Scanner;

public class internetServiceProvider {
    private static double price = 0 ;
    private static double price2 = 0 ;
    private static double price3 = 0 ;
    private static double h2 = 0 ;

    public static void main(String[] args) {
        System.out.println("Choose a package");
        Scanner input = new Scanner(System.in);
        String pack = String.valueOf(input.next());

        System.out.println("How many hours were used");
        input = new Scanner(System.in);
        int h = input.nextInt();

        switch (pack) {

            case "A" :
                h2 = h;
                h = h - 10 ;
                price =  9.95 + (h*2) ;
                System.out.println("You should pay: "+price );
                h2 = h - 20 ;
                price2 = 13.95 + h2 ;
                if (price-price2>0){
                System.out.print("If you would use package B you would save: ");
                h2 = h - 20 ;
                price2 = 13.95 + h2 ;
                System.out.println(price-price2);}
                if (price-19.95>0){
                    price3=price-19.95;
                System.out.println("If you would use package C you would save: "+ price3);}
                break;
            case "B" :
                h = h - 20 ;
                price = 13.95 + h ;
                System.out.print("You should pay: "+ price);
                if (price-19.95<0);{
                price3=price-19.95;
                System.out.println("If you would use package C you would save: "+ price3);}
                break;
            case "C" :
                System.out.println("You should pay: 19.95");
        }
    }
}



