package HomeworkAug17;

public class Summation {
    int n1 = 1, n2 = 2;

    public static void main(String[] args) {
        Summation s = new Summation();
        System.out.println(s.sumCalc(624));
    }
       public double sumCalc (int limit) {
            double sum = 0 ;
            int n1 = 1, n2 = 2;
            for (; n1 <= limit; n1++, n2++) {
                sum = sum + 1 / (Math.sqrt(n1) + Math.sqrt(n2));
            }
            return sum;
        }
}

