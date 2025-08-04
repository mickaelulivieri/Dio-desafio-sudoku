package br.com.dio.ui.custom;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CheckGameStatusButton extends JButton {

    public CheckGameStatusButton(final ActionListener actionListener) {
        this.setText("Verificar jogo");
        this.addActionListener(actionListener);
    }


}
