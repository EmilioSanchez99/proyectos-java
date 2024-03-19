/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sanchezvargas2emilio;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class SanchezVargas2Emilio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        //declaramos el tablero
        char[][] tablero= new char[10][10];
        //rellenamos el tablero
        rellenar(tablero);
        
        rellenarblanco(tablero);
        char jugador='o';
       
                
                
        mostrar(tablero);
        
        //jugar
        int movimiento = 0;
        int posx=0;
        int posy=0;
        int turno=0;
        boolean jugar=false;
        boolean condicion=true;
        //creamos un DO while para ver si quiere jugar cusando pierde
        do{
            //creamos otro do while que va pidiendo los movimientos
            do{
                condicion=true;
                do{
            System.out.println("muevete 1.derecha 2.izquierda 3.arriba 4. abajo");
            movimiento=sc.nextInt();
         
            //creamos un switch para contemplar los movimientos, y si es pared le resta un turno
            switch (movimiento){
                case 1:
                       if(tablero[posx][posy+1]=='x'){//añadir un || posy+1>a.length
                   condicion=false; 
                     System.out.println("pared, vueleve a moverte");
                     
                     turno++;
                     
                 }
                       else {
                           condicion=true;
                           tablero[posx][posy+1]=jugador;
                        tablero[posx][posy]=' ';
                        posy++;
                        mostrar(tablero);
                       }
                        
                         break;
                case 2:
                       if(tablero[posx][posy-1]=='x'){//añadir un || posy+1>a.length
                   condicion=false; 
                     System.out.println("pared, vueleve a moverte");
                    
                     turno++;
                     
                 }
                       else {
                           condicion=true;
                           tablero[posx][posy-1]=jugador;
                        tablero[posx][posy]=' ';
                        mostrar(tablero);
                        posy--;
                       }
                        
                        break;
                case 3:
                       if(tablero[posx-1][posy]=='x'){//añadir un || posy+1>a.length
                   condicion=false; 
                     System.out.println("pared, vueleve a moverte");
                    
                     turno++;
                     
                 }
                       else {
                           condicion=true;
                           tablero[posx-1][posy]=jugador;
                        tablero[posx][posy]=' ';
                        mostrar(tablero);
                        posx--;
                       }
                        
                        break;
                case 4:
                       if(tablero[posx+1][posy]=='x'){//añadir un || posy+1>a.length
                   condicion=false; 
                     System.out.println("pared, vueleve a moverte");
                  
                     turno++;
                     
                 }
                       else {
                           condicion=true;
                           tablero[posx+1][posy]=jugador;
                        tablero[posx][posy]=' ';
                        mostrar(tablero);
                        posx++;
                       }
                        
                        break;
                default:
                    //sumamos turno y pedimos un nuevo numero valido
                    turno++;

                    System.out.println("vuelve a introducir un numero valido");
                   break; 
            }
                 
                 
            
 
            }
            while(condicion);
            
        }
            while (turno<3&&!(tablero[9][9] ==jugador));// si llega a 3 turnos gastados pierde
            
            
            
                     System.out.println("has ganado");
                     
                 
            
            
            
        System.out.println("se han acabado los turnos, has perdido");
        
        //preguntamos si quiere jugar de nuevo reiniciando el contador de turnos a 0
            System.out.println("quieres volver a jugar? True/false");
            jugar=sc.nextBoolean();
            if(jugar){
                turno=0;
            }
                    
        }
        
        
        while(jugar);
        System.out.println("has salido ");
        //si llega a la casilla de salida ha ganado
                  if( tablero[9][9]==jugador){
                     System.out.println("has ganado");
                     
                 }
        
         
        
       
    }//corchete main
    
    
    
    
    
    //FUNCIONES
    
    //Rellenar matriz entera de x
    
         public static void rellenar(char[][] a){
         for(int fila=0;fila<a.length;fila++){
             Arrays.fill(a[fila], 'x');
         }
     }
         
         //Mostrar 
          public static void mostrar(char [][] a){
            for (int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
    }
}
          
          //rellenar en blanco y las x del bloque izquierdo del pasillo
             public static void rellenarblanco(char[][] a){
            for(int i=0;i<a.length;i++){
                for(int j=0;j<6;j++){
                    a[i][j]=' ';
            a[1][5]=' ';
            a[2][5]=' ';
            a[3][5]=' ';
            for(int k=1;k<a.length;k++){
                for(int l=0;l<5;l++){
                    a[k][l]='x';
                }
            }
            for(int m=4;m<a.length;m++){
                for(int n=0;n<6;n++){
                    a[m][n]='x';
                }
            }
            a[3][6]=' ';
            a[4][6]=' '; 
            a[5][6]=' ';
            a[6][6]=' ';
            a[7][6]=' ';
            a[7][7]=' ';
            a[8][7]=' ';
            
            for(int p=9;p<a.length;p++){
                for(int q=7;q<a.length;q++){
                    a[p][q]=' ';
         }
     }
         
    }
            
   }
 }
             
             
}//corchete class
             
             
                