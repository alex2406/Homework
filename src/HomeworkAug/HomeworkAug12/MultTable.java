package HomeworkAug.HomeworkAug12;

import java.util.Scanner;

public class MultTable {
    public static void main(String[] args) {
        System.out.println("input a num you want to multiply");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int multnum = 0 ;
        for (int mult = 0; mult<=10; mult++){
            multnum=num*mult;
            System.out.println(num+"x"+mult+"="+multnum);
        }
    }
}