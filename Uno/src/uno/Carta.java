/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uno;

/**
 *
 * @author Medac
 */
public class Carta implements Comparable<Carta> {
   private String color;
   private int numero;
  

    public Carta(String color, int numero) {///aqui en la practica se puede inicializar un atributo sin tener que pasarlo por parametro
        this.color = color;
        this.numero = numero;
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return  color + " ; "+ numero;
    }

    @Override
    public int compareTo(Carta o) {
        //return numero-o.numero; //si se pone al reves lo ordena al reves
        
       return color.compareTo(o.color);//ordena en orden ASCIIM
        
    }
    
    
    
   
   
}
