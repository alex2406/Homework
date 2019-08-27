package HomeworkAug.HomeworkAug20;

public class CoinFlipper {
    public static void main(String[] args) {
        CoinFlipper f = new CoinFlipper();
        f.flipACoinCalculation(1_000_000);
    }



    public void flipACoinCalculation (int tries){
        int heads=0;
        int tails=0;
        for (int i =0 ; i < tries ; i++){

            if (Math.random() < 0.5)
                heads ++;
            else
                tails++;
        }
        System.out.println("Heads: " + heads + " and tails: " + tails);

    }
}
