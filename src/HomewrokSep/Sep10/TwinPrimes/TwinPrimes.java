package HomewrokSep.Sep10.TwinPrimes;
import java.util.Arrays;
import java.util.Collection;


public class TwinPrimes {

    public static void calculatePrime (){
        int [] primeArray;
        primeArray = new int[2];

        for (int i = 1;i<primeArray.length; i++) {
            if (i/i==1 && i/1==i ){
               primeArray(i).add(i);
            }
        }
        System.out.println(primeArray);

    }
    private static Collection<Integer> primeArray(int i) {
        return null;
    }
}
