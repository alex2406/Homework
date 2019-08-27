package HomeworkAug17;

public class DemonstrationCancellationError {
    public static void main(String[] args) {
        DemonstrationCancellationError d = new DemonstrationCancellationError();
        System.out.println(d.sumCalc(5000));
    }

    public double sumCalc (int limit) {
        double sum = 0 ;
        double n1 = 1, n2 = 2;
        for (; n1 <= limit; n1++, n2++) {
            sum = sum + (n1/n2) ;
        }
        return sum;
    }
}
