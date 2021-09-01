package ua.intita.qa.transport;

public class Auto {

    private String brand;
    private Motor motor;
    private Wheel wheel;

    public Auto(String brand, Motor motor, Wheel wheel) {
        this.brand = brand;
        this.motor = motor;
        this.wheel = wheel;
    }

    public String getBrand() {
        return brand;
    }

    public void printBrand() {
        System.out.println(getBrand());
    }
}
