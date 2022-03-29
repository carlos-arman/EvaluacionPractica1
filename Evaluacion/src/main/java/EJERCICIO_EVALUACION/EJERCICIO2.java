
package EJERCICIO_EVALUACION;

import java.util.Scanner;


public class EJERCICIO2 {
    public static void main(String[] args) {
            Empleado empleado = new Empleado();
        
              Scanner leer = new Scanner();
        
        
        System.out.println("" );
        empleado.nombre = leer.nextLine();
        empleado.mostrarDatos();
        
    }
}
