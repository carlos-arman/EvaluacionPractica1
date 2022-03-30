
package EJERCICIO2;



public class Empleado {
    public double codigoE;
    public String direccion;
    public String AreaPertenece;
    public String cargo;
    public double SueldoBase;
    public String FechaIngreso;
    public String nombre;
    public int edad;
    
    

  
    //CONSTRUCTOR

    public Empleado(double codigoE, String direccion, String AreaPertenece, String cargo, double SueldoBase, String FechaIngreso, String nombre, int edad,double isss, double afp, double renta,double salariototal, int codigoarea,String nombreArea) {
        this.codigoE = codigoE;
        this.direccion = direccion;
        this.AreaPertenece = AreaPertenece;
        this.cargo = cargo;
        this.SueldoBase = SueldoBase;
        this.FechaIngreso = FechaIngreso;
        this.nombre = nombre;
        this.edad = edad;
       
    }

    Empleado() {
       }
    

    

    public void mostrarDatos() {
        System.out.println("Su nombre es: " + this.nombre);
        System.out.println("Edad: "  + this.edad);
        System.out.println("Codigo Empleado: " + this.codigoE);
        System.out.println("Direccion: "+ this.direccion);
        System.out.println("Area que pertenece: "+ this.AreaPertenece);
        System.out.println("Cargo: "+ this.cargo);
        System.out.println("Sueldo: "+ this.SueldoBase);
        System.out.println("Fecha de ingreso: "+this.FechaIngreso);
        
        
        
    
}
}