package Planes;

public class Airport {

    AirPlane plane;

    Helicopter helicopter;

    public Airport(AirPlane plane) {
        this.plane = plane;
    }

    public Airport(Helicopter helicopter) {
        this.helicopter = helicopter;
    }

    public void Fly(Landing land){
        System.out.println(land.Landing());
    }

    public void TakingOff(TakeOff takeOff){
        System.out.println(takeOff.TakeOff());
    }


}
