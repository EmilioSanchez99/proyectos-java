
/*

* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casino;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Casino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean jugar=true;
        
           
            
        int bote=0;
        int apuesta1;
        int apuesta2;
        
        //declaramos los jugadores
         jugador j1=new jugador("emilio",24);
         jugador j2=new jugador ("victor",24);
         jugador j3=new jugador(j2);
        //introducimos la apuesta y se lo restamos al total de fichas
        do{
         System.out.println("introduce apuesta del jugador 1");
         apuesta1=sc.nextInt();
         j1.setFicha(apuesta1);
          System.out.println("introduce apuesta del jugador 2");
          apuesta2=sc.nextInt();
         j2.setFicha(apuesta2);
         
            if(j1.getFicha()<0||j2.getFicha()<0){
            System.out.println("introduce de nuevo");
        }
        
        }
         while(j1.getFicha()<0&&j2.getFicha()<0);
         bote=apuesta1+apuesta2;//sumar al bote
         System.out.println("el bote es " +bote);
         //mostrar info
         System.out.println(j1.getFicha()+" fichas le quedan  " +j1.getNombre());
         
         System.out.println(j2.getFicha()+" fichas le quedan a  "+ j2.getNombre());
         
         //generar numero aleatorio
         int num=(int) (Math.random()*10);
            System.out.println(num);
            //pedir numero a jugadores
            int elegidoj1=sc.nextInt();
            int elegidoj2=sc.nextInt();
            
            if(elegidoj1==num&&elegidoj2==num){
                System.out.println("han ganado los dos");
                j1.sumarbote(j1.getFicha()+(bote/2));
                j2.sumarbote(j2.getFicha()+(bote/2));
                System.out.println("jugador 1 tiene "+j1.getFicha()+","+"jugador 2 tiene"+j2.getFicha());
            }
            
            else if(elegidoj1==num){
                System.out.println("ha  ganado " + j1.getNombre());
                j1.sumarbote(j1.getFicha()+bote);
                System.out.println(j1.getFicha()+" fichas tiene "+ j1.getNombre());
                
            }
            else if(elegidoj2==num){
                System.out.println("ha  ganado " + j2.getNombre());
                j2.sumarbote(j2.getFicha()+bote);
                System.out.println(j2.getFicha()+" fichas tiene "+ j2.getNombre());
            }
             
        
        
        }
         
    
    
}
