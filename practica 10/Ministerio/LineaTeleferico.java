
import java.util.ArrayList;

public class LineaTeleferico {
    private ArrayList<Empleado> empleados;

    public LineaTeleferico(Empleado[] empleadosArray) {
        empleados = new ArrayList<>();
        for (Empleado e : empleadosArray) {
            empleados.add(e);
        }
    }

    public void mostrarMayorEdad() {
        if (empleados.isEmpty()) return;
        int mayorEdad = empleados.stream().mapToInt(Empleado::getEdad).max().orElse(0);
        System.out.println("Empleados con mayor edad (" + mayorEdad + "):");
        for (Empleado e : empleados) {
            if (e.getEdad() == mayorEdad) {
                System.out.println("- " + e);
            }
        }
    }

    public void mostrarMayorSueldo() {
        if (empleados.isEmpty()) return;
        double mayorSueldo = empleados.stream().mapToDouble(Empleado::getSueldo).max().orElse(0);
        System.out.println("Empleados con mayor sueldo (" + mayorSueldo + "):");
        for (Empleado e : empleados) {
            if (e.getSueldo() == mayorSueldo) {
                System.out.println("- " + e);
            }
        }
    }

    public void eliminarPorApellido(String apellido) {
        empleados.removeIf(e -> e.getApellidoPaterno().equalsIgnoreCase(apellido));
    }

    public boolean transferirEmpleado(String apellido, LineaTeleferico destino) {
        for (Empleado e : empleados) {
            if (e.getApellidoPaterno().equalsIgnoreCase(apellido)) {
                destino.agregarEmpleado(e);
                empleados.remove(e);
                return true;
            }
        }
        return false;
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void mostrarTodos() {
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }
}
