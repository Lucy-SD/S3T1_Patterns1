package level3.concreteCommands;

import level3.interfaces.Command;
import level3.interfaces.Vehicle;

public class StartCommand implements Command {
    private final Vehicle vehicle;

    public StartCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.start();
    }
}
