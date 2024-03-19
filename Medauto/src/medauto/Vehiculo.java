/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medauto;

/**
 *
 * @author Medac
 */
public abstract class Vehiculo {
    //atributos
    
    protected String nombre;
    protected int posx;
    protected int posy;
    
    //constructor
    
    

    //metodos
    public abstract void avanzar();
    
    
    public abstract void retroceder();
    
    

    public String getNombre() {
        return nombre;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "nombre=" + nombre + '}';
    }
    
    
    
}
