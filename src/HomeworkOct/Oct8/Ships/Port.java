package HomeworkOct.Oct8.Ships;

public class Port {
    public static void main(String[] args) {
        Ship ships[] = {new CargoShip("Big Bertha", "1998", 5000),
                new CruiserShip("Royal Caribbean's", "2018", 6680),
                new CargoShip("OOCL Hong Kong","2017",10000)};

        for (int i = 0; i <ships.length ; i++) {
            System.out.println(ships[i]);
        }
    }
}
