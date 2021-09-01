package ua.intita.qa.roshen;

public class Sweets implements Comparable<Sweets> {
    private String name;
    private double weight;
    private double sugarConsistence;
    private Sweets[] sweets;

    public Sweets[] getSweets() {
        return sweets;
    }

    public Sweets(String name, double weight, double sugarConsistence) {
        this.name = name;
        this.weight = weight;
        this.sugarConsistence = sugarConsistence;
    }

    public Sweets(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Sweets(Sweets[] candy) {
        this.sweets = candy;
    }

    @Override
    public int compareTo(Sweets o) {
        return this.name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugarConsistence() {
        return sugarConsistence;
    }

    public void setSugarConsistence(double sugarConsistence) {
        this.sugarConsistence = sugarConsistence;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", weight= " + weight +
                ", sugarConsistence= " + sugarConsistence;
    }
}
