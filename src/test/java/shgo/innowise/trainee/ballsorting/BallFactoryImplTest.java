package shgo.innowise.trainee.ballsorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shgo.innowise.trainee.ballsorting.ball.Baseball;
import shgo.innowise.trainee.ballsorting.ball.Basketball;
import shgo.innowise.trainee.ballsorting.ball.Football;
import shgo.innowise.trainee.ballsorting.ball.TennisBall;
import shgo.innowise.trainee.ballsorting.ballFactory.BallFactoryImpl;
import shgo.innowise.trainee.ballsorting.ballFactory.BallType;

public class BallFactoryImplTest {

    private BallFactoryImpl ballFactory;

    @BeforeEach
    public void init(){
        ballFactory = new BallFactoryImpl();
    }

    @Test
    public void createBallShouldReturnFootball(){
        Assertions.assertTrue(ballFactory.createBall(BallType.FOOTBALL) instanceof Football);
    }

    @Test
    public void createBallShouldReturnBaseball(){
        Assertions.assertTrue(ballFactory.createBall(BallType.BASEBALL) instanceof Baseball);
    }

    @Test
    public void createBallShouldReturnBasketball(){
        Assertions.assertTrue(ballFactory.createBall(BallType.BASKETBALL) instanceof Basketball);
    }

    @Test
    public void createBallShouldReturnTennisBall(){
        Assertions.assertTrue(ballFactory.createBall(BallType.TENNIS_BALL) instanceof TennisBall);
    }
}
