package ua.intita.qa.transport;

public class Main {
    public static void main(String[] args) {

        Motor motor = new Motor();
        // setters or constr
        Wheel wheel = new Wheel();
        // setters or constr
        Auto auto = new Auto("...", motor, wheel);

        // ToDo call methods
    }
}
