package HomeworkOct.Oct1;

public class ProductionWorker extends Employee {
    private int Shift;
    private double hourlyPayRate;


    public ProductionWorker(String name, String eNumber, int hireDate, int shift, double hourlyPayRate) {
        super(name, eNumber, hireDate);
        Shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return Shift;
    }

    public void setShift(int shift) {
        Shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "ProductionWorker{" +
                "Shift=" + Shift +
                ", hourlyPayRate=" + hourlyPayRate +
                '}';
    }
}
