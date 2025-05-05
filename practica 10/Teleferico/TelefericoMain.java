
public class TelefericoMain {
    public static void main(String[] args) {
        Empleado[] empleados = {
            new Empleado("Carlos", "Diaz", "Lopez", 30, 1500.0),
            new Empleado("Luis", "Martinez", "Gonzalez", 40, 1800.0),
            new Empleado("Ana", "Gomez", "Diaz", 25, 1200.0),
            new Empleado("Pedro", "Diaz", "Mendez", 50, 1900.0)
        };

        LineaTeleferico linea = new LineaTeleferico(empleados);

        System.out.println("=== Empleados Originales ===");
        linea.mostrarTodos();

        System.out.println("\n=== Empleado(s) con Mayor Edad ===");
        linea.mostrarMayorEdad();

        System.out.println("\n=== Empleado(s) con Mayor Sueldo ===");
        linea.mostrarMayorSueldo();

        System.out.println("\n=== Eliminando empleados con apellido 'Diaz' ===");
        linea.eliminarPorApellido("Diaz");
        linea.mostrarTodos();
    }
}
