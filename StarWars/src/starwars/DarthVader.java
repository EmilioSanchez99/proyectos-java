/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starwars;

/**
 *
 * @author Medac
 */
public class DarthVader {
    
    //atributos
    
   protected boolean lado_oscuro;
    protected int habilidad_pilotar;
    protected int espada_laser;
    protected int poder_fuerza;
    protected int habilidad_convencer;
    
    //constructor
    
    public DarthVader(){
        
        lado_oscuro=true;
        habilidad_pilotar=5;
        espada_laser=4;
        poder_fuerza=5;
        habilidad_convencer=4;
        
    }
    public void hablar(){
        System.out.println("yo soy tu padre");
    }
}
