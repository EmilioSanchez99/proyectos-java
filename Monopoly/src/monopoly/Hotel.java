/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopoly;

/**
 *
 * @author FX705G
 */
public abstract class  Hotel {
    
    
    
    protected String nombre;
    protected int precio;
    protected boolean comprado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", precio=" + precio + ", comprado=" + comprado + '}';
    }
    
    
    
    
 
}
