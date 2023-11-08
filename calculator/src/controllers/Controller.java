package src.controllers;

import src.views.GUI;
import src.views.HandlerOnClick;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    GUI gui;
    List<String> output = new ArrayList<>();

    HandlerOnClick clickHandler = buttonText -> {
        output.add(buttonText);
        System.out.println(output);
        return buttonText;
    };

    public Controller() {
        gui = new GUI(clickHandler);
    }

    public void exe() {
        gui.createButtons();
        gui.buildUI();
    }
}
