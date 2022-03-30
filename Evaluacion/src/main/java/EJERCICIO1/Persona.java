
package EJERCICIO1;

import java.text.DecimalFormat;
import java.text.NumberFormat;



public class Persona extends horas_trabajadas {
    private String nombre;
    private double Salario;
    private double renta ;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    @Override
    public double getRenta() {
        return renta;
    }

    @Override
    public void setRenta(double renta) {
        this.renta = renta;
    }
    public double renta(){
        double Retencion;
        Retencion =this.SalarioTotal * 0.10;
                return Retencion;
    }
   
    public double TotalSalario(){
        double Renta;
        Renta = this.renta() + this.horasExtras();
        return Renta;
    }
    public double salarioliquido(){
        double resulado;
        resulado = this.TotalSalario() + this.renta();
        return resulado;
    }
        public double SalarioBruto(){
        double SalarioBruto;
        SalarioBruto = this.salarioliquido() - this.renta();
        return SalarioBruto;
    }
 
    
    public void  imprimir(){
        
        NumberFormat formato = new DecimalFormat("###,###");
       System.out.println("Nombre Del empleado es: " + (this.getNombre()));
       System.out.println("Salario Bruto(SIN RENTA): $" + formato.format(this.SalarioBruto()));
       System.out.println("Salario Liquido(CON RENTA): $" + formato.format(this.salarioliquido()));
        
       System.out.println("Monto de Retencion: $" + formato.format(this.renta()));
        
         
         
    }

    
    
}
    

