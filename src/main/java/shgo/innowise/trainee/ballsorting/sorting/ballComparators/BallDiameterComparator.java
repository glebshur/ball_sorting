package shgo.innowise.trainee.ballsorting.sorting.ballComparators;

import shgo.innowise.trainee.ballsorting.ball.Ball;

/**
 * Class for comparing balls by diameter.
 */
public class BallDiameterComparator implements BallComparator {
    @Override
    public int compare(Ball ballA, Ball ballB) {
        return Double.compare(ballA.getDiameter(), ballB.getDiameter());
    }
}
