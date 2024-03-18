import java.util.Scanner;

/**
 * Clase que representa un sistema de gestión de empleados en una empresa.
 */
public class SistemaGestionEmpleados {
    /**
     * Método principal para ejecutar el sistema de gestión de empleados.
     * @param args Los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Dar de alta a los empleados iniciales
        Empleado[] empleados = Empleados.darAltaEmpleados();
        Empleados sistema = new Empleados(empleados);

        // Solicitar porcentaje de aumento de salario al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print(Mensajes.MENSAJE_AUMENTO_SALARIO_ES);
        double porcentaje = scanner.nextDouble();

        // Aumentar salario de los empleados y mostrar lista
        sistema.aumentarSalario(porcentaje

    }
    