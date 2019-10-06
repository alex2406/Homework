package HomeworkOct.Oct6.Games;

public class BasketBall implements Games {
    @Override
    public void nrPlayers() {
        System.out.println("Basketball has twelve players");
    }

    @Override
    public void typeOfBall() {
        System.out.println("In basketball the type of ball is basketball");

    }

    @Override
    public void roundTime() {
        System.out.println("Basketball round time is 12 min");
    }
}
