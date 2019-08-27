package Domashka;

public class MilesToKm {
    private static double km=0 ;
    public static void main (String [] args){
        System.out.println("Miles      Km");
        for (int i = 0;i <= 100000; i++){
            km=i*1.609;
        System.out.println(i+"          "+km);

        }
    }
}
