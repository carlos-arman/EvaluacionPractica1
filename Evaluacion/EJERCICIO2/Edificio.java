/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2;

/**
 *
 * @author Armando
 */
public class Edificio {
    private String ubicacion;
    private String NombreE;
    private int CantidadApartamentos;
    private int CantidadPiso;

    public Edificio() {
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombreE() {
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public int getCantidadApartamentos() {
        return CantidadApartamentos;
    }

    public void setCantidadApartamentos(int CantidadApartamentos) {
        this.CantidadApartamentos = CantidadApartamentos;
    }

    public int getCantidadPiso() {
        return CantidadPiso;
    }

    public void setCantidadPiso(int CantidadPiso) {
        this.CantidadPiso = CantidadPiso;
    }
    public void imprimir(){
         System.out.println("-------------------------------------");
        System.out.println("INFORMACION DE EDIFICIO");
        System.out.println("La ubicacion es: "+this.getUbicacion());
        System.out.println("Nombre: "+this.getNombreE());
        System.out.println("Cantidad de departamentos: "+ this.getCantidadApartamentos());
        System.out.println("Cantidad de pisos: "+this.getCantidadPiso());
    }
    
}
