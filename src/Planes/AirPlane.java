package Planes;

public class AirPlane extends FlyObject implements Landing, TakeOff {

    public AirPlane(String name, int wheels, int windows, int sits) {
        super(name, wheels, windows, sits);
    }

    @Override
    public String Fly() {
        return "Взлетает горизонтально";
    }
}
