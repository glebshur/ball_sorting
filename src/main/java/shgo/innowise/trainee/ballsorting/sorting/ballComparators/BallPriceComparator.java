package shgo.innowise.trainee.ballsorting.sorting.ballComparators;

import shgo.innowise.trainee.ballsorting.ball.Ball;

/**
 * Class for comparing balls by price.
 */
public class BallPriceComparator implements BallComparator {
    @Override
    public int compare(Ball ballA, Ball ballB) {
        return ballA.getCompanyName().compareTo(ballB.getCompanyName());
    }
}
