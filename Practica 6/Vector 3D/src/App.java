public class App {
    public static void main(String[] args) {
        Vector3D a = new Vector3D();
        Vector3D b = new Vector3D();
        //Vector3D a = new Vector3D(3, -3, 1);
        //Vector3D b = new Vector3D(4, 4, -2);
        a.leer();
        b.leer();

        Vector3D sumaAB = Vector3D.suma(a, b);
        System.out.println("    a) Suma de dos vectores a y b = " + sumaAB);

        double escalar = 2.5;
        Vector3D aEscalar = Vector3D.multiplicarPorEscalar(a, escalar);
        System.out.println("    b) Multiplicación de un escalar "+escalar+" por un vector a = " + aEscalar);

        double longitudA = a.longitud();
        System.out.printf("    c) Longitud de un vector a = %.2f%n", longitudA);

        Vector3D normalA = a.normal();
        System.out.println("    d) Normal de un vector a = " + normalA);

        double prodEsc = Vector3D.productoEscalar(a, b);
        System.out.printf("    e) Producto escalar de a y b: a · b = %.2f%n", prodEsc);

        Vector3D prodVec = Vector3D.productoVectorial(a, b);
        System.out.println("    f) Producto vectorial de a y b: a × b = " + prodVec);
    }
}
