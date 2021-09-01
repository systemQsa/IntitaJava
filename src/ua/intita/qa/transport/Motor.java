package ua.intita.qa.transport;

public class Motor {
    private String motorType;
    private String enginePower;
    private double capacity;

    public String getMotorType() {
        return motorType;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public Motor(String type) {
        this.motorType = type;
    }

    // ToDo state and behaviour (fields and methods)
    public void refuelMotor() {
        System.out.println("refueled " + getMotorType() + "\ncapacity " + getCapacity());
    }

}
