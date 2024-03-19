/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopoli;

/**
 *
 * @author Medac
 */
public abstract class  Hotel {
    
    //atributos
    
    protected String nombre;
    protected int precio;
    protected boolean comprado;
    
    //constructores
    
    public void Hotel(){
        nombre=null;
        precio=0;
        comprado=false;
    }
            //metodos
    
    //get comprado
    public boolean isComprado() {
        return comprado;
    }
    //set comprado
    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
    
    public abstract void Prueba();
    
    
}
