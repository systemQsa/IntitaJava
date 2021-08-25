package duke.choice;

 abstract public class Gadget {
    abstract public void on();

    abstract public void off();
}

class TV extends Gadget{
    @Override
    public void on() {
        System.out.println("TV switch on");
    }

    @Override
    public void off() {
        System.out.println("TV switch off");
    }
}

class Camera extends Gadget{
    @Override
    public void on() {
        System.out.println("Camera is switch on");
    }

    @Override
    public void off() {
        System.out.println("CAmera is switched off");
    }
}
