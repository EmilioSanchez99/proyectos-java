/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego.ahorcado;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class JuegoAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        //tamaño de palabra
         System.out.println("introduce el tamaño de la palabra");
            int tamaño,vidas = 0;
            tamaño=sc.nextInt();
            char [] array1=new char[tamaño];
            
           //declarar palabra
            for(int i=0;i<tamaño;i++){
                System.out.println("introduce letra");
                array1[i]=sc.next().charAt(0);
                
            }
       System.out.println(Arrays.toString(array1));
       char a = 0;
       char[] usuario=new char[tamaño];
       
       Arrays.fill(usuario, '_');
        System.out.println(Arrays.toString(usuario));
        
        //adivinar palabra
        System.out.println("adivina la palabra ");
        do{
            for(int i=0;i<tamaño;i++){
                //ir pidiendo letras
                System.out.println("introduce letra ");
                usuario[i]=sc.next().charAt(0);
                
            }
            vidas=vidas-1;
        }
        
        while(vidas>0);
        
            if(vidas>0||(Arrays.equals(array1, usuario))){
            System.out.println("has acertado");
        }
        else{
            System.out.println("has fallado");
        }
       
        
        
    }
    
}
