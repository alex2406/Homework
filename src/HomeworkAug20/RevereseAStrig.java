package HomeworkAug20;

import java.util.Scanner;

public class RevereseAStrig {
    public static void main(String[] args) {
        RevereseAStrig r = new RevereseAStrig();
        r.stringReverser();
    }


    public void stringReverser (){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = s.nextLine();
        String reverse = "";


        for (int i = str.length()-1;i>=0;i--){
            reverse= reverse + str.charAt(i);
        }
        System.out.println("Reverse string is: "+reverse);
    }
}
