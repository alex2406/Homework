package HomeworkOct.Oct6.Games;

public class Test {
    public static void main(String[] args) {
        FootBall footBall = new FootBall();
        footBall.nrPlayers();
        footBall.roundTime();
        footBall.typeOfBall();
        System.out.println("=============================================");
        BasketBall basketBall = new BasketBall();
        basketBall.nrPlayers();
        basketBall.roundTime();
        basketBall.typeOfBall();
        System.out.println("=============================================");
        VolleyBall volleyBall = new VolleyBall();
        volleyBall.nrPlayers();
        volleyBall.roundTime();
        volleyBall.typeOfBall();
    }
}
