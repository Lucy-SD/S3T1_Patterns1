package level1.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class Undo {

    private static Undo instance;
    private final Deque<String> history;

    private Undo() {
        history = new ArrayDeque<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        history.addLast(command);
    }

    public String removeLastCommand() {
        return history.pollLast();
    }

    public boolean hasCommands() {
        return !history.isEmpty();
    }

    public String getHistory() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n*** Historial de Comandos ***\n");
        int i = 1;
        for (String command : history) {
            sb.append(i++).append("- ").append(command).append("\n");
        }
        sb.append("-----------------------------\n");
        return sb.toString();
    }
}
