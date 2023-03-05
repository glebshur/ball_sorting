package shgo.innowise.trainee.ballsorting.sorting.ballComparators;

import shgo.innowise.trainee.ballsorting.ball.Ball;

/**
 * Class for comparing balls by weight.
 */
public class BallWeightComparator implements BallComparator {
    @Override
    public int compare(Ball ballA, Ball ballB) {
        return Double.compare(ballA.getWeight(), ballB.getWeight());
    }
}
