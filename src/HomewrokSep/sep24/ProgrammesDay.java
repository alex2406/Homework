package HomewrokSep.sep24;

import java.util.Calendar;
import java.util.Date;

public class ProgrammesDay {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance() ;
        cal.set(2019,9,13);
        System.out.println("Programmers day is: "+ cal.get(Calendar.YEAR)+" "+cal.get(Calendar.MONTH)+" "+cal.get(Calendar.DATE));
    }
}