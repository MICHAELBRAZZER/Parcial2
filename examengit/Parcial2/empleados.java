
public class Empleados {
    /** Array de empleados */
    private Empleado[] lista;

    /**
     * Constructor de la clase Empleados.
     * @param lista Array de empleados.
     */
    public Empleados(Empleado[] lista) {
        this.lista = lista;
    }

    /**
     * Método para obtener el array de empleados.
     * @return El array de empleados.
     */
    public Empleado[] getLista() {
        return lista;
    }

    /**
     * Método para establecer el array de empleados.
     * @param lista El nuevo array de empleados.
     */
    public void setLista(Empleado[] lista) {
        this.lista = lista;
    }

    /**
     * Método para mostrar la lista de empleados en pantalla.
     */
    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    /**
     * Método para aumentar el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento de salario.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Método estático para dar de alta a los empleados iniciales.
     * @return Un array con los empleados iniciales.
     */
    public static Empleado[] darAltaEmpleados() {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", "Desarrollador", 50000);
        empleados[1] = new Empleado("María", "Diseñadora", 45000);
        empleados[2] = new Empleado("Pedro", "Gerente", 60000);
        return empleados;
    }
}

