package ventana;

import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaMain extends JFrame {
    public JPanel panel;
    JComboBox<Object> conversores1;
    JButton boton1 = new JButton();

    public VentanaMain() {

        int width = 500;
        int height = 300;

        setTitle("Conversor");
        setSize(width, height);
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
        colocarEtiquetas();
        colocarBotones();
        colocarConversores();
        panel.setBackground(Color.MAGENTA);

    }

    private void colocarEtiquetas() {

        /************* TITULO *************/
        JLabel etiqueta = new JLabel("Conversor" /*, SwingConstants.CENTER*/); //para centrar el titulo
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setOpaque(false); //pintar fondo de etiqueta
        etiqueta.setBounds(0, 50, 500, 25);
        etiqueta.setForeground(Color.WHITE);//font color
        etiqueta.setFont(new Font("arial", Font.BOLD, 30));
        panel.add(etiqueta);
        etiqueta.setBackground(null);

        /************* IMAGEN *************/
        ImageIcon logo = new ImageIcon("src\\img\\Logo.png");
        JLabel etiquetaLogo = new JLabel();
        etiquetaLogo.setBounds(60, 60, 100, 80);
        etiquetaLogo.setIcon(new ImageIcon(logo.getImage().getScaledInstance(etiquetaLogo.getWidth(),
                etiquetaLogo.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiquetaLogo);

        /************* PREGUNTA *************/
        JLabel seleccionar = new JLabel("Selecciona tipo de conversion", SwingConstants.CENTER);
        seleccionar.setOpaque(false); 
        seleccionar.setBounds(0, 100, 500, 25);
        seleccionar.setForeground(Color.WHITE);
        seleccionar.setFont(new Font("arial", Font.BOLD, 12));
        panel.add(seleccionar);


    }
    private void colocarConversores() {
        String[] opciones = { "Monedas", "Temperatura" };
        conversores1 = new JComboBox<>(opciones);
        conversores1.setSelectedItem("Monedas");
        conversores1.setBounds(175, 130, 150, 30);
        panel.add(conversores1);
    }

    private void colocarBotones() {
        boton1.setText("Aceptar");
        boton1.setBounds(175, 180, 150, 25);
        boton1.setEnabled(true);
        panel.add(boton1);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (conversores1.getSelectedItem() == "Monedas") {
                    VentanaConversorMonedas a = new VentanaConversorMonedas();
                    a.setVisible(true);
                    dispose();
                } else if (conversores1.getSelectedItem() == "Temperatura") {
                    VentanaConversorTemp b = new VentanaConversorTemp();
                    b.setVisible(true);
                    dispose();
                } 
                ;
            }
        });
    };




}

