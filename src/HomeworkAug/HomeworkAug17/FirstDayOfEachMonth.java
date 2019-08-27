package HomeworkAug17;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class FirstDayOfEachMonth {
    public static void main(String[] args) {
        FirstDayOfEachMonth f = new FirstDayOfEachMonth();
        System.out.println(f.dayFinder(1));

    }


    public int dayFinder(int date) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a Year: ");
        int year = s.nextInt();
        Calendar cal = Calendar.getInstance();
          for (int i = 0; i<12;i++){
              cal.set(year,i,1);
              System.out.printf( "the first day of %s is %s\n",
                      cal.getDisplayName(Calendar.MONTH      , Calendar.LONG, Locale.getDefault()),
                      cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()));
          }

        return 0;
    }
}