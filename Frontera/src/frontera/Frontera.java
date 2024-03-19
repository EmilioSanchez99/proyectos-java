/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frontera;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Frontera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Persona[] arrayPersonas=new Persona[100];
        int i=0;
        int opcion;
      
        do{
            
        System.out.println("1. crear usuario 2. mostrar todas personas 3 buscar nombre 4 buscar dni 5 salir");
        opcion=sc.nextInt();
        switch (opcion){
            case 1: 
                System.out.println("introduce nombre");
                String nombre=sc.next();
                System.out.println("introduce dni");
                String dni=sc.next();
                Persona persona=new Persona(nombre,dni);
                arrayPersonas[i]=persona;
                i++;
                break;
                
            case 2:
                for(int a=0;a<i;a++){
                    System.out.println(arrayPersonas[a]);
                }
                break;
                
             case 3: //buscar por persona
                System.out.println("introduce el nombre a buscar");
                 nombre=sc.next();
                 for(int a=0;a<i;a++){
                     if(nombre.equals(arrayPersonas[a].getNombre())){
                         System.out.println("la persona con nombre "+ nombre+" es "+arrayPersonas[a]);
                     }
                     else{
                         System.out.println("no se encuentra");
                     }
                 }    
                 break;
            case 4: //buscar por DNI
                System.out.println("introduce el dni a buscar");
                 dni=sc.next();
                 for(int a=0;a<i;a++){
                     if(dni.equals(arrayPersonas[a].getDni())){
                         System.out.println("la persona con dni "+ dni+" es "+arrayPersonas[a]);
                     }
                     else{
                         System.out.println("no se encuentra");
                     }
                 }
                break;
                
                
            
            default:
                System.out.println("has introducido mal el numero");
                break;
                
        }
    }
        
   while(opcion!=5);     
        
        
        } //fin
    
}
