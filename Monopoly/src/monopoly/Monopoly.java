/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monopoly;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author FX705G
 */
public class Monopoly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        

        System.out.println("comienza el juego.");
        
        System.out.println("Nombre del jugador");
        String nombre = sc.next ();
        
        Jugador j1 = new Jugador(nombre);

        System.out.println(j1);

        Hotel [] tableroHoteles = new Hotel [3];
        
        tableroHoteles [0] = new HotelBoom ();
        tableroHoteles [1] = new HotelBlue ();
        tableroHoteles [2] = new HotelChinatow();
        
        int turnos;
        turnos = 1;
        boolean ganado;
        ganado = false;
        
            do {
                System.out.println(Arrays.toString(tableroHoteles));
                System.out.println("Turnos: "+turnos);
                System.out.println("1 Pasas el turno 2 Tira dado ");
                int opcion;
                opcion = sc.nextInt();
                
                
                
                
                
                
                switch (opcion) {
                    case 1:
                        System.out.println("Pasaste el turno");
                        break;
                    case 2:
                        System.out.println("Tiramos el dado");
                        int dado = (int) (Math.random()*3);
                        System.out.println(dado);
                       System.out.println("El hotel es: "+tableroHoteles[dado].getNombre());
                        
                       
                        if (tableroHoteles[dado].isComprado()) {
                            System.out.println("Ya tienes el hotel. Pierdes 500000 euros.");
                            j1.setDinero(j1.getDinero()-500000);
                        }else{
                            
                        
                       
                       
                       int dadoPrecio = (int)(Math.random()*4);
                       
                        System.out.println("Ha salido: "+dadoPrecio);
                       
                        switch (dadoPrecio) {
                            case 0:
                                System.out.println("El hotel "+tableroHoteles[dado].getNombre()+" es gratis");
                                tableroHoteles[dado].setComprado(true);
                                break;
                                
                            case 1:
                                
                                System.out.println("Compras el hotel"+tableroHoteles[dado].getPrecio()+" por su precio original");
                                
                                j1.setDinero(j1.getDinero()-tableroHoteles[dado].getPrecio());
                                
                                
                                tableroHoteles[dado].setComprado(true);
                                break;
                            case 2:
                                
                                System.out.println("Compras el hotel"+tableroHoteles[dado].getPrecio()*2+" por 2");
                                
                                j1.setDinero(j1.getDinero()-tableroHoteles[dado].getPrecio()*2);
                                
                                
                                tableroHoteles[dado].setComprado(true);
                                
                                
                                break;
                            case 3:
                                System.out.println("Compras el hotel"+tableroHoteles[dado].getPrecio()*3+" por 3");
                                
                                j1.setDinero(j1.getDinero()-tableroHoteles[dado].getPrecio()*3);
                                
                                
                                tableroHoteles[dado].setComprado(true);
                                
                                break;
                            
                                
                        }
                        }
                        break;
                        
                        
                    
                        
                }
                        
                turnos++;
                
                j1.setDinero(j1.getDinero()+500000);
                        
                        System.out.println("Ahora tienes: "+j1.getDinero());
                int contador;
                contador = 0;
                
                for (int i = 0; i < tableroHoteles.length; i++) {
                    if (tableroHoteles[i].isComprado()) {
                        contador++;
                    }
                }
                if (contador == 3) {
                    ganado = true;
                    System.out.println("Has ganado!!");
                }
        
                
            
        } while (turnos < 13 && j1.getDinero()>0 && !ganado);
            System.out.println("Termino el juego");

        















// No tocar
    }
    
}
