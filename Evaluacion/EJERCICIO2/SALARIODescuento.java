/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Armando
 */
public class SALARIODescuento extends Empleado{
    
NumberFormat formato = new DecimalFormat("###,###");
    private  double total;
    public SALARIODescuento() {
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
  
   public double descuentorenta(){
       double renta = this.getSueldoBase() * 0.10;
       double TotaL = this.getSueldoBase() - renta;
       return TotaL;
   }
   
   public void imprimirrenta(){
       System.out.println("Descuentos: "+ this.descuentorenta());
   }
    public double Descuentos(){
       
       double afp = this.getSueldoBase()* 0.10;
       double isss = this.getSueldoBase() * 0.07;
       double renta = this.getSueldoBase() * 0.10;
       double Total = this.getSueldoBase() - afp - isss - renta;
       return Total;
       
       
       
   }
   public void Imprimirdescuentos(){
       System.out.println("Descuento renta: "+this.Descuentos());
   }
}
