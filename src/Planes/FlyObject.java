package Planes;

public abstract class FlyObject {
    public String name;
    public String wings;
    public int wheels;
    public int windows;
    private int sits;

    public FlyObject(String name, int wheels, int windows, int sits) {
        this.name = name;
        this.wheels = wheels;
        this.windows = windows;
        this.sits = sits;
    }

    public abstract String Fly();
}
