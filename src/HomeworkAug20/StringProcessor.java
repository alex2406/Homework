package HomeworkAug20;

import java.util.Scanner;

public class StringProcessor {
    public static void main(String[] args) {
        StringProcessor s = new StringProcessor();
        s.stringProcess();
    }
    public void stringProcess (){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = s.nextLine();
        String oddChar = "";

        for (int i = 0;i < str.length();i+=2){
            oddChar=oddChar + str.charAt(i);
        }
        System.out.println(oddChar);
    }
}
