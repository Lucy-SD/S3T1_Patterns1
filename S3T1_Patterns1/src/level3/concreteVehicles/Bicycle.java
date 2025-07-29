package level3.concreteVehicles;

import level3.interfaces.Vehicle;

public class Bicycle implements Vehicle {

    public void start() {
        System.out.println("Bicicleta en marcha.");
    }

    public void accelerate() {
        System.out.println("Bicicleta desacelerando.");
    }

    public void brake() {
        System.out.println("Bicicleta frenando.");
    }
}
