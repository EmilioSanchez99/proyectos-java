/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battleroyale;

/**
 *
 * @author Medac
 */
public class Jugador {
    //atributos
    private String nombre;
    private int vida;
    
    //constructores
    public Jugador (){
        
    }
    public Jugador(String nombre){
        this.nombre=nombre;
        vida=5;
    }
    
    //metodos
      public String getNombre (){
          return nombre;
    }
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida=vida;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void luchar(Jugador jugador){
        int a=jugador.getVida();
        jugador.setVida(a-1);
        
    }

    public Jugador(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    @Override
    public String toString(){
        return " nombre: "+nombre +" dni: "+vida;
        
    }
}
