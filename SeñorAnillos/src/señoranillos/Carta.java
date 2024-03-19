/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package señoranillos;

/**
 *
 * @author Medac
 */
public class Carta {
    
    //atributo 
    
    protected int vida;
    protected int ataque;
//constructor
    public Carta(int vida, int ataque) {
        this.vida = vida;
        this.ataque = ataque;
    }
    
    
//metodos
    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }
    
    
    @Override
    public String toString(){
        return " vida "+ vida+"  ataque "+ ataque;
    }
}
