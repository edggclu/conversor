package valores.monedas;

import java.text.DecimalFormat;

public class ConversorDivi {
    public ConversorDivi() {

    }
      
    Moneda dolar = new Moneda(1.0, "dolar");
    Moneda pesoMXN = new Moneda(16.88, "MXN");
    Moneda pesoARG = new Moneda(276.18, "ARG");
    Moneda pesoCOL = new Moneda(3970.53, "COL");
    Moneda pesoCH = new Moneda(841.63, "CHILE");
    Moneda quetzal = new Moneda(7.87, "qtz");
    Moneda euro = new Moneda(0.91, "eu");
    
    Moneda[] monedas = { dolar, pesoMXN, pesoARG, pesoCOL,pesoCH, quetzal, euro };
    
    DecimalFormat df = new DecimalFormat("#.0000");
    public String convertir(int a, int b, double c) {
        // System.out.println(((1 / monedas[a].getValor(monedas[a])) * c) * monedas[b].getValor(monedas[b]) + " " + monedas[b].nombre);
        double operacion = (((1 / monedas[a].getValor(monedas[a])) * c) * monedas[b].getValor(monedas[b]));
        Double.toString(operacion);
        return df.format(operacion);

    }

    public String imprimirDivi(int a, int b) {
        double divisaTransformada = ((1 / monedas[a].getValor(monedas[a])) * monedas[b].getValor(monedas[b]));
        Double.toString(divisaTransformada);
        String resultado = "1 " + monedas[a].nombre + " \u2248\u2248 " + df.format(divisaTransformada) + " " + monedas[b].nombre;
        return resultado;
    }
    
}
