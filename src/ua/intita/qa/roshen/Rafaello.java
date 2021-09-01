package ua.intita.qa.roshen;

public class Rafaello extends Sweets {
    private int numberOfCandiesInBox;

    public Rafaello(String name, double weight, double sugarConsistence, int numberOfCandiesInBox) {
        super(name, weight, sugarConsistence);
        this.numberOfCandiesInBox = numberOfCandiesInBox;
    }

    @Override
    public String toString() {
        return super.toString() + " numberOfCandiesInBox= " + numberOfCandiesInBox;
    }
}
