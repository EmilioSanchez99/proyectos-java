/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casino;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class jugador {
    Scanner sc=new Scanner (System.in);
    //atributos
    
    private String nombre;
    private int edad;
    private int ficha=100;
    private int apuesta=0;
    
    //constructores
    jugador(){
        
    }
    jugador(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;         
    }
    
    public jugador(jugador jugador){
        nombre=jugador.nombre;
    }
    //metodos
     public String getNombre (){
          return nombre;
    }
      public int getEdad (){
          return edad;
    }

    public int getFicha() {
        return ficha;
    }
        
      public void setFicha(int ficha) {
          if(this.ficha<ficha){
          this.ficha=this.ficha-ficha;
                  }
}

    

    public void sumarbote(int i) {
        ficha=i;
      
    }
      
      
      
}

