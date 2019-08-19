package HomeworkAug17;

public class Loan {
    public static void main(String[] args) {
        Loan l = new Loan();
        System.out.println(l.loanCalc(5));
    }



    public double loanCalc (int years ){
        double sum = 0, percent = 5, mPayment = 0   ;
        int loan = 10000; 
        for (int i = 0; i <=years*12;i++, percent+=0.125){
            mPayment = (loan*percent)/100;
            sum = loan + mPayment;
            System.out.println(sum);
        }
        return sum;
    }
}
