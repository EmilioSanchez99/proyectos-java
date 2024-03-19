/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;
import casino.jugador;


/**
 *
 * @author Medac
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona2=new Persona();
        Persona persona3=new Persona("julian",18);
        System.out.println(persona3.nombre);
        /*persona1.nombre="Juan";
        persona1.edad=18;
        persona1.dni="8776797h";
        persona1.email="cndivhs@gmail.com";
        persona1.saludar();*/
        persona2.nombre="antonio";
        persona2.edad=20;
        persona2.dni="78767898t";
        persona2.email="ncdjfnsu@gmail.com";
        persona2.comer();
        persona2.incrementar(8);
        System.out.println(persona2.edad);
        jugador j2=new jugador ("victor",24);
    
        /*System.out.println(persona6.mayoredad());
        persona6.mayoredad();*/
        
       
        
       
        
    }
    
}
