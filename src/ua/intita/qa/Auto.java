package ua.intita.qa;

public class Auto {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;

    }

    public void drive() {
        System.out.println(getBrand());
    }

    public void printCarBrand() {
        System.out.println(getBrand());
        Motor motor = new Motor();
        motor.refuel();
        Wheel wheel = new Wheel();
        wheel.changeWheel();
    }

    private class Motor {
        public void refuel() {
            System.out.println("refuel the motor for" + brand);
        }
    }

    private class Wheel {
        public void changeWheel() {
            System.out.println("Change a wheel for" + brand);
        }
    }
}
