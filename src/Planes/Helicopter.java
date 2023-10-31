package Planes;

public class Helicopter extends FlyObject implements Landing, TakeOff{

    public Helicopter(String name, int wheels, int windows, int sits) {
        super(name, wheels, windows, sits);
    }

    @Override
    public String Fly() {
        return "Взлетает вертикально";
    }
}
