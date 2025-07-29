package level3.concreteCommands;

import level3.interfaces.Command;
import level3.interfaces.Vehicle;

public class BrakeCommand implements Command {
    private final Vehicle vehicle;

    public BrakeCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.brake();
    }
}