package HomeworkAug.Aug17;

public class PiCalcV2 { //broken
    public static void main(String[] args) {
        PiCalcV2 s = new PiCalcV2();
        System.out.println(s.piCalc(10000));

        System.out.println(s.piCalc(20000));

        System.out.println(s.piCalc(100000));
    }

    public double piCalc(int limit) {
        double sum = 0;
        for (double i = 0; i <= limit; i++) {
            sum += Math.pow(-1,i+1) / (2*i - 1);
        }
        return 4*sum;
    }
}
