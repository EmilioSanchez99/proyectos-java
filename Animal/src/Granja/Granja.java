/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Granja;

/**
 *
 * @author Medac
 */
public class  Granja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Perro p1=new Perro();
        p1.comer();
        p1.dormir();
        Gato g1=new Gato();
        g1.comer();
        g1.dormir();
        
        //polimorfismo
        
        Animal[]array={p1,g1};
    }
    
}
