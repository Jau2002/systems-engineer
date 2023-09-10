package view;

import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);

    public int getInputNumber() {
        return this.scanner.nextInt();
    }

    public String format(int index, String function) {
        return "\n[" + index + "]. " + function;
    }

    public String formatMenu() {
        return "\nWelcome this functionality"
                + this.format(1, "Check if it's prime")
                + this.format(2, "exit the menu");
    }

    public void output(String arg) {
        System.out.println(arg);
    }

    public void sendMenu() {
        String menu = this.formatMenu();
        this.output(menu);
    }
}
