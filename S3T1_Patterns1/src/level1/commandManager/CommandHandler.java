package level1.commandManager;

import level1.command.Undo;
import level1.userInteraction.OutputManager;

import java.util.Scanner;

public class CommandHandler {
    private final OutputManager output;
    private final Undo history;

    public CommandHandler(OutputManager output, Undo history) {
        this.output = output;
        this.history = history;
    }

    public void handleAddCommand(Scanner scan) {
        System.out.println(output.promptCommand());
        String command = scan.nextLine();
        history.addCommand(command);
        System.out.println(output.commandAdded());
    }

    public void handleRemoveCommand() {
        if (history.hasCommands()) {
            String removed = history.removeLastCommand();
            System.out.println(output.commandRemoved(removed));
        } else {
            System.err.println(output.noCommandsToRemove());
        }
    }

    public void handleGetHistory() {
        if(history.hasCommands()) {
            System.out.println(history.getHistory());
        } else {
            System.err.println(output.noHistoryToShow());
        }
    }
}
