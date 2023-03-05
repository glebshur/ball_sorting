package shgo.innowise.trainee.ballsorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shgo.innowise.trainee.ballsorting.ball.*;
import shgo.innowise.trainee.ballsorting.sorting.BallSorter;
import shgo.innowise.trainee.ballsorting.sorting.ballComparators.BallDiameterComparator;

import java.util.ArrayList;
import java.util.List;

public class BallSorterTest {

    @Test
    public void quickSortShouldSortList(){

        List<Ball> balls = new ArrayList<>();
        List<Ball> expected = new ArrayList<>();
        Ball ball1 = new Baseball(1, 0, 0, "", Color.WHITE);
        Ball ball2 = new Football(3, 0, 0 ,"", Color.WHITE);
        Ball ball3 = new Basketball(4,0,0,"", Color.WHITE);
        Ball ball4 = new Baseball(10, 0, 0, "", Color.WHITE);
        Ball ball5 = new Football(100, 0,0,"", Color.WHITE);
        balls.add(ball3);
        balls.add(ball5);
        balls.add(ball1);
        balls.add(ball4);
        balls.add(ball2);
        expected.add(ball1);
        expected.add(ball2);
        expected.add(ball3);
        expected.add(ball4);
        expected.add(ball5);

        BallSorter.quickSort(balls, new BallDiameterComparator());

        Assertions.assertIterableEquals(expected, balls);

    }

    @Test
    public void heapSortShouldSortList(){
        List<Ball> balls = new ArrayList<>();
        List<Ball> expected = new ArrayList<>();
        Ball ball1 = new Baseball(1, 0, 0, "", Color.WHITE);
        Ball ball2 = new Football(3, 0, 0 ,"", Color.WHITE);
        Ball ball3 = new Basketball(4,0,0,"", Color.WHITE);
        Ball ball4 = new Baseball(10, 0, 0, "", Color.WHITE);
        Ball ball5 = new Football(100, 0,0,"", Color.WHITE);
        balls.add(ball3);
        balls.add(ball5);
        balls.add(ball1);
        balls.add(ball4);
        balls.add(ball2);
        expected.add(ball1);
        expected.add(ball2);
        expected.add(ball3);
        expected.add(ball4);
        expected.add(ball5);

        BallSorter.heapSort(balls, new BallDiameterComparator());

        Assertions.assertIterableEquals(expected, balls);
    }
}
