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

        Ball temp;
        while (i <= j) {
            while (comparator.compare(balls.get(i), supportElement) < 0) {
                i++;
            }
            while (comparator.compare(balls.get(j), supportElement) > 0) {
                j--;
            }
            if (i <= j) {
                temp = balls.get(i);
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

        Ball temp;
        for (int i = size - 1; i >= 0; i--) {
            temp = balls.get(0);
            balls.set(0, balls.get(i));
            balls.set(i, temp);

            heapify(balls, i, 0, comparator);
        }
    }

    private static void heapify(List<Ball> balls, int size, int root, BallComparator comparator) {
        int largest = root;         // largest element index
        int left = 2 * root + 1;    // left tree element index
        int right = 2 * root + 2;   // right tree element index

        if (left < size && comparator.compare(balls.get(left), balls.get(largest)) > 0) {
            largest = left;
        }

        if (right < size && comparator.compare(balls.get(right), balls.get(largest)) > 0) {
            largest = right;
        }

        if (largest != root) {
            Ball temp = balls.get(root);
            balls.set(root, balls.get(largest));
            balls.set(largest, temp);

            heapify(balls, size, largest, comparator);
        }
    }
}
