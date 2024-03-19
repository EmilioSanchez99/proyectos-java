/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class CuentaCorriente {
    Scanner sc=new Scanner (System.in);
    //atributos
     String nombre;
     String dni;
     double saldo;
     double limitedescubierto;
    
    //constructores 
    CuentaCorriente (){
        System.out.println("has creado una cuenta");
    }
    CuentaCorriente (String nombre,String dni){
        this.nombre=nombre;
        this.dni=dni;
        saldo=0;
        limitedescubierto=-50;
    }
    CuentaCorriente (String nombre, String dni, double saldo, double limitedescubierto){
        this.nombre=nombre;
        this.dni=dni;
        this.saldo=saldo;
        this.limitedescubierto=limitedescubierto;
        
    }
    public CuentaCorriente (double saldo){
        this.saldo=saldo;
        nombre="noname";
        dni="nodni";
        limitedescubierto=0;
    }
    CuentaCorriente(Persona persona, double saldo, double limitedescubierto){
       
    }
   
    
    
    
    //metodos
    void mostrar(){
        System.out.println(nombre);
        System.out.println(dni);
        System.out.println(saldo);
        System.out.println(limitedescubierto);
        
    }
    void ingresar(){
        System.out.println("ingrese cantidad");
        saldo=saldo+ (sc.nextDouble());
        
        
    }
    void retirar(){
        System.out.println("retire cantidad");
        double retirada=sc.nextDouble();
        
        if (saldo-retirada<limitedescubierto) {
            System.out.println("no se puede");
            
        }
        else{
            saldo=saldo-retirada;
        }
        
        
    }
    
}
