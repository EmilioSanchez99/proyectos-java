/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Medac
 */
public class Persona {
    
    //atributos
    private String nombre;
    private String lugar;
    private boolean asesino;
    
    //constructores

    public Persona(String nombre, String lugar) {
        this.nombre = nombre;
        this.lugar = lugar;
        asesino=false;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    
     //metodos
    
    
    public String getLugar() {
        return lugar;
    }

    public String getNombre() {
        return nombre;
    }

        
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String dondeEstaba(){
        if(asesino){
            String [] lugares={"hall","dormitorio","jardin","cocina","baño"};
            int posicionLugar= (int) (Math.random()*6);
            lugar=lugares[posicionLugar];
        }
        return lugar;
    }

    public void setAsesino(boolean asesino) {
        this.asesino = asesino;
    }

    public boolean isAsesino() {
        return asesino;
    }
    
    
    
    
    
    
    
}
