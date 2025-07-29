package level3.concreteVehicles;

import level3.interfaces.Vehicle;

public class Boat implements Vehicle {

    public void start() {
        System.out.println("Bote en marcha.");
    }

    public void accelerate() {
        System.out.println("Bote desacelerando.");
    }

    public void brake() {
        System.out.println("Bote frenando.");
    }
}
