package shgo.innowise.trainee.ballsorting.ball;

/**
 * Class represents basketball in ball hierarchy.
 */
public class Basketball extends Ball {

    public Basketball() {
        super(74.9, 0.567, 12, "Wilson", Color.ORANGE);
    }

    public Basketball(double diameter, double weight, double price,
                      String companyName, Color color) {
        super(diameter, weight, price, companyName, color);
    }

    @Override
    public void kick() {
        System.out.println("You kick basketball");
    }
}
