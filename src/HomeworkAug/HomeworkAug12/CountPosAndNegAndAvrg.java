package HomeworkAug.HomeworkAug12;

import java.util.Scanner;

public class CountPosAndNegAndAvrg {
    private static boolean x ;
    private static int n1=0 ;
    private static int num=0 ;
    private static int pos=0 ;
    private static int neg=0 ;
    private static int sum=0 ;
    private static double avrg=0 ;
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        while (x=true){
            num++;
            System.out.println("input a num");
             n1 = s.nextInt();
             if (n1>0) pos++ ;
             if (n1<0) neg++ ;

             sum = sum +n1;
             avrg= sum/num;

            if (n1==0){
                break;}

        }
        System.out.println("the num of pos: "+pos);
        System.out.println("the num of neg: "+neg);
        System.out.println("the sum: "+sum);
        System.out.println("the avrg: "+avrg);
    }
}
