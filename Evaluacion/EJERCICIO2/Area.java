
package EJERCICIO2;

/**
 *
 * @author Armando
 */
public class Area {
    private int CodigoArea;
    private String NombreArea;
    private int CantidadEmpleados;
    private int NumeroEdificio;

    public Area(int CodigoArea, String NombreArea, int CantidadEmpleados, int NumeroEdificio) {
        this.CodigoArea = CodigoArea;
        this.NombreArea = NombreArea;
        this.CantidadEmpleados = CantidadEmpleados;
        this.NumeroEdificio = NumeroEdificio;
    }

    public Area() {
    }

    public int getCodigoArea() {
        return CodigoArea;
    }

    public void setCodigoArea(int CodigoArea) {
        this.CodigoArea = CodigoArea;
    }

    public String getNombreArea() {
        return NombreArea;
    }

    public void setNombreArea(String NombreArea) {
        this.NombreArea = NombreArea;
    }

    public int getCantidadEmpleados() {
        return CantidadEmpleados;
    }

    public void setCantidadEmpleados(int CantidadEmpleados) {
        this.CantidadEmpleados = CantidadEmpleados;
    }

    public int getNumeroEdificio() {
        return NumeroEdificio;
    }

    public void setNumeroEdificio(int NumeroEdificio) {
        this.NumeroEdificio = NumeroEdificio;
    }
    public void imprimir(){
        System.out.println("-------------------------------------");
        System.out.println("INFORMACION DE AREA");
        System.out.println("El codigo de area es: " + this.getCodigoArea());
        System.out.println("Nombre de area es: " + this.getNombreArea());
        System.out.println("Cantidad de empleados: "+this.getCantidadEmpleados());
        System.out.println("Numero de edificio: "+ this.getNumeroEdificio());
    }
    
}
