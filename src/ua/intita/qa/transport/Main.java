package ua.intita.qa.transport;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("v engine");
        motor.setCapacity(260.2);

        Wheel wheel = new Wheel();
        wheel.setType("Tire 59");

        Auto auto = new Auto("bmw", motor, wheel);

        // ToDo call methods
        auto.printBrand();
        auto.setCarDetails();
        auto.drive();
    }
}
