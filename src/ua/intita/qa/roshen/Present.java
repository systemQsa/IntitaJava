package ua.intita.qa.roshen;

import java.util.Arrays;

public class Present {
    private final Sweets[] present;
    private double totalWeight;
    double sum = 0;

    public Present(Sweets[] present) {
        this.present = present;
    }

    public void printTotalWeight() {
        for (Sweets sweet : present) {
            setTotalWeight(sweet.getWeight());
        }
        System.out.println("total present weight = " + getTotalWeight());
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight += totalWeight;
    }

    public void printCandiesByName() {
        Arrays.sort(present);
        Arrays.stream(present).forEach(System.out::println);
    }

    public void printCandySugarConsistence(double sugarFrom, double sugarTo) {
        for (Sweets candy : present) {
            if (candy.getSugarConsistence() >= sugarFrom && candy.getSugarConsistence() <= sugarTo) {
                System.out.println(candy.getName());
            }
        }
    }
}
