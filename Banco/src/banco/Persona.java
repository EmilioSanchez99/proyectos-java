/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Medac
 */
public class Persona {
    //atributos
    String nombre;
    int edad;
    String dni;
    
    //construcciones
    Persona(){
        System.out.println("has creado una persona");
    }
    Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    
    
}
