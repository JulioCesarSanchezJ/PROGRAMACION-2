
public class Empleado {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private double sueldo;

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, double sueldo) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno +
               ", edad: " + edad + ", sueldo: " + sueldo;
    }
}
