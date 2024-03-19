/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.poo;

/**
 *
 * @author emili
 */
public class Coche {
    
    //atributos
    
    protected String color;
    protected double ancho;
    protected double alto;
    protected int num_puertas=4;
    protected int num_ruedas;
    boolean arrancado=false;
    
    //constructores

    public Coche() {
    }

    
    public Coche(String color, double ancho, double alto) {
        this.color = color;
        this.ancho = ancho;
        this.alto = alto;
        this.num_ruedas = num_ruedas;
        this.arrancado = arrancado;
    }

   

    //metodos

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }
    
    
    
    
 public void arrancar(){
     if(arrancado=false){
         
         System.out.println("coche arrancado");
         arrancado=true;
     }
     else{
         arrancado=true;
         
         System.out.println("ya estaba arrancado");
     }
     
 }
    
    
    
    
}
