/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package golden.axe;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class GoldenAxe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
          Guerrero guerrero1=new Guerrero();
       
        
        
        System.out.println("cuantos jugadores van a jugar");
        int players=sc.nextInt();
        
        Jugador[] jugadores=new Jugador[players];
        
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("elige un jugador 1.enano 2.guerrero 3. amazonas");
            int elegido=sc.nextInt();
            switch(elegido){
                case 1:
                   
                    
                   jugadores[i]=new Enano();
                    break;
                case 2:
                   //Guerrero guerrero1=new Guerrero();
                    jugadores[i]=guerrero1;
                    break;
                    
                case 3:
                    Amazona amazona1=new Amazona();
                    jugadores[i]=amazona1;
                    break;
                default:
                    System.out.println("vuelve a elegir 1.enano 2.guerrero 3. amazonas ");
                    elegido=sc.nextInt();
                    break;
            }
            
        }
        
    }
    
}
