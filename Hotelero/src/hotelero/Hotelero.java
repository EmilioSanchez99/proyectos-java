/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelero;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author ivang
 */
public class Hotelero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int turnos=0;
        int conturnos=0;
        int contadorcompras=0;
        Scanner sc=new Scanner(System.in);
        Jugador j1=new Jugador();
        Hotelboom boom=new Hotelboom();
        Hotelchinatow china=new Hotelchinatow();
        Hotelpresident presi =new Hotelpresident();
        Hotelwaikiki wai=new Hotelwaikiki();
        Hotelfontaine fon=new Hotelfontaine();
        Hotelblue blue=new Hotelblue();
        Hoteles[] arrayhotel= {boom,china,presi,wai,fon,blue};
        System.out.println("*******COMIENZA EL JUEGO: EL COMPLLEJO HOTELERO NO TAN COMPLEJO*******");
        System.out.println(" ");
        System.out.println("Nombre del jugador:");
        System.out.println(j1.getNombre());
        do {
            System.out.println("Turno "+conturnos);
            System.out.print(j1.getNombre()+" tienes "+j1.getDinero()+" euros");
            System.out.println(" ");
            for (int i = 0; i < arrayhotel.length; i++)
            {
                int nhotel=i+1;
                if (arrayhotel[i].isComprado()) {
                     System.out.print(nhotel+"." );
                System.out.print( arrayhotel[i]);
                System.out.print("[X]");
                }
                else{
                    System.out.print(nhotel+"." );
                System.out.print( arrayhotel[i]);
                System.out.print("[ ]");
                }               
            }
             System.out.println(" ");
             System.out.println("Ahora, tiremos el dado....");
             System.out.println(" ");
             int dado;
             do {
               dado=(int)(Math.random()*6);
             System.out.println("Ha salido el numero " +(dado+1));    
             if (arrayhotel[dado].isComprado()) {
                 j1.dinero=j1.dinero-500000;
                 System.out.println("Este hotel ya ha sido comprado, como penalizacion le restamos 500.000euros;   Le quedan "+j1.getDinero());       
                 System.out.println("Tiremos el dado de nuevo...");
            }
            } while ((arrayhotel[dado].isComprado())&&(j1.dinero>0));
             
             System.out.println(" ");
             System.out.println(arrayhotel[dado].getNombre()+" ¿Qué quieres hacer? 1.Jugar 2.Pasar");
             System.out.println(" ");
             int res=sc.nextInt();
             if (res==1) {
                 System.out.println("Tiremos el dado para ver la opción de compra");
                 System.out.println(" ");
                 int dado2=(int)(Math.random()*4);
                 System.out.println("Ha salido el " +dado2);
                 if (dado2==0) {
                     System.out.println("El hotel es gratis!!!");
                     arrayhotel[dado].setComprado(true);
                 }
                 else if (dado2==1){
                     System.out.println("El hotel tiene su precio estipulado; "+arrayhotel[dado].getPrecio() +"euros.");
                     j1.dinero= j1.dinero-arrayhotel[dado].getPrecio();
                     arrayhotel[dado].setComprado(true);
                 }
                 else if(dado2==2){
                     System.out.println("Vaya putada... el hotel cuesta el doble; "+arrayhotel[dado].getPrecio()*2+ " euros");
                     j1.dinero= j1.dinero-(arrayhotel[dado].getPrecio()*2);
                     arrayhotel[dado].setComprado(true);
                 }
                 else{
                     System.out.println("Que mala suertes, pagas el hotel pero no pasa a tu posesion; "+arrayhotel[dado].getPrecio()+" euros");
                     j1.dinero= j1.dinero-arrayhotel[dado].getPrecio();
                 }
            }
             else{
                 turnos++;
                 conturnos++;
             }
             
            conturnos++;
            turnos++;
            System.out.println("Enhorabuena por la ronda, toma 500.000euros");
            j1.dinero=j1.dinero+500000;
            contadorcompras=0;
            for (int i = 0; i < arrayhotel.length; i++) {
               
                if (arrayhotel[i].isComprado()) {
                    
                    contadorcompras++;
                }
                
                
            }
            
        } while ((turnos<=12) && (j1.dinero>0)&&(contadorcompras<6));
        if(turnos>12){
            System.out.println("Has perdido, Te has quedado sin turnos");
        }
        if(j1.dinero<=0){
            System.out.println("Has perdido, Te has quedado sin dinero");
        }
        if (contadorcompras==6) {
            System.out.println("Has ganado, Te has hecho con todos los hoteles");
            
        }
    }
    
}
