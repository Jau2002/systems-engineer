package src.controllers;

import src.models.Digits;
import src.views.GUI;
import src.views.HandlerOnClick;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    Digits digits;
    GUI gui;
    List<String> output = new ArrayList<>();

    HandlerOnClick clickHandler = buttonText -> {
        output.add(buttonText);
        System.out.println(output);
        return buttonText;
    };

    public Controller() {
        digits = new Digits(output);
        gui = new GUI(clickHandler);
    }

    public void exe() {
        gui.createButtons();
        gui.buildUI();
    }
}
