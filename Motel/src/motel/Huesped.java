/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motel;
import java.util.Scanner;


/**
 *
 * @author Medac
 */
public class Huesped {
    Scanner sc=new Scanner (System.in);
    //atributos
     private String nombre;
     private int noches;
     private int precio;
     
    //constructores
     
    public Huesped() {
        System.out.println("introduce nombre");
        this.nombre=sc.next();
        System.out.println("introduce nº de noches");
        this.noches=sc.nextInt();
        precio=noches*50;
        /*System.out.println("el precio es "+ precio);*/
    }
   

    @Override
    public String toString() {
        return "nombre=" + nombre;
    }
    
    
    
     
    //metodos

    public int getNoches() {
        return noches;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    
    
    
    
}
