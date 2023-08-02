package ventana;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaConversorTemp extends JFrame {
    public JPanel panel;

    public VentanaConversorTemp() {
        int width = 700;
        int height = 500;

        setTitle("Conversor de Temperatura");
        setSize(width, height);
        setMinimumSize(new Dimension(450, 400));
        setLocationRelativeTo(null);

        //getContentPane().setBackground(Color.BLUE);

        initialize();
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initialize() {

        panel = new JPanel();
        panel.setLayout(null);
        // panel.setBackground(Color.LIGHT_GRAY);
        this.getContentPane().add(panel);
        colocarBotones();
        panel.setBackground(Color.MAGENTA);

    }

    private void colocarBotones() {
        JButton boton1 = new JButton("< Volver");
        boton1.setBounds(50, 100, 100, 40);
        boton1.setEnabled(true);
        panel.add(boton1);

        boton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaMain a = new VentanaMain();
                a.setVisible(true);
                dispose();
            }
        });
    }
}