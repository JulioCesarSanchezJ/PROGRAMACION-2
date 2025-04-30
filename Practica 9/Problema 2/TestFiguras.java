import java.util.Random;

public class TestFiguras {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Negro"};
        Random rand = new Random();

        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2); // 0: Cuadrado, 1: Circulo
            String color = colores[rand.nextInt(colores.length)];

            if (tipo == 0) {
                Cuadrado c = new Cuadrado(1 + rand.nextDouble() * 9);
                c.setColor(color);
                figuras[i] = c;
            } else {
                Circulo c = new Circulo(1 + rand.nextDouble() * 4);
                c.setColor(color);
                figuras[i] = c;
            }
        }

        for (Figura f : figuras) {
            System.out.println(f);
            System.out.printf("Área: %.2f\n", f.area());
            System.out.printf("Perímetro: %.2f\n", f.perimetro());

            if (f instanceof Coloreado) {
                System.out.println(((Coloreado) f).comoColorear());
            }

            System.out.println();
        }
    }
}