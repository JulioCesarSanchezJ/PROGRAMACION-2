
public abstract class Boleto {
    protected int numero;
    public Boleto(int numero) {
        this.numero = numero;
    }
    public abstract double getPrecio();
    @Override
    public String toString() {
        return "Número: " + numero + ", Precio: " + getPrecio();
    }
}
