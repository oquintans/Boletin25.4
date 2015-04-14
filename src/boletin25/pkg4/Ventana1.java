/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25.pkg4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author oquintansocampo
 */
public class Ventana1 implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton;

    public Ventana1() {
        marco = new JFrame(" Evento 1");
        panel = new JPanel();
        boton = new JButton(" Pulsar ");
        boton.addActionListener(this);
        panel.add(boton);
        marco.add(panel);

        marco.setSize(100, 100);
        marco.setResizable(false);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (boton == e.getSource()) {
            Ventana2 v = new Ventana2();
        }
    }
}
