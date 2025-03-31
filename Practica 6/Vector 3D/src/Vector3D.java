import java.util.Locale;
import java.util.Scanner;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // a) sumar
    public static Vector3D suma(Vector3D a, Vector3D b) {
        return new Vector3D(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    // b) multiplicar

    public static Vector3D multiplicarPorEscalar(Vector3D a, double r) {
        return new Vector3D(r * a.x, r * a.y, r * a.z);
    }

    // c) modulo

    public double longitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // d) normal

    public Vector3D normal() {
        double mod = this.longitud();

        if (mod == 0) {
            return new Vector3D(0, 0, 0);
        }
        return new Vector3D(x / mod, y / mod, z / mod);
    }

    // e) producto escalar 

    public static double productoEscalar(Vector3D a, Vector3D b) {
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

    // f) producto vectorial 

    public static Vector3D productoVectorial(Vector3D a, Vector3D b) {
        double cx = a.y * b.z - a.z * b.y;
        double cy = a.z * b.x - a.x * b.z;
        double cz = a.x * b.y - a.y * b.x;
        return new Vector3D(cx, cy, cz);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
    public void leer(){
        double[] vecA = {0, 0, 0};

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Ingrese un vector 3D: ");
        for (int i = 0; i<3; i++) {
            vecA[i] = sc.nextDouble();
        }
        setX(vecA[0]);setY(vecA[1]);setZ(vecA[2]);
        //sc.close();
    }   
}