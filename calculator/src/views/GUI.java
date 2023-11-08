package src.views;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GUI {
    private String[] type = {"1", "2", "3", "4", "5", "6", "7", "8", "9", ",", "CE", "0"};
    private List<JButton> buttons;
    private Events event;

    public GUI(HandlerOnClick handlerOnClick) {
        buttons = new ArrayList<>();
        event = new Events(handlerOnClick);
    }

    public void createButtons() {
        for (String buttonType : type) {
            JButton button = new JButton(buttonType);
            buttons.add(button);
            button.addActionListener(event);
        }
    }
}
