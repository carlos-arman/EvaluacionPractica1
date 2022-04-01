/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2;

/**
 *
 * @author Armando
 */
public class TipoDeCarrera extends Empleado{
    TipoDeCarrera() {
    }

    public TipoDeCarrera(String nombre, int Cempleado, int edad, String direccion, String AreaqPertenece, String Cargo, double SueldoBase, String FechaIngreso) {
        super(nombre, Cempleado, edad, direccion, AreaqPertenece, Cargo, SueldoBase, FechaIngreso);
    }

    

    
    public void imprimirAdministrativo(){
        System.out.println("El nombre del docente es: "+ this.getNombre());
        System.out.println("Codigo empleado: " + this.getCempleado());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Su direccion: " + this.getDireccion());
        System.out.println("Area que pertenece: "+ this.getAreaqPertenece());
        System.out.println("Cargo que desempeña: " + this.getCargo());
        System.out.println("Sueldo Base: "+ this.getSueldoBase());
        System.out.println("Fecha de ingreso: "+ this.getFechaIngreso());
    }
    public void imprimirDocente(){
        System.out.println("El nombre del docente es: "+ this.getNombre());
        System.out.println("Codigo empleado: " + this.getCempleado());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Su direccion: " + this.getDireccion());
        System.out.println("Area que pertenece: "+ this.getAreaqPertenece());
        System.out.println("Cargo que desempeña: " + this.getCargo());
        System.out.println("Sueldo Base: "+ this.getSueldoBase());
        System.out.println("Fecha de ingreso: "+ this.getFechaIngreso());
    }
}
