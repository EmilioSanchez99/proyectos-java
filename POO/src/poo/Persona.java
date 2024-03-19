/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Medac
 */
public class Persona {
    //atributos
    String nombre;
    int saldo;
    int limitedescubierto;
    String dni;
    int edad;
    String email;
    
    //construcciones
    Persona(){
        System.out.println("has creado una persona");
    }
    Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    
    //metodos 
    void saludar (){
        System.out.println(nombre+" te saluda");
    }
    void comer (){
        System.out.println("estoy comiendo");
    }
    void incrementar (int e){
        edad=e+edad;
        
    }
    
   Persona (String nombre){
        this.nombre=nombre;
        edad=19;
    }
    //metodo
    boolean mayoredad(){
        boolean resp;
        if (edad<18) {
            resp=false;
            System.out.println(" no es mayor de edad");
        }
        else{
            resp=true;
            System.out.println(" es mayor de edad");
        }
        
        return resp;
    }
    
    //copnstructor
     Persona (String nombre, int edad, String dni){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;   
    }
     
     void datos(){
         System.out.print(edad);
         System.out.print(nombre);
         System.out.print(dni);
     }
    
    
   
    
    
    //crear cuenta con nombre y dni,ssaldo inicial es 0 y limitedescubierto -50
    //ingresar diner
    //mostrar informacion
    //sacar dinero
    
}//fin
