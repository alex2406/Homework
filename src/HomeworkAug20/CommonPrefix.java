package HomeworkAug20;

import java.util.Scanner;

public class CommonPrefix {
    public static void main(String[] args) {
        CommonPrefix c = new CommonPrefix();
        c.commonPrefixFind();
    }
    public void commonPrefixFind(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1 = s.nextLine();
        System.out.println("Enter the second String");
        String str2 = s.nextLine();
        String common = "";

        for (int i1 = 0;i1 < str1.length();i1++){

                if (str1.charAt(i1)==str2.charAt(i1))
                    common=common+str1.charAt(i1);

        }
        if (common.length()<0)
        System.out.println("Common prefix"+common);
        else
            System.out.println("Nothing in common");
    }
}
