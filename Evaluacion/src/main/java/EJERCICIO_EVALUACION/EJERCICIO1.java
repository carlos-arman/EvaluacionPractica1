package EJERCICIO_EVALUACION;

import java.util.Scanner;

public class EJERCICIO1 {

    public static void main(String[] args) {
       
        double HT;
        double PH;
        double sueldoTotal = 0;
        double Renta = 0;
        String Nombre;
        double HorasExtras ;
        double SalarioLiquido = 0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        Nombre = leer.nextLine();
        System.out.println("Digite las horas trabajadas en el Mes: ");
        HT = leer.nextDouble();
        System.out.println("Digite el pago por Hora: ");
        PH = leer.nextDouble();
        
        if(HT <= 40){
            System.out.println("El empleado No ha realizado Horas Extras en el mes: ");
            sueldoTotal = HT * PH;
            Renta = sueldoTotal * 0.10;
            SalarioLiquido = sueldoTotal + Renta;
            
        }//Se le pagan el doble del pago de una hora norma, haciendo el total
        //de 8 horas pagadas como maximo al doble
        else if(HT>40 && HT <= 48){
            System.out.println("El empleado ha realizado horas extras: ");
            HorasExtras =HT - 40;
            
            sueldoTotal = 40 * PH + (HorasExtras)* 2 * PH;
            Renta =sueldoTotal * 0.10;
            SalarioLiquido = sueldoTotal + Renta;
            
        }//Se le pagan al doble y triple del pago de una hora normal, y las 
        //que excedan de 8se pagan al triple
        else if(HT > 48){
            System.out.println("Ha realizado Horas extras al doble y triple: ");
            HorasExtras = HT -48 ;
            sueldoTotal = 40 * PH +(HorasExtras) * 3 * PH + (8) * 2 * PH;
            Renta = sueldoTotal * 0.10;
            SalarioLiquido = sueldoTotal + Renta;
        }
        System.out.println("------------------INFO---------------------");
         System.out.println("Nombre del empleado: " + Nombre);
         System.out.println("Salario Bruto(SIN RENTA): $" + sueldoTotal);
         System.out.println("Salario Liquido(CON RENTA): $"+ SalarioLiquido);
         System.out.println("Monto de Retencion: $" + Renta);
         
    }
    
    
}
