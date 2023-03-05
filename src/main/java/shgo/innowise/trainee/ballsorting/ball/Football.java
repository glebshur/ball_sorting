package shgo.innowise.trainee.ballsorting.ball;

/**
 * Class represents football in ball hierarchy.
 */
public class Football extends Ball {
    public Football() {
        super(64.5, 0.4, 10, "Adidas", Color.BLACK_AND_WHITE);
    }

    public Football(double diameter, double weight, double price, String companyName, Color color) {
        super(diameter, weight, price, companyName, color);
    }

    @Override
    public void kick() {
        System.out.println("You kick football");
    }
}
