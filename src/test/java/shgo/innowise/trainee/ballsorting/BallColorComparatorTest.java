package shgo.innowise.trainee.ballsorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shgo.innowise.trainee.ballsorting.ball.Ball;
import shgo.innowise.trainee.ballsorting.ball.Color;
import shgo.innowise.trainee.ballsorting.ball.Football;
import shgo.innowise.trainee.ballsorting.sorting.ballComparators.BallColorComparator;

public class BallColorComparatorTest {

    private BallColorComparator comparator;

    @BeforeEach
    public void init(){
        comparator = new BallColorComparator();
    }

    @Test
    public void compareShouldReturnGreaterThanZero(){

        Ball ballA = new Football(0,0,0,"", Color.BLACK_AND_WHITE);
        Ball ballB = new Football(0,0,0,"", Color.WHITE);

        Assertions.assertTrue(comparator.compare(ballA, ballB) > 0);
    }

    @Test
    public void compareShouldReturnLessThanZero(){
        Ball ballA = new Football(0,0,0,"", Color.WHITE);
        Ball ballB = new Football(0,0,0,"", Color.BLACK_AND_WHITE);

        Assertions.assertTrue(comparator.compare(ballA, ballB) < 0);
    }

    @Test
    public void compareShouldReturnZero(){
        Ball ballA = new Football(0,0,0,"", Color.WHITE);
        Ball ballB = new Football(0,0,0,"", Color.WHITE);

        Assertions.assertTrue(comparator.compare(ballA, ballB) == 0);

    }
}
