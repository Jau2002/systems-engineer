package mvc.src.view;

import java.util.Scanner;

public class Inputs {
    private Scanner scanner = new Scanner(System.in);

    public String getInputString() {
        return scanner.nextLine();
    }

    public long getInputLong() {
        return scanner.nextLong();
    }

    public int getInputInt() {return scanner.nextInt(); }

    public String formatMenu(int option, String function) {
        return option + ". " + function + "\n";
    }

    public void closeScanner() { scanner.close(); }

    public void showMenu () { System.out.println(menu()); }
    public String menu() {
        return "Bienvenida Rosita a su agenda\n"
                + formatMenu(1, "Listar amigos")
                + formatMenu(2, "Registrar amigo")
                + formatMenu(3, "buscar amigo")
                + formatMenu(4, "Actualizar amigo")
                + formatMenu(5, "Borrar amigo")
                + formatMenu(6, "Salir");
    }
}
