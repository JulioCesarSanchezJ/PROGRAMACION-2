
public class Galeria extends Boleto {
    private int diasAnticipacion;
    public Galeria(int numero, int diasAnticipacion) {
        super(numero);
        this.diasAnticipacion = diasAnticipacion;
    }
    @Override
    public double getPrecio() {
        return diasAnticipacion >= 10 ? 25.0*numero : 30.0*numero;
    }
}
