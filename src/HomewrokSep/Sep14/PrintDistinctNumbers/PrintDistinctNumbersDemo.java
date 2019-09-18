package HomewrokSep.Sep14.PrintDistinctNumbers;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintDistinctNumbersDemo {

    public static int[] readUserData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Num");
        int numArray[] = new int[10];
        for (int i = 0; i < 10; i++) {
            int anInt = s.nextInt();
            numArray[i] = anInt;
        }
        return numArray;
    }

    public static int computeDistinctNumbers() {
        int ints[] = readUserData();
        int prevInt = 0, distinctNum = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != prevInt)
                for (int j = 0; j < ints.length; j++) {
                    if (ints[j] != prevInt)
                        distinctNum++;
                }
            prevInt = ints[i];
        }
        return distinctNum;
    }

    public static void name1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Num");
        int ar1[] = new int[10];
        int arrayOfUniqueElements[] = new int[10];
        int anInt = 0;int prevInt=0;
        boolean isFound = false;

        for (int i = 0; i <ar1.length ; i++) {
            anInt = s.nextInt();
            ar1[i] = anInt ;
        }

        int[] noDuplicates = IntStream.of(ar1).distinct().toArray();

        System.out.println(Arrays.toString(noDuplicates));

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                if (prevInt!= ar1[j])
                    isFound = true;
                else {
                    isFound = false;
                    break;
                }
            prevInt = ar1[i];
            if (isFound)
                arrayOfUniqueElements[i] = anInt;
            else
                System.out.println(prevInt + " Not unique");
        }
        System.out.println(Arrays.toString(arrayOfUniqueElements));
    }
}
