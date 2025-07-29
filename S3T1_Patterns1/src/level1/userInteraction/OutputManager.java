package level1.userInteraction;

public class OutputManager {


    public String welcomeMessage() {
        return "Bienvenido . . .";
    }

    public String showMenu() {
        return """
                Elija una opción (0-3):
                1. Añadir un comando.
                2. Eliminar el último comando.
                3. Ver el historial de comandos.
                0. Salir.
                """;
    }

    public String promptCommand() {
        return "Ingrese un comando:";
    }

    public String commandAdded() {
        return "Comando guardado correctamente.";
    }

    public String noCommandsToRemove() {
        return "No hay comandos para eliminar.";
    }

    public String commandRemoved(String command) {
        return "Comando: <" + command + "> eliminado correctamente.";
    }

    public String noHistoryToShow() {
        return "No hay historial para mostrar.";
    }


    public String exitMessage() {
        return "Gracias por su visita = )";
    }

    public String invalidOption() {
        return "Opción no válida.";
    }

    public String inputError() {
        return "Error: debe ingresar un valor numérico (0-3)";
    }
}
