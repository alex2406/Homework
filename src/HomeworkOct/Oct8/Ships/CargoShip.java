package HomeworkOct.Oct8.Ships;

public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String year, int cargoCapacity) {
        super(name, year);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "CargoShip{" +
                "cargoCapacity=" + cargoCapacity +
                '}';
    }
}
