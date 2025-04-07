package juego2;
class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);}
    @Override
    public boolean validaNumero(int numero) {
        if (numero % 2 != 0 && super.validaNumero(numero)) {
            return true; 
        } else {
            System.out.println("Error: El número debe ser impar y estar entre 0 y 10.");
            return false;}}}
