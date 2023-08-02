package valores.grados;

public class ConversorGrados {
    public ConversorGrados() {

    }

    Grados celcius = new Grados(0, "C°");
    Grados fahrenheit = new Grados(1, "F°");
    Grados kelvin = new Grados(2, "K°");

    Grados[] grados = { celcius, fahrenheit, kelvin };


    public double convertir(int a, int b, double c) {
        if (a == 0 && b == 1) {
            return (double) ((c * (9.0 / 5.0)) + 32.0);
        } else if (a == 0 && b == 2) {
            return (double) (c + 273.15);
        } else if (a == 1 && b == 0) {
            return (c - 32.0) * (5.0 / 9.0);
        } else if (a == 1 && b == 2) {
            return ((1.0 - 32.0) * (5.0 / 9.0)) + 273.15;
        } else if (a == 2 && b == 0) {
            return (c - 273.15);
        } else if (a == 2 && b == 1) {
            return ((c - 273.15) * 9.0 / 5.0) + 32.0;
        } else {
            return 0.0;
        }

    }

    public String imprimirDivi(int a, int b) {
        String resultado = "1 " + grados[a].nombre + " \u2248\u2248 " + respuesta(a,b) + " "
                + grados[b].nombre;
        return resultado;
    }

    public double respuesta(int a, int b) {
        if (a == 0 && b == 1) {
            return (double) ((1.0 * (9.0 / 5.0)) + 32.0);
        } else if (a == 0 && b == 2) {
            return (double) (1.0 + 273.15);
        } else if (a == 1 && b == 0) {
            return (1.0 - 32.0) * (5.0 / 9.0);
        } else if (a == 1 && b == 2) {
            return ((1.0 - 32.0) * (5.0 / 9.0)) + 273.15;
        } else if (a == 2 && b == 0) {
            return (1.0 - 273.15);
        } else if (a == 2 && b == 1) {
            return ((1.0 - 273.15) * 9.0 / 5.0) + 32.0;
        } else {
            return 0.0;
        }
    }
}
