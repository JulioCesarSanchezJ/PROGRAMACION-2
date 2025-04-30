
public class Palco extends Boleto {
    public Palco(int numero) {
        super(numero);
    }
    @Override
    public double getPrecio() {
        return numero*100.0;
    }
}
