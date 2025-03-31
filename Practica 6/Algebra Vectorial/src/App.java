import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        
        //double[] vecA = {3, -3, 1};
        //double[] vecB = {4, 4, -2};
        double[] vecA = {0, 0, 0};
        double[] vecB = {0, 0, 0};

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Ingrese el vector A: ");
        for (int i = 0; i<3; i++) {
            vecA[i] = sc.nextDouble();
        }
        System.out.println("Ingrese el vector B: ");
        for (int i = 0; i<3; i++) {
            vecB[i] = sc.nextDouble();
        }
        sc.close();

        AlgebraVectorial alg = new AlgebraVectorial(vecA, vecB);

        System.out.println("\n----- Comprobación de Perpendicularidad -----");
        alg.Perpendicular();

        System.out.println("\n----- Comprobación de Paralelismo -----");
        alg.Paralelo();

        System.out.println("\n----- Proyección de a sobre b -----");
        double[] proy = alg.Proyeccion();
        System.out.printf("Proyección: (%.2f, %.2f, %.2f)%n", proy[0], proy[1], proy[2]);

        System.out.println("\n----- Componente de a en la dirección de b -----");
        System.out.printf("Componente: %.2f%n", alg.Componente());
    }
}
