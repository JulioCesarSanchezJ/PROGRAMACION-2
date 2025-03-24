import java.util.Locale;
import java.util.Scanner;
public class EcuacionCuadratica {

      private double a;
      private double b;
      private double c;

    public EcuacionCuadratica() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    public double getRaiz1() {
        return (-b + Math.sqrt(getDiscriminante())) / (2 * a);
    }

    public double getRaiz2() {
        return (-b - Math.sqrt(getDiscriminante())) / (2 * a);
    }

    public void mostrarResultado() {
        double discriminante = getDiscriminante();

        //System.out.println("\nEcuación cuadrática: " + a + "x^2 + " + b + "x + " + c + " = 0");
        //System.out.println("Discriminante: " + discriminante);

        if (discriminante > 0) {
            double r1 = getRaiz1();
            double r2 = getRaiz2();
            System.out.println("La ecuación tiene dos raíces: "+r1+" y "+r2);
            } 
            else if (discriminante == 0) {
                double r = getRaiz1(); 
                System.out.println("La ecuación tiene una raíz: "+r);
            } 
            else {
                System.out.println("La ecuación no tiene raíces reales");
            }
        }
        
        public void leerDatos(){
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.US);
            double[] aux = new double[3];
            System.out.println("Ingrese a, b, c: ");
            for (int i = 0; i < 3; i++) {
                aux[i] = sc.nextDouble();
            }
            //System.out.print("Ingrese el valor de a: ");
            this.a = aux[0];

            //System.out.print("Ingrese el valor de b: ");
            this.b = aux[1];

            //System.out.print("Ingrese el valor de c: ");
            this.c = aux[2];
            //sc.close();
        }   
}
