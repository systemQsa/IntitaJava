package ua.intita.qa.transport;

public class Wheel {
    private String wheelType;

    public String getType() {
        return wheelType;
    }

    public void setType(String type) {
        this.wheelType = type;
    }

    // ToDo state and behaviour (fields and methods)
    public void changeWheel() {
        System.out.println("changed wheel to " + wheelType);
    }
}
