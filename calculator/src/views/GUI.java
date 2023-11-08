package src.views;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GUI {
    private String[] type = {"^", "%", "√", "AC", "1", "2", "3", "÷", "4", "5", "6", "×", "7", "8", "9", "-", "0", ",", "=", "+"};
    private JPanel panel, keypad;
    private JFrame window;
    private List<JButton> buttons;
    private JTextField display;
    private Events event;

    public GUI(HandlerOnClick handlerOnClick) {
        window = new JFrame();
        panel = new JPanel(new BorderLayout());
        buttons = new ArrayList<>();
        display = new JTextField();
        event = new Events(handlerOnClick);
    }

    public void createButtons() {
        for (String buttonType : type) {
            JButton button = new JButton(buttonType);
            buttons.add(button);
            button.addActionListener(event);
        }
    }

    public void buildUI() {
        keypad = new JPanel(new GridLayout(5, 4, 5, 5));

        for (JButton button : buttons) {
            keypad.add(button);
        }

        panel.add(display, BorderLayout.NORTH);
        panel.add(keypad, BorderLayout.CENTER);

        window.add(panel);
        window.setSize(400, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
