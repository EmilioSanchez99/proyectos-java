/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparador;

/**
 *
 * @author Medac
 */
public class Supermercado {
    
    private String nombre;
    public Producto[]productos=new Producto[5];

    public Supermercado(String nombre) {
        this.nombre = nombre;
    }
    
 
    

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public Producto[] getProductos() {
        return productos;
    }

    @Override
    public String toString() {
        return "Supermercado{" + "nombre=" + nombre + ", productos=" + productos + '}';
    }
    
    
    
}
