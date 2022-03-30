
package EJERCICIO_EVALUACION;


public class Area {
    public int codigoarea;
    public String nombrearea;
    public int cantidadempleado;
    public int numeroedificio;

    public Area(int codigoarea, String nombrearea, int cantidadempleado, int numeroedificio) {
        this.codigoarea = codigoarea;
        this.nombrearea = nombrearea;
        this.cantidadempleado = cantidadempleado;
        this.numeroedificio = numeroedificio;
    }

    Area() {
        }

    public double getCodigoarea() {
        return codigoarea;
    }

    public void setCodigoarea(int codigoarea) {
        this.codigoarea = codigoarea;
    }

    public String getNombrearea() {
        return nombrearea;
    }

    public void setNombrearea(String nombrearea) {
        this.nombrearea = nombrearea;
    }

    public double getCantidadempleado() {
        return cantidadempleado;
    }

    public void setCantidadempleado(int cantidadempleado) {
        this.cantidadempleado = cantidadempleado;
    }

    public int getNumeroedificio() {
        return numeroedificio;
    }

    public void setNumeroedificio(int numeroedificio) {
        this.numeroedificio = numeroedificio;
    }
 
    public void DatosEdificio(){
        System.out.println("DATOS DEL EDIFICIO");
        System.out.println("Codigo de area: 123" + this.codigoarea);
        System.out.println("Nombre Area: " + this.nombrearea);
        System.out.println("Cantidad empleado: " + this.cantidadempleado);
        System.out.println("Numero de edificion: " + this.numeroedificio);
    }

}
