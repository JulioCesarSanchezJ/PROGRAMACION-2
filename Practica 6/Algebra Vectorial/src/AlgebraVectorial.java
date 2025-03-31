public class AlgebraVectorial {
    private double[] a;
    private double[] b;

    public AlgebraVectorial() {
        this.a = new double[]{0, 0, 0};
        this.b = new double[]{0, 0, 0};
    }

    public AlgebraVectorial(double[] a) {
        this.a = a;
        this.b = new double[]{0, 0, 0};
    }

    // Constructor con dos vectores
    public AlgebraVectorial(double[] a, double[] b) {
        this.a = a;
        this.b = b;
    }

    //llama internamente a las otras sobrecargas
    public void Perpendicular() {
        boolean caso1 = Perpendicular(a, b);   
        boolean caso2 = Perpendicular(true);
        boolean caso3 = Perpendicular('m');   
        boolean caso4 = Perpendicular(1);

        System.out.println("Caso (a) (|a+b| = |a-b|): " + caso2);
        System.out.println("Caso (b) (|a-b| = |b-a|): " + caso3);
        System.out.println("Caso (c) (a·b = 0): " + caso1);
        System.out.println("Caso (d) (|a+b|² = |a|²+|b|²): " + caso4);

        if (caso1 || caso2 || caso3 || caso4) {
            System.out.println("Los vectores son perpendiculares en al menos un caso.");
        } else {
            System.out.println("Los vectores NO son perpendiculares.");
        }
    }

    public boolean Perpendicular(double[] a,double[] b) {
        return productoPunto(this.a, this.b) == 0;
    }

    public boolean Perpendicular(boolean porSumaResta) {
        if (porSumaResta) {
            return norma(sumaVectores(a, b)) == norma(restaVectores(a, b));
        }
        return false;
    }

    public boolean Perpendicular(int modo) {
        if (modo == 1) {
            double normaSumaCuadrada = Math.pow(norma(sumaVectores(a, b)), 2);
            double normaA2 = Math.pow(norma(a), 2);
            double normaB2 = Math.pow(norma(b), 2);
            return normaSumaCuadrada == (normaA2 + normaB2);
        }
        return false;
    }

    public boolean Perpendicular(char m) {
        return norma(restaVectores(a, b)) == norma(restaVectores(b, a));
    }


    public boolean ParaleloC() {
        return productoCruz(a, b) == 0;
    }

    public boolean ParaleloC(double[] v1, double[] v2) {
        if (v2[0] == 0 && v2[1] == 0 && v2[2] == 0) {
            return (v1[0] == 0 && v1[1] == 0 && v1[2] == 0);
        }
        double r = 0;
        boolean encontrado = false;
        for (int i = 0; i < v2.length; i++) {
            if (v2[i] != 0) {
                r = v1[i] / v2[i];
                encontrado = true;
                break;
            }
        }
        if (!encontrado)
            return false;
        for (int i = 0; i < v2.length; i++) {
            if (v1[i] != r * v2[i])
                return false;
        }
        return true;
    }

    public void Paralelo() {
        boolean caso1 = ParaleloC();
        boolean caso2 = ParaleloC(a, b);

        System.out.println("Caso (e) (a = r * b): " + caso2);
        System.out.println("Caso (f) (a x b = 0): " + caso1);

        if (caso1 || caso2) {
            System.out.println("Los vectores son paralelos.");
        } else {
            System.out.println("Los vectores NO son paralelos.");
        }
    }

    public double[] Proyeccion() {
        return Proyeccion(a, b);
    }

    public double[] Proyeccion(double[] v1, double[] v2) {
        double escalar = productoPunto(v1, v2) / Math.pow(norma(v2), 2);
        double[] proy = new double[v2.length];
        for (int i = 0; i < v2.length; i++) {
            proy[i] = escalar * v2[i];
        }
        return proy;
    }

    public double Componente() {
        return Componente(a, b);
    }

    public double Componente(double[] v1, double[] v2) {
        return productoPunto(v1, v2) / norma(v2);
    }

    // aux

    private double productoPunto(double[] v1, double[] v2) {
        double suma = 0;
        for (int i = 0; i < v1.length; i++) {
            suma += v1[i] * v2[i];
        }
        return suma;
    }

    private double norma(double[] v) {
        double suma = 0;
        for (double x : v) {
            suma += x * x;
        }
        return Math.sqrt(suma);
    }

    private double[] sumaVectores(double[] v1, double[] v2) {
        double[] resultado = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            resultado[i] = v1[i] + v2[i];
        }
        return resultado;
    }

    private double[] restaVectores(double[] v1, double[] v2) {
        double[] resultado = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            resultado[i] = v1[i] - v2[i];
        }
        return resultado;
    }

    private double productoCruz(double[] v1, double[] v2) {
        double x = v1[1] * v2[2] - v1[2] * v2[1];
        double y = v1[2] * v2[0] - v1[0] * v2[2];
        double z = v1[0] * v2[1] - v1[1] * v2[0];
        return Math.sqrt(x * x + y * y + z * z);
    }
}
