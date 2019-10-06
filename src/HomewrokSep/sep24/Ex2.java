package HomewrokSep.sep24;

import java.time.LocalDate;
import java.util.Calendar;

public class Ex2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2000,4,29);
        System.out.println(date);
        LocalDate localDate = date.plusYears(4);
        System.out.println(localDate);
    }
}

