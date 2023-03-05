package shgo.innowise.trainee.ballsorting.ball;

/**
 * Class represents baseball in ball hierarchy.
 */
public class Baseball extends Ball {

    public Baseball() {
        super(7.3, 0.145, 5.2, "Wilson Official League", Color.WHITE);
    }

    public Baseball(double diameter, double weight, double price, String companyName, Color color) {
        super(diameter, weight, price, companyName, color);
    }

    @Override
    public void kick() {
        System.out.println("You kick baseball");
    }
}
