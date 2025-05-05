
public class Ministerio {
    private LineaTeleferico linea1;
    private LineaTeleferico linea2;

    public Ministerio(Empleado[] l1, Empleado[] l2) {
        linea1 = new LineaTeleferico(l1);
        linea2 = new LineaTeleferico(l2);
    }

    public void mostrarDatos() {
        System.out.println("Linea 1:");
        linea1.mostrarMayorEdad();
        linea1.mostrarMayorSueldo();
        System.out.println("Linea 2:");
        linea2.mostrarMayorEdad();
        linea2.mostrarMayorSueldo();
    }

    public void eliminarDeLinea(int numLinea, String apellido) {
        if (numLinea == 1) {
            linea1.eliminarPorApellido(apellido);
        } else if (numLinea == 2) {
            linea2.eliminarPorApellido(apellido);
        }
    }

    public void transferirEmpleado(int deLinea, String apellido) {
        if (deLinea == 1) {
            linea1.transferirEmpleado(apellido, linea2);
        } else if (deLinea == 2) {
            linea2.transferirEmpleado(apellido, linea1);
        }
    }

    public void mostrarTodo() {
        System.out.println("=== Linea 1 ===");
        linea1.mostrarTodos();
        System.out.println("=== Linea 2 ===");
        linea2.mostrarTodos();
    }
}
