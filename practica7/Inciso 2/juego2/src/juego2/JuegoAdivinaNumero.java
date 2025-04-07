package juego2;
import java.util.Random;
import java.util.Scanner;
class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);}
    public void juega(Scanner scanner) { 
        reiniciaPartida();
        numeroAAdivinar = new Random().nextInt(11); 
        System.out.println("Adivina un número entre 0 y 10:");
        while (true) {
            int intento = scanner.nextInt();
            if (!validaNumero(intento)) {
                System.out.println("Número inválido. Intenta de nuevo.");
                continue;}
            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!!");
                actualizaRecord();
                break;
            } else {
                if (!quitaVida()) {
                    break;}
                if (intento < numeroAAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else {
                    System.out.println("El número a adivinar es menor.");} }}}
    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;}}