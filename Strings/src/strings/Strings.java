/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        /*String texto1="hola ";
        String texto2="que tal";
        String texto3=texto1+texto2;
        String texto4="holas";
        System.out.println(texto3);
        System.out.println(texto1.equalsIgnoreCase(texto4));
        System.out.println(texto3.length());
        System.out.println(texto1.indexOf('h'));
        System.out.println(texto2.charAt(2));
        System.out.println(texto1.substring(0, 2));
        System.out.println(texto1.toUpperCase());*/
        
        


        // introducir dos palabras y decir cual es mas grande

        /*String palabra1;
        String palabra2;
        System.out.println("introduce palabra 1");
        palabra1=sc.nextLine();
        System.out.println("introduce palabra 2");
        palabra2=sc.nextLine();
        if(palabra1.length()>palabra2.length()){
            System.out.println(palabra1 +"es mas larga que "+palabra2);
        }
        else{
            System.out.println(palabra2 +" es mas larga que "+palabra1);
        }*/
        
        
        //acertar la contraseña
        
        System.out.println("introduce la palabra secreta");
        String secreta=sc.nextLine();
        
        System.out.println("la letra inicial es "+ secreta.charAt(0)+ " y la ultima letra es "+secreta.charAt(secreta.length()-1));
        System.out.println("la longitud es "+ secreta.length());
        String palabra=sc.nextLine();
        while(!palabra.equals(secreta)){
            
            palabra=sc.nextLine();
        }
        
        
        
        
    }
    
}
