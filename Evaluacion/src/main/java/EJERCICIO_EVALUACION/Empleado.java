
package EJERCICIO_EVALUACION;

import java.util.Scanner;

public class Empleado extends Persona{
    public double codigoE;
    public String direccion;
    public String AreaPertenece;
    public String cargo;
    public double SueldoBase;
    public String FechaIngreso;
    
    
    //CONSTRUCTOR
    public Empleado(String nombre,int edad,double codigoE,String direccion,String AreaPertenece, String cargo,double SueldoBase,String FechaIngreso){
        super(nombre,edad);
        this.codigoE = codigoE;
        this.direccion = direccion;
        this.AreaPertenece = AreaPertenece;
        this.cargo = cargo;
        this.SueldoBase = SueldoBase;
        this.FechaIngreso = FechaIngreso;
    }

    public void leeDatos(){
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingresa Tu nombre: ");
         Empleado.this.nombre = leer.nextLine();
         System.out.println("Ingresa la edad: ");
         this.edad = leer.nextInt(edad);
         System.out.println("Ingrese el codigo Empleado: ");
         this.codigoE = leer.nextDouble();
         System.out.println("Ingrese Su Direccion: ");
         this.direccion = leer.nextLine();
         System.out.println("Ingrese el Area: ");
         this.AreaPertenece = leer.nextLine();
         System.out.println("Ingrese cargo: ");
         this.cargo = leer.nextLine();
         System.out.println("Sueldo Base: ");
         this.SueldoBase = leer.nextDouble();
         System.out.println("Ingrese Fecha Ingreso: ");
         this.FechaIngreso = leer.next();
         
     }
    
    public void mostrarDatos(){
        System.out.println("Su nombre es: " +getNombre());
        System.out.println("Edad" + getEdad());
        System.out.println("Codigo Empleado: " + codigoE);
        System.out.println("Direccion: "+ direccion);
        System.out.println("Area que pertenece: "+AreaPertenece);
        System.out.println("Cargo: "+ cargo);
        System.out.println("Sueldo Base: "+SueldoBase);
        System.out.println("Fecha de ingreso: "+FechaIngreso);
        
    }
    
}
