package Planes;

public class Main {
    public static void main(String[] args) {
        AirPlane air = new AirPlane("Boing", 8, 20, 250);

        Helicopter heli = new Helicopter("Стрекоза", 3, 6, 10);

        Airport manas = new Airport(air);

        System.out.println(air.Fly());

        manas.TakingOff(air);

    }
}
