/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monopoli;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Monopoli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Hotel1 hotelBOOM=new Hotel1();
        Hotel2 hotelCHINATOWN=new Hotel2();
        Hotel3 hotelPRESIDENT=new Hotel3();
        Hotel4 hotelWAIKIKI=new Hotel4();
        Hotel5 hotelFONTAINE=new Hotel5();
        Hotel6 hotelBLUE=new Hotel6();
        Jugador jugador=new Jugador();
        
        Hotel [] array={hotelBOOM,hotelCHINATOWN,hotelPRESIDENT,hotelWAIKIKI,hotelBLUE,hotelFONTAINE};
        
        int turno=0;
        boolean pasar;
        
        do{
            
            int respuesta;
            
            
                turno++;
                int dado1=(int) (Math.random()*6);
                System.out.println("Ha salido "+dado1+" en el dado");
                
                if(array[dado1].isComprado()){
                    jugador.setDinero(jugador.getDinero()-500000);
                }
                else{
                    System.out.println("Has caido en Hotel BOOM, Que quieres hacer? 1.Jugar 2.Pasar");
                        respuesta=sc.nextInt();
                    
                    
                switch (dado1){
                    
                    case 1:
                        
                        
                        if(respuesta==1){
                            hotelBOOM.setComprado(true);
                            int dado2=(int)(Math.random()*4);
                            
                            switch(dado2){
                                
                                case 0:
                                    System.out.println("Te ha salido gratis");
                                    break;
                                case 1:
                                    System.out.println("Has comprado a precio normal");
                                    jugador.setDinero(jugador.getDinero()-hotelBOOM.precio);
                                    break;
                                case 2:
                                    System.out.println("Has pagado el doble");
                                    jugador.setDinero(jugador.getDinero()-(hotelBOOM.precio*2));
                                    break;
                                case 3:
                                    System.out.println("Has pagado pero no es tuyo, pringao");
                                    jugador.setDinero(jugador.getDinero()-hotelBOOM.precio);
                                    hotelBOOM.setComprado(false);
                                    break;
                            }
                        }
                        else{
                            jugador.setDinero(jugador.getDinero()+500000);
                        }
                        break;
                        
                    case 2:
                        System.out.println("Has caido en Hotel CHINATOWN Que quieres hacer? 1.jugar 2.Pasar");
                         respuesta=sc.nextInt();
                        
                        if(respuesta==1){
                            hotelCHINATOWN.setComprado(true);
                            int dado2=(int)(Math.random()*4);
                            
                            switch(dado2){
                                
                                case 0:
                                    System.out.println("Te ha salido gratis");
                                    break;
                                case 1:
                                    System.out.println("Has comprado a precio normal");
                                    jugador.setDinero(jugador.getDinero()-hotelCHINATOWN.precio);
                                    break;
                                case 2:
                                    System.out.println("Has pagado el doble");
                                    jugador.setDinero(jugador.getDinero()-(hotelCHINATOWN.precio*2));
                                    break;
                                case 3:
                                    System.out.println("Has pagado pero no es tuyo, pringao");
                                    jugador.setDinero(jugador.getDinero()-hotelCHINATOWN.precio);
                                    hotelCHINATOWN.setComprado(false);
                                    break;
                            }
                        }
                        else{
                            jugador.setDinero(jugador.getDinero()+500000);
                        }
                        break;
                    case 3:
                        System.out.println("Has caido en Hotel PRESIDENT");
                         respuesta=sc.nextInt();
                        
                        if(respuesta==1){
                            hotelBOOM.setComprado(true);
                            int dado2=(int)(Math.random()*4);
                            
                            switch(dado2){
                                
                                case 0:
                                    System.out.println("Te ha salido gratis");
                                    break;
                                case 1:
                                    System.out.println("Has comprado a precio normal");
                                    jugador.setDinero(jugador.getDinero()-hotelBOOM.precio);
                                    break;
                                case 2:
                                    System.out.println("Has pagado el doble");
                                    jugador.setDinero(jugador.getDinero()-(hotelBOOM.precio*2));
                                    break;
                                case 3:
                                    System.out.println("Has pagado pero no es tuyo, pringao");
                                    jugador.setDinero(jugador.getDinero()-hotelBOOM.precio);
                                    hotelBOOM.setComprado(false);
                                    break;
                            }
                        }
                        else{
                            jugador.setDinero(jugador.getDinero()+500000);
                        }
                        break;
                    case 4:
                        System.out.println("Has caido en Hotel WAIKIKI");
                         respuesta=sc.nextInt();
                        
                        if(respuesta==1){
                            hotelBOOM.setComprado(true);
                            int dado2=(int)(Math.random()*4);
                            
                            switch(dado2){
                                
                                case 0:
                                    System.out.println("Te ha salido gratis");
                                    break;
                                case 1:
                                    System.out.println("Has comprado a precio normal");
                                    jugador.setDinero(jugador.getDinero()-hotelBOOM.precio);
                                    break;
                                case 2:
                                    System.out.println("Has pagado el doble");
                                    jugador.setDinero(jugador.getDinero()-(hotelBOOM.precio*2));
                                    break;
                                case 3:
                                    System.out.println("Has pagado pero no es tuyo, pringao");
                                    jugador.setDinero(jugador.getDinero()-hotelBOOM.precio);
                                    hotelBOOM.setComprado(false);
                                    break;
                            }
                        }
                        else{
                            jugador.setDinero(jugador.getDinero()+500000);
                        }
                        break;
                    case 5:
                        System.out.println("Has caido en Hotel FONTAINE"); 
                         respuesta=sc.nextInt();
                        
                        if(respuesta==1){
                            hotelBOOM.setComprado(true);
                            int dado2=(int)(Math.random()*4);
                            
                            switch(dado2){
                                
                                case 0:
                                    System.out.println("Te ha salido gratis");
                                    break;
                                case 1:
                                    System.out.println("Has comprado a precio normal");
                                    jugador.setDinero(jugador.getDinero()-hotelBOOM.precio);
                                    break;
                                case 2:
                                    System.out.println("Has pagado el doble");
                                    jugador.setDinero(jugador.getDinero()-(hotelBOOM.precio*2));
                                    break;
                                case 3:
                                    System.out.println("Has pagado pero no es tuyo, pringao");
                                    jugador.setDinero(jugador.getDinero()-hotelBOOM.precio);
                                    hotelBOOM.setComprado(false);
                                    break;
                            }
                        }
                        else{
                            jugador.setDinero(jugador.getDinero()+500000);
                        }
                        break;
                    case 6: 
                        System.out.println("Has caido en Hotel BLUE");
                         respuesta=sc.nextInt();
                        
                        if(respuesta==1){
                            hotelBOOM.setComprado(true);
                            int dado2=(int)(Math.random()*4);
                            
                            switch(dado2){
                                
                                case 0:
                                    System.out.println("Te ha salido gratis");
                                    break;
                                case 1:
                                    System.out.println("Has comprado a precio normal");
                                    jugador.setDinero(jugador.getDinero()-hotelBOOM.precio);
                                    break;
                                case 2:
                                    System.out.println("Has pagado el doble");
                                    jugador.setDinero(jugador.getDinero()-(hotelBOOM.precio*2));
                                    break;
                                case 3:
                                    System.out.println("Has pagado pero no es tuyo, pringao");
                                    jugador.setDinero(jugador.getDinero()-hotelBOOM.precio);
                                    hotelBOOM.setComprado(false);
                                    break;
                            }
                        }
                        else{
                            jugador.setDinero(jugador.getDinero()+500000);
                        }
                        break;
                }
                        
                        
           
            }
            System.out.println(turno);
            
        }
        
     
        while(jugador.getDinero()>0&&turno<=12);
        
        
    }//main
    
    
    public static void mostrar (Hotel[]tablero){
        char letra=' ';
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i].isComprado()) {
                letra='x';
                
            }
            System.out.println(tablero[i].getNombre()+"["+letra+"]");
            
        }
    }
}
