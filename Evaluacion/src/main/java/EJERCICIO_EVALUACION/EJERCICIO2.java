
package EJERCICIO_EVALUACION;

import java.util.Scanner;




public class EJERCICIO2 {
    public static void main(String[] args) {
          double isss;
          double afp;
          double renta;
          double total;
          
         Empleado emplead = new Empleado();
         Area area = new Area();
         renta = emplead.SueldoBase * 0.1;
         isss = emplead.SueldoBase * 0.7;
         afp = emplead.SueldoBase * 0.1;
         total = emplead.SueldoBase - renta - isss- afp;
         
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingresa Tu nombre: ");
         emplead.nombre = leer.nextLine();
         System.out.println("Ingresa la edad: ");
         emplead.edad = leer.nextInt();
         leer.nextLine();
         System.out.println("Ingrese Su Direccion: ");
         emplead.direccion = leer.nextLine();
         System.out.println("Ingrese el Area: ");
         emplead.AreaPertenece = leer.nextLine();
         System.out.println("Ingrese cargo: ");
         emplead.cargo = leer.nextLine();
         System.out.println("Ingrese el codigo Empleado: ");
         emplead.codigoE = leer.nextDouble();
         System.out.println("Sueldo Base: ");
         emplead.SueldoBase = leer.nextDouble();
         System.out.println("Ingrese Fecha Ingreso: ");
         emplead.FechaIngreso = leer.next();
         
         System.out.println("Salario con descuento: "+ total);
         
         
         area.setCodigoarea(23);
         area.setCantidadempleado(5);
         
         area.setNumeroedificio(2);
         
        emplead.mostrarDatos();
        
        area.DatosEdificio();
    }
}
