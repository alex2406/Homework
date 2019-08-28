package HomeworkAug.Aug24;

import java.util.Scanner;

public class RockPaperScissorsGame {


    public static void main(String[] args) {
        RockPaperScissorsGame r = new RockPaperScissorsGame();
        int i1 = r.persMoveCompute();
        int i2 = r.computeMoveComputer();

        if (i1==i2)
            System.out.println("Draw");

        else if (i1==1 && i2==3)
            System.out.println("You win");

        else if (i1==2 && i2==1)
            System.out.println("You win");

        else if (i1==3 && i2==2)
            System.out.println("You win");

        else
            System.out.println("You lost");
    }



    public int computeMoveComputer() {
        double randomCompMove = Math.random();
        randomCompMove = randomCompMove * 3 + 1;
        int randomCompMoveInt = (int) randomCompMove;
     return randomCompMoveInt;
    }
    public int persMoveCompute() {
        Scanner s = new Scanner(System.in);
        System.out.println("Whats your move ?");
        String pearsMoveString = s.next();
        pearsMoveString = pearsMoveString.toLowerCase();
        int persMoveInt = 0 ;boolean status = true;
        while (status){
        switch (pearsMoveString){
            case "rock" :
                persMoveInt = 1;
                status = false ;
                break;
            case "paper" :
                persMoveInt = 2;
                status = false ;
                break;
            case "scissors" :
                persMoveInt = 3;
                status = false ;
                break;
            default:
                System.out.println("Enter a valid move");
                break;
        }}
        return persMoveInt ;
        }

}
