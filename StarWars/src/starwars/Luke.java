/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starwars;

/**
 *
 * @author Medac
 */
public class Luke extends DarthVader {
    public Luke(){
        super();
        lado_oscuro=false;
        espada_laser=5;
    }
    
    
    @Override
    public  void hablar(){
        System.out.println("soy tu hijo");
    }
    
    
    
}
