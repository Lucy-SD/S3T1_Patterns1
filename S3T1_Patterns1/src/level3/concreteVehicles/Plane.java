package level3.concreteVehicles;

import level3.interfaces.Vehicle;

public class Plane implements Vehicle {

    public void start() {
        System.out.println("Avión en marcha.");
    }

    public void accelerate() {
        System.out.println("Avión desacelerando.");
    }

    public void brake() {
        System.out.println("Avión frenando.");
    }
}
