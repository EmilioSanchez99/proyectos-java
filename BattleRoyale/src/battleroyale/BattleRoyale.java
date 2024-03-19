/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package battleroyale;

/**
 *
 * @author Medac
 */
public class BattleRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos jugadores
        Jugador jugador1=new Jugador("alfonso");
        Jugador jugador2=new Jugador("monico");
        
        do{
            int a=(int)(Math.random()*2);
            if (a==0){ //jugador 1 le pega l jugador 2
                jugador1.luchar(jugador2);
                
            }
            else{//jugador 2 le pega al jugador 1
                jugador2.luchar(jugador1);
            }
            System.out.println("la vida del jugador1 es " + jugador1.getVida()+"y la vida del jugador2 es"+jugador2.getVida());
        }
        
        while(jugador1.getVida()>0&&jugador2.getVida()>0);
        
        if (jugador1.getVida()==0){
            //jugador 1 ha perdido
            System.out.println("ha ganado"+jugador2.toString());
            
        }
        else{
            System.out.println("ha ganado "+jugador1.toString());
        }
                
        
    }
    
}
