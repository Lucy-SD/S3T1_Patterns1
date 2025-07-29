package level3.parkingLot;

import level3.concreteCommands.AccelerateCommand;
import level3.concreteCommands.BrakeCommand;
import level3.concreteCommands.StartCommand;
import level3.concreteVehicles.Bicycle;
import level3.concreteVehicles.Boat;
import level3.concreteVehicles.Car;
import level3.concreteVehicles.Plane;
import level3.interfaces.Command;
import level3.interfaces.Vehicle;

import java.util.List;

public class ParkingLot {
    private final List<Vehicle> vehicles;

    public ParkingLot() {
        vehicles = List.of(new Car(), new Bicycle(), new Plane(), new Boat());

    }
    public void executeCommands() {
        for(Vehicle vehicle : vehicles) {
            Command start = new StartCommand(vehicle);
            Command accelerate = new AccelerateCommand(vehicle);
            Command brake = new BrakeCommand(vehicle);

            start.execute();
            accelerate.execute();
            brake.execute();
            System.out.println("        ----");
        }
    }
}
