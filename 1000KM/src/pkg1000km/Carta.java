/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1000km;

/**
 *
 * @author Medac
 */
public class Carta {
    
    String nombre;
    int distancia;
    boolean ataque;

    public Carta(String nombre, int distancia, boolean ataque) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return nombre ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public boolean isAtaque() {
        return ataque;
    }

    public void setAtaque(boolean ataque) {
        this.ataque = ataque;
    }
    
    
    
}
