package level1.runner;

import level1.command.Undo;
import level1.commandManager.CommandHandler;
import level1.userInteraction.OutputManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramRunner {
    public static void run() {

        Scanner scan = new Scanner(System.in);
        OutputManager output = new OutputManager();

        Undo history = Undo.getInstance();
        CommandHandler commandHandler = new CommandHandler(output, history);

        System.out.println(output.welcomeMessage());
        while (true) {
            System.out.print(output.showMenu());

            try {
                int option = scan.nextInt();
                scan.nextLine();

                switch (option) {
                    case 1 -> commandHandler.handleAddCommand(scan);
                    case 2 -> commandHandler.handleRemoveCommand();
                    case 3 -> commandHandler.handleGetHistory();
                    case 0 -> {
                        System.out.println(output.exitMessage());
                        return;
                    }
                    default -> System.err.println(output.invalidOption());
                }

            } catch (InputMismatchException e) {
                System.err.println(output.inputError());
                scan.nextLine();
            }
        }
    }
}
