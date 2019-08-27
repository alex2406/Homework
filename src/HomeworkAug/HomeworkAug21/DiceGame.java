package HomeworkAug.HomeworkAug21;

public class DiceGame {
    public static void main(String[] args) {
     DiceGame d = new DiceGame();
     DiceFlipper();
    }


    static void DiceFlipper() {

        double randomDice1 = Math.random();
        randomDice1 = randomDice1 * 6 + 1;
        int randomInt1 = (int) randomDice1;
        System.out.println("Your dice roll is : " + randomInt1);

        double randomDice2 = Math.random();
            randomDice2 = randomDice2 * 6 + 1;
            int randomInt2 = (int) randomDice2;
            System.out.println("Your opponent dice roll is :" + randomInt2);

        if (randomInt1 > randomInt2)
            System.out.println("You win");
        else if (randomInt1 < randomInt2)
            System.out.println("You loose");
        else if (randomInt1 == randomInt2)
            System.out.println("Its a tie");
    }
}
