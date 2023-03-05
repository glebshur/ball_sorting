package shgo.innowise.trainee.ballsorting.sorting.ballComparators;

import shgo.innowise.trainee.ballsorting.ball.Ball;

/**
 * Class for comparing balls by color.
 */
public class BallColorComparator implements BallComparator {
    @Override
    public int compare(Ball ballA, Ball ballB) {
        return ballA.getColor().compareTo(ballB.getColor());
    }
}
