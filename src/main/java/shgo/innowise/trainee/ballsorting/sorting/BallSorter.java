package shgo.innowise.trainee.ballsorting.sorting;

import shgo.innowise.trainee.ballsorting.ball.Ball;
import shgo.innowise.trainee.ballsorting.sorting.ballComparators.BallComparator;

import java.util.List;

/**
 * Class provides difference types of sorting for balls.
 */
public class BallSorter {

    /**
     * Quick sort for balls list.
     *
     * @param balls      list of balls to sort
     * @param comparator balls comparison criterion
     */
    public static void quickSort(List<Ball> balls, BallComparator comparator) {
        startQuickSortIteration(balls, 0, balls.size() - 1, comparator);
    }

    private static void startQuickSortIteration(List<Ball> balls, int lowerLimit, int upperLimit,
                                                BallComparator comparator) {
        if (balls.size() == 0 || lowerLimit >= upperLimit) {
            return;
        }

        int middle = lowerLimit + (upperLimit - lowerLimit) / 2;
        Ball supportElement = balls.get(middle);

        int i = lowerLimit;
        int j = upperLimit;
        while (i <= j) {
            while (comparator.compare(balls.get(i), supportElement) < 0) {
                i++;
            }
            while (comparator.compare(balls.get(j), supportElement) > 0) {
                j--;
            }
            if (i <= j) {
                Ball temp = balls.get(i);
                balls.set(i, balls.get(j));
                balls.set(j, temp);
                i++;
                j--;
            }
        }

        if (lowerLimit < j) {
            startQuickSortIteration(balls, lowerLimit, j, comparator);
        }
        if (upperLimit > i) {
            startQuickSortIteration(balls, i, upperLimit, comparator);
        }
    }

    /**
     * Heap sort for balls list.
     *
     * @param balls      list of balls to sort
     * @param comparator balls comparison criterion
     */
    public static void heapSort(List<Ball> balls, BallComparator comparator) {
        int size = balls.size();

        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(balls, size, i, comparator);
        }

        for (int i = size - 1; i >= 0; i--) {
            Ball temp = balls.get(0);
            balls.set(0, balls.get(i));
            balls.set(i, temp);

            heapify(balls, i, 0, comparator);
        }
    }

    private static void heapify(List<Ball> balls, int size, int root, BallComparator comparator) {
        int largest = root;
        int l = 2 * root + 1;
        int r = 2 * root + 2;

        if (l < size && comparator.compare(balls.get(l), balls.get(largest)) > 0) {
            largest = l;
        }

        if (r < size && comparator.compare(balls.get(r), balls.get(largest)) > 0) {
            largest = r;
        }

        if (largest != root) {
            Ball temp = balls.get(root);
            balls.set(root, balls.get(largest));
            balls.set(largest, temp);

            heapify(balls, size, largest, comparator);
        }
    }
}
