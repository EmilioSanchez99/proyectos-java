/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package golden.axe;


/**
 *
 * @author Medac
 */
public  class Jugador {
    
    //atributos
    
    protected int vida;
    protected int fuerza;
    protected boolean muerto;
    protected String nombre;
    protected Carta[] carta;
    
    //constructor
    
    public Jugador(){
        carta=new Carta[5];
        
        carta[0]=new Carta("tienes un punto de vida",1,0);
        carta[1]=new Carta("Te quitan un punto de vida",-1,0);
        carta[2]=new Carta("Obtienes un punto de fuerza",0,1);
        carta[3]=new Carta("Te quitan un punto de fuerza",0,-1);
        carta[4]=new Carta("Obtienes dos puntos de vida",2,0);
       
        
    }
    
    
}
