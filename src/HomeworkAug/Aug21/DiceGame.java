package HomeworkAug.Aug21;

public class DiceGame {
    public static void main(String[] args) {
        DiceGame d = new DiceGame();
        d.play();
    }


     void play() {
        int randomInt1 = flipADice();
        int randomInt2 = flipADice();
        checkWinner(randomInt1, randomInt2);
    }

    private static void checkWinner(int randomInt1, int randomInt2) {
        if (randomInt1 > randomInt2)
            System.out.println("You win");
        else if (randomInt1 < randomInt2)
            System.out.println("You loose");
        else if (randomInt1 == randomInt2)
            System.out.println("Its a tie");
    }

    private static int flipADice() {
        double randomDice1 = Math.random();
        randomDice1 = randomDice1 * 6 + 1;
        int randomInt1 = (int) randomDice1;
        return randomInt1;
    }
}
