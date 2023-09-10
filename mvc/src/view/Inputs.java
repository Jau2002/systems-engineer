package mvc.src.view;

import java.util.Scanner;

public class Inputs {
    Scanner scanner = new Scanner(System.in);

    public String getInputString() {
        return this.scanner.nextLine();
    }

    public int getInputNumber() {
        return this.scanner.nextInt();
    }

    public String formatMenu(int option, String function) {
        return option + ". " + function + "\n";
    }

    public void sendOutput(String message) {
        System.out.println(message);
    };

    public void sendParameters() {
        String name = this.getInputString();
        String address = this.getInputString();
        int number = this.getInputNumber();
        this.scanner.close();
    }
}
