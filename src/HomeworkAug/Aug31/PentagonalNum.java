package HomeworkAug.Aug31;

public class PentagonalNum {

    public static void main(String[] args) {
        System.out.println(getPentagonalNumber(1));
        System.out.println(getPentagonalNumber(5));
        System.out.println(getPentagonalNumber(12));
        System.out.println(getPentagonalNumber(22));
    }

    public static int getPentagonalNumber (int n){
       return n*(3*n-1)/2;
    }
}
