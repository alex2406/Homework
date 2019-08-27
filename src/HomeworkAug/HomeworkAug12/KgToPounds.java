package HomeworkAug.HomeworkAug12;

public class KgToPounds {
    private static double kg1=1 ;
    private static double kg2=0 ;
    private static double lbs1=0 ;
    private static double lbs2=20 ;
    public static void main (String[] args){
        System.out.println("kg     lbs   I   lbs     kg");
        for (;kg1<=199;kg1+=3,lbs2+=5){
            lbs1= kg1 * 2.20462;
            kg2 = lbs2* 0.453592;
        System.out.printf("'%3,3 f'%n",lbs1);


        }
    }
}
