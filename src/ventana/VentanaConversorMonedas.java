package ventana;

import valores.monedas.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaConversorMonedas extends JFrame {
    public JPanel panel;
    JComboBox<Object> deMoneda;
    JComboBox<Object> aMoneda;
    
    JTextField caja;
    JTextField caja2;

    public VentanaConversorMonedas() {
        int width = 500;
        int height = 300;

        setTitle("Conversor de Monedas");
        setSize(width, height);
        setLocationRelativeTo(null);
        initialize();
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initialize() {

        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        colocarElementos();
        agregaOpciones();
        panel.setBackground(Color.MAGENTA);

    }

    private void colocarElementos() {
        /************* LBAEL ABAJO DEL OUTPUT *************/
        JLabel divisaValor = new JLabel();
        divisaValor.setBounds(300, 130, 125, 20);
        panel.add(divisaValor);

        /*********** BOTON VOLER ***********/
        JButton boton1 = new JButton("< Volver");
        boton1.setBounds(50, 200, 100, 20);
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

        /*********** BOTON CONVERTIR ***********/
        JButton botonConvertir = new JButton("Convertir");
        botonConvertir.setBounds(250, 190, 110, 40);
        botonConvertir.setEnabled(true);
        panel.add(botonConvertir);
        botonConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConversorDivi conversor = new ConversorDivi();
                Double g = Double.parseDouble(caja.getText());
                String respuesta = (conversor.convertir(deMoneda.getSelectedIndex(), aMoneda.getSelectedIndex(), g));
                caja2.setText("$ " + (respuesta));
                divisaValor.setText(conversor.imprimirDivi(deMoneda.getSelectedIndex(), aMoneda.getSelectedIndex()));
            }
        });

        /*********** BOTON LIMPIAR ***********/
        JButton botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(370, 190, 80, 40);
        botonLimpiar.setEnabled(true);
        panel.add(botonLimpiar);
        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caja.setText(null);
                caja2.setText(null);
                divisaValor.setText(null);
            }
        });

        /*********** INPUT  ***********/
        caja = new JTextField();
        caja.setBounds(40, 100, 200, 30);
        caja.setEditable(true);;
        panel.add(caja);

        /*********** OUTPUT  ***********/
        caja2 = new JTextField();
        caja2.setBounds(250, 100, 200, 30);
        caja2.setEditable(false);;
        panel.add(caja2);
    }
    
    private void agregaOpciones() {
        String[] opciones = { "Dolar-USD", "Peso-MXN", "Peso-ARG", "Peso-COL", "Peso-CH", "Quetzal-GT", "Euro" };

        /*********** DE ***********/ //Moneda origen
        JLabel deLabel = new JLabel("De:");
        deLabel.setBounds(40, 48, 50, 20);
        deMoneda = new JComboBox<>(opciones);
        deMoneda.setSelectedItem("Peso-MXN");
        deMoneda.setBounds(40, 65, 140, 20);
        panel.add(deMoneda);
        panel.add(deLabel);

        /*********** A ***********/ //Moneda Destino
        JLabel aLabel = new JLabel("A:");
        aLabel.setBounds(250, 48, 50, 20);
        aMoneda = new JComboBox<>(opciones);
        aMoneda.setSelectedItem("Dolar-USD");
        aMoneda.setBounds(250, 65, 140, 20);
        panel.add(aMoneda);
        panel.add(aLabel);
    }
    
}

            

