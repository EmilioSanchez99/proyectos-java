/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int turno=3;
        
        Persona mayordomo=new Persona ("mayordomo","hall");
        Persona amaLLaves=new Persona("amaLLaves", "dormitorio");
        Persona jardinero=new Persona ("jardinero","jardin");
        Persona cocinero=new Persona("cocinero","cocina");
        Persona propietario=new Persona("propietario","salon");
        Persona esposa=new Persona("esposa","baño");
        
        Persona[]array={mayordomo,amaLLaves,jardinero,cocinero,propietario,esposa};
        int pos=(int) (Math.random()*6);
        System.out.println(pos);
        array[pos].setAsesino(true);
        
        System.out.println(mayordomo.dondeEstaba());
        System.out.println(amaLLaves.dondeEstaba());
        System.out.println(jardinero.dondeEstaba());
        System.out.println(cocinero.dondeEstaba());
        System.out.println(propietario.dondeEstaba());
        System.out.println(esposa.dondeEstaba());
        
        //jugar
        boolean ganado = true;
        do{
        System.out.println("elige una opcion: 1.dime el asesino 2. preguntar a alguien");
        int opcion=sc.nextInt();
        switch(opcion){
            case 1: //adivinar el  asesino
                System.out.println("a quien acusas?");
                String decirAsesino=sc.next();
                if (decirAsesino.equals(array[pos].getNombre())) {
                    System.out.println("has ganado");
                    turno=0;
                    ganado=true;
                    
                }
                else{
                    System.out.println("has perdido");
                    turno=0;
                    ganado=false;
                    
                    
                    
                          
                }
                break; 
            case 2:
                System.out.println("a quien quieres preguntar? 1.mayordomo.....");
                int resp=sc.nextInt();
                array[resp].dondeEstaba();
                break;
                
            
        }//corchete switch
        boolean asesinar=true;
        int matar=(int)(Math.random()*6);
        while(!asesinar){
            if(pos==matar){
                asesinar=false;
            }
        }
        
   
     }//corchete do
        
     while(turno>0);
        
        
        
    }
    
   
}
