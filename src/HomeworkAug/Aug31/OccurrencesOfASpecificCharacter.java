package HomeworkAug.Aug31;

public class OccurrencesOfASpecificCharacter {

    public static void main(String[] args) {
        System.out.println("Enter your string and a specific character" );
    }

    public static int count(String str, char a){
        int count = 0 ;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==a )
                count++;
        }
        return count;
    }

}
