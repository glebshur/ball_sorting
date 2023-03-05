package shgo.innowise.trainee.ballsorting.ballFactory;

import shgo.innowise.trainee.ballsorting.ball.*;

/**
 * Class implements ball factory interface.
 */
public class BallFactoryImpl implements BallFactory {

    @Override
    public Ball createBall(BallType type) {
        switch (type) {
            case FOOTBALL:
                return new Football();
            case BASEBALL:
                return new Baseball();
            case BASKETBALL:
                return new Basketball();
            case TENNIS_BALL:
                return new TennisBall();
            default:
                return null;
        }
    }

    @Override
    public Football createFootball() {
        return new Football();
    }

    @Override
    public Baseball createBaseball() {
        return new Baseball();
    }

    @Override
    public Basketball createBasketball() {
        return new Basketball();
    }

    @Override
    public TennisBall createTennisBall() {
        return new TennisBall();
    }
}
