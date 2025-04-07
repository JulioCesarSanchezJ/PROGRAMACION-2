
import java.util.Random;
import java.util.Scanner;
class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = Integer.MAX_VALUE;}
    public void reiniciaPartida() {
        this.numeroDeVidas = 3;}
    public void actualizaRecord() {
        if (numeroDeVidas < record) {
            record = numeroDeVidas;
            System.out.println("�Nuevo record: " + record + " vidas!");}}
    public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            System.out.println("Te quedan " + numeroDeVidas + " vidas.");
            return true; 
        } else {
            System.out.println("�Has perdido todas tus vidas!");
            return false;}}}






