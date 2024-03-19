/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundir.la.flota;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class HundirLaFlota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       
       
       //declaramos array tablero
       char[][] tablero=new char[10][10];
            for(int i=0;i<tablero.length;i++){
                for(int j=0;j<tablero[0].length;j++){
                    tablero[i][j]='A';
                }
    }
 
            mostrar(tablero);
            System.out.println("-----------");
            
            //declaramos arrays de barcos
            char [] barco1={'b','b','b','b','b'};
            char [] barco2={'c','c','c'};
            char [] barco3={'d'};
            
            
            boolean aux;
            
            do{
                
                aux=true;
                
                //pedimos las coordenadas
                
                int min1=0;
                int max1=5;
                int posx1=(int) (Math.random()*(max1-min1)+min1);
                int posy1=(int) (Math.random()*(max1-min1)+min1);
                                                                                        System.out.println("b="+posy1);
                if(posy1<6){
                    for(int i=0;i<5;i++){
                        tablero[posx1][posy1+i]= barco1[i];
                    
                    }
                }
            
                    else{
                    aux=false;
                    }
                    
                int min2=0;
                int max2=7;
                int posx2=(int) (Math.random()*(max2-min2)+min2);
                int posy2=(int) (Math.random()*(max2-min2)+min2);
             
                                                                                        System.out.println("c="+posy2);
                if(posy2<8){
                    for(int i=0;i<3;i++){
                        tablero[posx2][posy2+i]= barco2[i];
                    
                    }
                }
                
                else{
                    aux=false;
                    }
                
                int min3=0;
                int max3=9;
                int posx3=(int) (Math.random()*(max3-min3)+min3);
                int posy3=(int) (Math.random()*(max3-min3)+min3);
                                                                                        System.out.println("d="+posy3);
                if(posy3<11){
                    for(int i=0;i<1;i++){
                        tablero[posx3][posy3+i]= barco3[i];
                    
                    }
                }
                
                else{
                    aux=false;
                    }
                break;
            }
            
            while(!aux);
            
            
            
            mostrar(tablero);
            
       
       /*double min = 1.0;
        double max = 7.0;
        
        // Genera un número aleatorio en el rango [min, max]
        double randomNumber = Math.random() * (max - min) + min;
        
        System.out.println(
        
       
"Número aleatorio entre " + min + " y " + max + ": " + randomNumber);*/
       
       
       
       
       
       
       
       
    }
    //funciones
    
    //mostrar matriz
    
     public static void mostrar(char [][] a){
    for (int i=0;i<a.length;i++){
        System.out.println(Arrays.toString(a[i]));
    }
}
     //rellenar matriz
     public static void rellenar(char[][] a){
         for(int fila=0;fila<a.length;fila++)
             Arrays.fill(a[fila], 'A');
     }
     
     //introducir barco
     
     public static void introducirBarco(char[][] m,int tamaño, char letra){
         
     }
     
     
}
