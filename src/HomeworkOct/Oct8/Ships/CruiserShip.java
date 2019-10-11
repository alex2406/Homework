package HomeworkOct.Oct8.Ships;

public class CruiserShip extends Ship {
    private int MaxNumberOfPassengers;

    public CruiserShip(String name, String year, int maxNumberOfPassengers) {
        super(name, year);
        MaxNumberOfPassengers = maxNumberOfPassengers;
    }

    public int getMaxNumberOfPassengers() {
        return MaxNumberOfPassengers;
    }

    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
        MaxNumberOfPassengers = maxNumberOfPassengers;
    }

    @Override
    public String toString() {
        return "CruiserShip{" +
                "MaxNumberOfPassengers=" + MaxNumberOfPassengers +
                '}';
    }
}
