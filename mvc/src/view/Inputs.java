package mvc.src.view;

import java.util.Scanner;

public class Inputs {
    private Scanner scanner = new Scanner(System.in);
    private String[] menu = {
            "Listar amigos",
            "Registrar amigo",
            "buscar amigo",
            "Actualizar amigo",
            "Borrar amigo",
            "Salir"
    };

    public String getInputString() {
        return scanner.nextLine();
    }

    public long getInputLong() {
        return scanner.nextLong();
    }

    public int getInputInt() {
        return scanner.nextInt();
    }

    public void showMenu() {
        System.out.println("Bienvenida Rosita a su agenda\n");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("❯ " + (i + 1) + ". " + menu[i]);
        }
    }
}
