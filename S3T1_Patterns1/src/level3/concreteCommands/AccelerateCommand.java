package level3.concreteCommands;

import level3.interfaces.Command;
import level3.interfaces.Vehicle;

public class AccelerateCommand implements Command {
    private final Vehicle vehicle;

    public AccelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.accelerate();
    }
}