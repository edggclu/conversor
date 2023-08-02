package valores.grados;

public class Grados {
    public int valor;
    public String nombre;

    public Grados(int valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    };
    
    public double getValor(Grados m) {
        return m.valor;
    }
}
