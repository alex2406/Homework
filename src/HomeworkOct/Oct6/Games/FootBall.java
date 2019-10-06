package HomeworkOct.Oct6.Games;

public class FootBall implements Games {
    @Override
    public void nrPlayers() {
        System.out.println("Foot ball has 21 players");
    }

    @Override
    public void typeOfBall() {
        System.out.println("In football type of ball is football");
    }

    @Override
    public void roundTime() {
        System.out.println("Football round time is 45 min");
    }
}
