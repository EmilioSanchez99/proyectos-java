/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discoteca;

/**
 *
 * @author Medac
 */
public class Discoteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("dicoteca MEDAD");
        Persona p1=null;
        try{
            
        
         p1=new Persona();
        Persona p2=new Persona();
        
        Persona [] array={p1,p2};
        
        
        }
        catch(EdadException e){
            System.out.println(e.toString());
        }
        catch(SaldoException e){
            System.out.println(e.toString());
        }
        catch(NullPointerException e){
            System.out.println("error por no crear persona");
        }
        
        try{
           p1.sacarDinero(50.0); 
        }
        catch(SaldoException e1){
            System.out.println(e1.toString());
        }
        catch (NullPointerException e){
            System.out.println("error por no crear persona");
        }
        
        
        
        finally{
            System.out.println("salir de la disco");
        }
            
        
        }//main
    
    
    
    
}
