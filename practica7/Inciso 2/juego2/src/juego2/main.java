package juego2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JuegoAdivinaNumero juegoNumero = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);
        System.out.println("Juego de Adivina un N�mero:");
        juegoNumero.juega(scanner);
        System.out.println("\nJuego de Adivina un N�mero Par:");
        juegoPar.juega(scanner);
        System.out.println("\nJuego de Adivina un N�mero Impar:");
        juegoImpar.juega(scanner); 
        scanner.close(); }}