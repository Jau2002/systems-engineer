package controller;

import models.Num;
import view.Console;

import java.util.ArrayList;

public class Controller {
    private Num num = new Num();
    private Console console = new Console();

    public void handleOption() {
        this.console.sendMenu();
        int option = this.console.getInputNumber();

        switch (option) {
            case 1:
                this.console.output("type an integer");
                int number = this.console.getInputNumber();
                this.num.isPrime(number);
                break;
            case 2:
                this.console.output("Good bye");
                break;
            default:
                this.console.output("Failed option");
        }
    }
}
