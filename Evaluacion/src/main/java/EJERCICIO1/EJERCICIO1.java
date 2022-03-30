package EJERCICIO1;



import EJERCICIO1.Persona;

import java.util.Scanner;

public class EJERCICIO1 {

    public static void main(String[] args) {
       
       
        Persona persona = new Persona();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite su nombre: ");
        persona.setNombre(leer.nextLine());
        System.out.println("Digite las horas trabajadas en el Mes: ");
        persona.setHT(Integer.parseInt(leer.nextLine()));
        System.out.println("Digite el pago por Hora: ");
        persona.setHP(Double.parseDouble(leer.nextLine()));
        
        
        
        
        persona.imprimir();
        
        if(persona.getHT() <= 40){
            System.out.println("El empleado No ha realizado Horas Extras en el mes");
        }else if (persona.getHT() > 40 && persona.getHT() <=48){
            System.out.println("El empleado ha realizado horas extras");
        }else if(persona.getHT() > 48){
            System.out.println("Ha realizado Horas extras al doble y triple");
        }
       
       
    }
    
    
    
}
