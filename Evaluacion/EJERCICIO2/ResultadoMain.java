
package EJERCICIO2;

import java.util.Scanner;



/**
 *
 * @author Armando
 */
public class ResultadoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Empleado empleados = new Empleado();
        
        Edificio edi = new Edificio();
        
        Area area= new Area();
        
        SALARIODescuento des = new SALARIODescuento();
        
        int opcion = 0;
        int Opcion2;
        try{
            //DOCENTE
            System.out.println("Digite 1 si es Docente o 2 si es Administrador");
            opcion = sc.nextInt();
            if(opcion == 1){
                //DOCENTE PERMANENTE
                System.out.println("Ingrese 3 si es permanente o 4 si es servicio: ");
                Opcion2 = sc.nextInt();
                if(Opcion2 == 3){
                    System.out.println("DOCENTE PERMANENTE");
                    System.out.println("Ingrese su nombre: ");
                    sc.nextLine();
                    empleados.setNombre(sc.nextLine());
                    System.out.println("Ingrese codigo de empleado: ");
                    empleados.setCempleado(Integer.parseInt(sc.nextLine()));
                    System.out.println("Ingrese su edad: ");
                    empleados.setEdad(Integer.parseInt(sc.nextLine()));
                    System.out.println("Direcion: ");
                    empleados.setDireccion(sc.nextLine());
                    System.out.println("Area que pertenece: ");
                    empleados.setAreaqPertenece(sc.nextLine());
                    System.out.println("Cargo: ");
                    empleados.setCargo(sc.nextLine());
                    System.out.println("Ingrese su sueldo Base: ");
                    empleados.setSueldoBase(sc.nextDouble());
                    System.out.println("Fecha de ingreso: ");
                    sc.nextLine();
                    empleados.setFechaIngreso(sc.nextLine());
                    
                    
                    //AREA
                    System.out.println("INGRESE INFORMACION DE AREA");
                    System.out.println("Ingrese codigo area: ");
                    area.setCodigoArea(sc.nextInt());
                    System.out.println("Nombre de Area: ");
                    area.setNombreArea(sc.nextLine());
                    sc.nextLine();
                    System.out.println("Cantidad de empleados: ");
                    area.setCantidadEmpleados(sc.nextInt());
                    System.out.println("Numero de edificio: ");
                    area.setNumeroEdificio(sc.nextInt());
                    
                    //EDIFICIO
                    System.out.println("INGRESE INFORMACION DE EDIFICIO");
                    System.out.println("Ubicacion de l edificio");
                    sc.nextLine();
                    edi.setUbicacion(sc.nextLine());
                    System.out.println("Ingrese Nombre del edificio: ");
                    edi.setNombreE(sc.nextLine());
                    System.out.println("Ingrese Cantidad de departamentos: ");
                    edi.setCantidadApartamentos(sc.nextInt());
                    System.out.println("Ingrese cantidad de pisos: ");
                    edi.setCantidadPiso(sc.nextInt());
                    
                    
                    double renta;
                    double isss;
                    double afp;
                    double total;
                    
                    
                    renta = empleados.getSueldoBase() * 0.10;
                    isss = empleados.getSueldoBase() * 0.07;
                    afp = empleados.getSueldoBase() * 0.10;
                    total = empleados.getSueldoBase() - renta - afp - isss;
                    empleados.imprimir();
                    area.imprimir();
                    edi.imprimir();
                    System.out.println("Total Renta: " + renta);
                    System.out.println("Total isss: "+ isss);
                    System.out.println("Total afp: "  + afp);
                    System.out.println("Salario con descuento: " + total);
                }else if(Opcion2 == 4){
                    System.out.println("DOCENTE POR SERVICIO");
                    System.out.println("Ingrese su nombre: ");
                    sc.nextLine();
                    empleados.setNombre(sc.nextLine());
                    System.out.println("Ingrese codigo de empleado: ");
                    empleados.setCempleado(Integer.parseInt(sc.nextLine()));
                    System.out.println("Ingrese su edad: ");
                    empleados.setEdad(Integer.parseInt(sc.nextLine()));
                    System.out.println("Direcion: ");
                    empleados.setDireccion(sc.nextLine());
                    System.out.println("Area que pertenece: ");
                    empleados.setAreaqPertenece(sc.nextLine());
                    System.out.println("Cargo: ");
                    empleados.setCargo(sc.nextLine());
                    System.out.println("Ingrese su sueldo Base: ");
                    empleados.setSueldoBase(sc.nextDouble());
                    System.out.println("Fecha de ingreso: ");
                    sc.nextLine();
                    empleados.setFechaIngreso(sc.nextLine());
                    
                    
                    //AREA
                    System.out.println("INGRESE INFORMACION DE AREA");
                    System.out.println("Ingrese codigo area: ");
                    area.setCodigoArea(sc.nextInt());
                    System.out.println("Nombre de Area: ");
                    area.setNombreArea(sc.nextLine());
                    sc.nextLine();
                    System.out.println("Cantidad de empleados: ");
                    area.setCantidadEmpleados(sc.nextInt());
                    System.out.println("Numero de edificio: ");
                    area.setNumeroEdificio(sc.nextInt());
                    
                    //EDIFICIO
                    System.out.println("Ubicacion de l edificio");
                    sc.nextLine();
                    edi.setUbicacion(sc.nextLine());
                    System.out.println("Ingrese Nombre del edificio: ");
                    edi.setNombreE(sc.nextLine());
                    System.out.println("Ingrese Cantidad de departamentos: ");
                    edi.setCantidadApartamentos(sc.nextInt());
                    System.out.println("Ingrese cantidad de pisos: ");
                    edi.setCantidadPiso(sc.nextInt());
                    
                    double renta;
                    
                    double total;
                    
                    
                    renta = empleados.getSueldoBase() * 0.10;
                    
                    total = empleados.getSueldoBase() - renta ;
                    empleados.imprimir();
                    area.imprimir();
                    edi.imprimir();
                    System.out.println("Total Renta: $" + renta);
                    
                    System.out.println("Salario con descuento: $" + total);
                    
                }
                        }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }  
        if(opcion ==2){
            System.out.println("ADMINISTRADOR");
                    System.out.println("Ingrese su nombre: ");
                    sc.nextLine();
                    empleados.setNombre(sc.nextLine());
                    System.out.println("Ingrese codigo de empleado: ");
                    empleados.setCempleado(Integer.parseInt(sc.nextLine()));
                    System.out.println("Ingrese su edad: ");
                    empleados.setEdad(Integer.parseInt(sc.nextLine()));
                    System.out.println("Direcion: ");
                    empleados.setDireccion(sc.nextLine());
                    System.out.println("Area que pertenece: ");
                    empleados.setAreaqPertenece(sc.nextLine());
                    System.out.println("Cargo: ");
                    empleados.setCargo(sc.nextLine());
                    System.out.println("Ingrese su sueldo Base: ");
                    empleados.setSueldoBase(sc.nextDouble());
                    System.out.println("Fecha de ingreso: ");
                    sc.nextLine();
                    empleados.setFechaIngreso(sc.nextLine());
                    
                    
                    //AREA
                    System.out.println("INGRESE INFORMACION DE AREA");
                    System.out.println("Ingrese codigo area: ");
                    area.setCodigoArea(sc.nextInt());
                    System.out.println("Nombre de Area: ");
                    area.setNombreArea(sc.nextLine());
                    sc.nextLine();
                    System.out.println("Cantidad de empleados: ");
                    area.setCantidadEmpleados(sc.nextInt());
                    System.out.println("Numero de edificio: ");
                    area.setNumeroEdificio(sc.nextInt());
                    
                    //EDIFICIO
                    System.out.println("INGRESE INFORMACION DE EDIFICIO");
                    System.out.println("Ubicacion de l edificio");
                    sc.nextLine();
                    edi.setUbicacion(sc.nextLine());
                    System.out.println("Ingrese Nombre del edificio: ");
                    edi.setNombreE(sc.nextLine());
                    System.out.println("Ingrese Cantidad de departamentos: ");
                    edi.setCantidadApartamentos(sc.nextInt());
                    System.out.println("Ingrese cantidad de pisos: ");
                    edi.setCantidadPiso(sc.nextInt());
                    
                    
                    
                    double renta;
                    double isss;
                    double afp;
                    double total;
                    
                    
                    renta = empleados.getSueldoBase() * 0.10;
                    isss = empleados.getSueldoBase() * 0.07;
                    afp = empleados.getSueldoBase() * 0.10;
                    total = empleados.getSueldoBase() - renta - afp - isss;
                    empleados.imprimir();
                    area.imprimir();
                    edi.imprimir();
                    System.out.println("Total Renta: " + renta);
                    System.out.println("Total isss: "+ isss);
                    System.out.println("Total afp: "  + afp);
                    System.out.println("Salario con descuento: " + total);
                   
                    
                   
        }
        
    }

    

   
    
}
