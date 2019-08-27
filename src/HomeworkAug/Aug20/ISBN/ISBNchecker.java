package HomeworkAug.Aug20.ISBN;

public class ISBNchecker {
    String compteFullLenghtISBN (String isbn){
        if (isbn.length()!=12)
            return "invalid input";
        int digit13 = 0 ;
        for (int i = 0;i<isbn.length();i++){
            if (i%2==0)
            digit13 += Character.getNumericValue(isbn.charAt(i));
            else
                digit13 += Character.getNumericValue(isbn.charAt(i))*3;
        }
        digit13 = 10 - digit13 %10;
        return isbn + digit13;
    }
}
