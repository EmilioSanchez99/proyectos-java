/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajedrez;

/**
 *
 * @author Medac
 */
public class Torre extends Ficha{
    
    Torre(boolean estado){
        super(estado);
      
        nombre="T";
    }

   
    public void Mover(Ficha[][]tablero) {
        System.out.println("donde?");
       
        do{
        int dondex=sc.nextInt();
        int dondey=sc.nextInt();
        
        if (dondex<tablero.length&&dondey<tablero.length) {
            if (tablero[dondex][dondey].getNombre().equals("_")||!tablero[dondex][dondey].isNegras()) {
                posx=dondex;
                posy=dondey;
                
            }
            
        
           
            
        
            
         }   
        }
        while();
                
    }
    
}
