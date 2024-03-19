/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Granja;

/**
 *
 * @author Medac
 */
public abstract class Animal {
    //atributos
    protected int patas;
    protected String nombre;
    
    //constructores
    
    public void animal(){
        patas=4;
        nombre="no-name";
    }
    
    //metodos
    
    public abstract void comer();
    public  void dormir(){
        System.out.println("estoy durmiendo");
    }
    public void prueba(){
        System.out.println("hola");
    }
        
    
}
