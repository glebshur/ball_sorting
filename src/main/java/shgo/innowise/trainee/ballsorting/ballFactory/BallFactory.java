package shgo.innowise.trainee.ballsorting.ballFactory;

import shgo.innowise.trainee.ballsorting.ball.*;

/**
 * Interface of ball factory that allows create balls.
 */
public interface BallFactory {

    Ball createBall(BallType type);

    Football createFootball();

    Baseball createBaseball();

    Basketball createBasketball();

    TennisBall createTennisBall();
}
