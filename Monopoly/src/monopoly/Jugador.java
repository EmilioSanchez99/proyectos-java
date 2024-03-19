/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopoly;

/**
 *
 * @author FX705G
 */
public class Jugador {
   private String nombre;
   private int dinero;

    public Jugador(String nombre) {
        this.nombre = nombre;
        dinero = 25000000;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", dinero=" + dinero + '}';
    }

   
    
    
   
   
   
}
