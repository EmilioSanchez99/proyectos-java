/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication48;

/**
 *
 * @author Medac
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            //pasar de string a int
        String frase="25";
        int a=Integer.parseInt(frase);
        
        System.out.println(a);
        
        //pasar de int a string
        
        int b=5;
        String pasar=Integer.toString(b);
        //o tambien
        String a4=String.valueOf(b);
        
        System.out.println(a4);
        System.out.println(pasar);
        
        
    }//main
    
    
}
