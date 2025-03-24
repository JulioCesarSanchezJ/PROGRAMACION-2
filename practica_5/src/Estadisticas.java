import java.util.Locale;
import java.util.Scanner;
public class Estadisticas {
    private double[] valores;

    public Estadisticas(){
        this.valores=new double[10];
    }
    
    public Estadisticas(double[] valores) {
        this.valores = valores;
    }

    public double promedio() {
        double suma = 0;
        for (double v : valores) {
            suma += v;
        }
        return suma / valores.length;
    }

    public double desviacionEstandar() {
        double prom = promedio();
        double sumaCuadrados = 0;

        for (double v : valores) {
            double diferencia = v - prom;
            sumaCuadrados += diferencia * diferencia;
        }

        return Math.sqrt(sumaCuadrados / (valores.length - 1));
    }

    public void mostrarResultado() {
        System.out.println("El promedio es " + promedio());
        System.out.println("La desviación estándar es " + desviacionEstandar());
    }

    public void leerDatos(){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        //double[] valores = new double[10];
        System.out.println("Ingrese 10 números :");
        for (int i = 0; i < 10; i++) {
            valores[i] = sc.nextDouble();
        }
        //sc.close();
    }
    
    public void mostrar(){
        for(int i=0;i<10;i++){
            System.out.println(valores[i]);
        }
    }
}
