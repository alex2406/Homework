package HomeworkAug.Aug24;

import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        int right=0,wrong=0;
        ESPGame game = new ESPGame();
        for (int i = 0 ; i < 10 ;i++){
            int n1 = game.PersMove();
            int n2 = game.ComputerMove();
        if (n1 == n2)
            right++;
        else
            wrong++;
        }
        System.out.println("You guessed right: " + right+" "+ "and wrong: "+wrong);
    }



    public int ComputerMove() {
        double randomCompMove = Math.random();
        randomCompMove = randomCompMove * 5 + 1;
        int randomCompMoveInt = (int) randomCompMove;
        return randomCompMoveInt;
    }

    public int PersMove() {
        Scanner s = new Scanner(System.in);
        System.out.println("Whats your colour ?");
        String pearsMoveString = s.next();
        pearsMoveString = pearsMoveString.toLowerCase();
        int persMoveInt = 0 ;boolean status = true;
        while (status){
            switch (pearsMoveString){
                case "red" :
                    persMoveInt = 1;
                    status = false ;
                    break;
                case "green" :
                    persMoveInt = 2;
                    status = false ;
                    break;
                case "blue" :
                    persMoveInt = 3;
                    status = false ;
                    break;
                case "orange" :
                    persMoveInt = 4;
                    status = false ;
                    break;
                case "yellow" :
                    persMoveInt = 5;
                    status = false ;
                    break;

                default:
                    System.out.println("Enter a valid move");
                    break;
            }}
        return persMoveInt ;
    }
}
