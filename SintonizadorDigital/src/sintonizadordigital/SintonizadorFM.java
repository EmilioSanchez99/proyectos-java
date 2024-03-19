/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintonizadordigital;

/**
 *
 * @author Medac
 */
public class SintonizadorFM {
    //subir o bajar frecuencia en saltos 0.5mhz
    //mostrar frecuencia actual
    //rango 80 108 mhz
    //si subiendo se sobrepasa se va al minimo y al reves
    
    //atributos
    private double frecuencia;
    
    
    //constructores
   
    SintonizadorFM(){
        frecuencia=80;
    }
    SintonizadorFM(double frecuencia){
        this.frecuencia=frecuencia;
        
        
    }
    
    
    //metodos
    void subir (){
        if (frecuencia+0.5<=108) {
             frecuencia=frecuencia+ 0.5;
        }
        else{
            frecuencia=80;
        }
       
    }
    
    void bajar (){
        if (frecuencia-0.5>=80) {
             frecuencia=frecuencia- 0.5;
        }
        else{
            frecuencia=108;
        }
       
    }
    
    void mostrar(){
        System.out.println(frecuencia);
    }    
    
    
    
}
