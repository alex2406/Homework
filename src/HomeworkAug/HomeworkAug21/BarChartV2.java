package HomeworkAug.HomeworkAug21;

public class BarChartV2 {
    public static void main(String[] args) {
        BarChartV2 b = new BarChartV2();
        System.out.println(b.BarChartCalc(1000));
        System.out.println(b.BarChartCalc(1200));
        System.out.println(b.BarChartCalc(1800));
        System.out.println(b.BarChartCalc(800));
        System.out.println(b.BarChartCalc(1900));
    }

    public String BarChartCalc(int tries) {
        String str = "";

        for (int i = 0; i <= tries; i += 100){
            str += "*";
    }
        return str ;
    }
}
