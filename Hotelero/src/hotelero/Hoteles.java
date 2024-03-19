/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelero;

/**
 *
 * @author ivang
 */
public abstract class Hoteles {
    //Atributos
    String nombre;
    int precio;
    boolean comprado;
    //Constructores
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //Metodos
    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean isComprado() {
        return comprado;
    }
    
   @Override
public String toString(){
    return nombre;
}
}
