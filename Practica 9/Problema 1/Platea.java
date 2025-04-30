
public class Platea extends Boleto {
    private int diasAnticipacion;
    public Platea(int numero, int diasAnticipacion) {
        super(numero);
        this.diasAnticipacion = diasAnticipacion;
    }
    @Override
    public double getPrecio() {
        return diasAnticipacion >= 10 ? 50.0*numero : 60.0*numero;
    }
}
