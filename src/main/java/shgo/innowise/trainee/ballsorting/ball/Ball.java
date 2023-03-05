package shgo.innowise.trainee.ballsorting.ball;

/**
 * Abstract ball class in the ball hierarchy.
 */
public abstract class Ball {

    protected double diameter;
    protected double weight;
    protected double price;
    protected String companyName;
    protected Color color;

    /**
     * All args constructor.
     *
     * @param diameter ball's diameter
     * @param weight ball's weight
     * @param price ball's price
     * @param companyName ball's company name
     * @param color ball's color
     */
    public Ball(double diameter, double weight, double price, String companyName, Color color) {
        this.diameter = diameter;
        this.weight = weight;
        this.price = price;
        this.companyName = companyName;
        this.color = color;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void kick();
}
