
public class MinisterioMain {
    public static void main(String[] args) {
        Empleado[] empleados1 = {
            new Empleado("Carlos", "Diaz", "Lopez", 30, 1500.0),
            new Empleado("Luis", "Martinez", "Gonzalez", 40, 1800.0),
            new Empleado("Ana", "Gomez", "Diaz", 25, 1200.0)
        };

        Empleado[] empleados2 = {
            new Empleado("Marta", "Perez", "Soto", 35, 1600.0),
            new Empleado("Juan", "Torres", "Garcia", 28, 1300.0)
        };

        Ministerio ministerio = new Ministerio(empleados1, empleados2);

        System.out.println("=== Estado Inicial ===");
        ministerio.mostrarDatos();

        System.out.println("\n=== Eliminar 'Diaz' de Linea 1 ===");
        ministerio.eliminarDeLinea(1, "Diaz");
        ministerio.mostrarTodo();

        System.out.println("\n=== Transferir 'Gomez' de Linea 1 a Linea 2 ===");
        ministerio.transferirEmpleado(1, "Gomez");
        ministerio.mostrarTodo();
    }
}
