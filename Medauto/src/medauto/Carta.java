/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medauto;

/**
 *
 * @author Medac
 */
public class Carta {

    protected String nombre;
    protected int estado;

    //constructor
    public Carta(String nombre, int estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    //metodos
    public int getEstado() {
        return estado;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
