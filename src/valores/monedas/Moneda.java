package valores.monedas;

public class Moneda {
    public double valor;
    public String nombre;

    public Moneda(Double valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    };
    
    public double getValor(Moneda m) {
        return m.valor;
    }
}
