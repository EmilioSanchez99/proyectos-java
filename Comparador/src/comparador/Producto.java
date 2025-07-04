/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparador;

import java.util.Objects;

/**
 *
 * @author Medac
 */
public class Producto {
    
    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

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

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

     // com,parar dos objetos completos
    
    public boolean equals(Producto  producto) {
        return nombre.equals(producto.getNombre())&&precio==producto.getPrecio();
        
    }

   
    
    
            
    
}
