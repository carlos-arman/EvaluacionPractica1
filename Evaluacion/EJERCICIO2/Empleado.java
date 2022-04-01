
package EJERCICIO2;

/**
 *
 * @author Armando
 */
public class Empleado {
    
    
    
    private String nombre;
    private int Cempleado;
    private int edad;
    private String direccion;
    private String AreaqPertenece;
    private String Cargo;
    private double SueldoBase;
    private String FechaIngreso;

    Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public Empleado(String nombre, int Cempleado, int edad, String direccion, String AreaqPertenece, String Cargo, double SueldoBase, String FechaIngreso) {
        this.nombre = nombre;
        this.Cempleado = Cempleado;
        this.edad = edad;
        this.direccion = direccion;
        this.AreaqPertenece = AreaqPertenece;
        this.Cargo = Cargo;
        this.SueldoBase = SueldoBase;
        this.FechaIngreso = FechaIngreso;
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCempleado() {
        return Cempleado;
    }

    public void setCempleado(int Cempleado) {
        this.Cempleado = Cempleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAreaqPertenece() {
        return AreaqPertenece;
    }

    public void setAreaqPertenece(String AreaqPertenece) {
        this.AreaqPertenece = AreaqPertenece;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public double getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(double SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }
    public void imprimir(){
        System.out.println("----------------------------------");
        System.out.println("Detalles del empleado");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Codigo empleado: " + this.getCempleado());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Area que pertenece: "+ this.getAreaqPertenece());
        System.out.println("Cargo: "+ this.getCargo());
        System.out.println("Sueldo Base: "+ this.getSueldoBase());
        System.out.println("Fecha de ingreso: "+ this.getFechaIngreso());
    }
            
    
    
}
