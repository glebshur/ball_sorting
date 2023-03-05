package shgo.innowise.trainee.ballsorting.ball;

/**
 * Class represents tennis ball in ball hierarchy.
 */
public class TennisBall extends Ball {
    public TennisBall() {
        super(6.4, 0.0585, 9, "Head", Color.YELLOW);
    }

    public TennisBall(double diameter, double weight, double price,
                      String companyName, Color color) {
        super(diameter, weight, price, companyName, color);
    }

    @Override
    public void kick() {
        System.out.println("You kick tennis ball");
    }
}
