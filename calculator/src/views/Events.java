package src.views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Events implements ActionListener {
    private HandlerOnClick handler;

    public Events(HandlerOnClick handler) {
        this.handler = handler;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            JButton onClick = (JButton) e.getSource();
            String text = onClick.getText();
            handler.handlerOnClick(text);
    }
}
