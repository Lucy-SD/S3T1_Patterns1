package level3.concreteVehicles;

import level3.interfaces.Vehicle;

public class Car implements Vehicle {

    public void start() {
        System.out.println("Auto en marcha.");
    }

    public void accelerate() {
        System.out.println("Auto desacelerando.");
    }

    public void brake() {
        System.out.println("Auto frenando.");
    }

}
