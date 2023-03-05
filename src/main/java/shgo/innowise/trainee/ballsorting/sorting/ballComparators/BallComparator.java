package shgo.innowise.trainee.ballsorting.sorting.ballComparators;

import shgo.innowise.trainee.ballsorting.ball.Ball;

/**
 * Functional interface for comparing balls by some property.
 */
public interface BallComparator {

    /**
     * Method compares 2 balls.
     *
     * @param ballA first ball to compare
     * @param ballB second ball to compare
     * @return 1 if ballA is greater than ballB;
     * 0 if ballA equals ballB;
     * -1 if ballA less than ballB
     */
    int compare(Ball ballA, Ball ballB);
}
