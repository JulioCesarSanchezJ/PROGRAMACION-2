public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

// 1. Algebra: Ecuaciones Cuadraticas
        //EcuacionCuadratica ecuacion1 = new EcuacionCuadratica(1,2,3);
        //ecuacion1.mostrarResultado();

        EcuacionCuadratica ecuacion = new EcuacionCuadratica();
        ecuacion.leerDatos();
        ecuacion.mostrarResultado();


        //-----------------------------------------

// 2. Estadisticas: calcular el promedio y la desviacion estandar

        //double[] datos = {1,2,3,4,5,6,7,8,9,10};
        //Estadisticas datos1 = new Estadisticas(datos);
        //datos1.mostrarResultado();

        Estadisticas datos = new Estadisticas();datos.leerDatos();

        datos.mostrarResultado();

    }
}
