package HomeworkAug.Aug17;

public class SumASeries {

    public static void main(String[] args) {
        SumASeries s = new SumASeries();
        System.out.println(s.seriesSum(99));

    }


    public double seriesSum (int limit){
        double sum = 0 ;
        double n1 = 1, n2 = 3;
        for (;n2<=limit;n1=+2,n2+=2){
            sum = sum + n1/n2;
    }
        return sum ;
    }

}
