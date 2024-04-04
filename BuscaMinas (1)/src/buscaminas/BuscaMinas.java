/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscaminas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class BuscaMinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       
        //crear matriz
        char[][] tablero=new char[3][3];
            for(int i=0;i<tablero.length;i++){
                for(int j=0;j<tablero[0].length;j++){
                    tablero[i][j]='*';
                }
    }
            
            char[][] copiatablero=new char[3][3];
            rellenar(copiatablero);
            
            
            //meter una mina
            introducirMina(tablero,1,'M');
            
            
            //jugar
            int aciertos = 8;
            int vidas=1;
            
            do{
                int coordx, coordy;
            
                do{
            
            System.out.println("introduce coordenada x");
            coordx=sc.nextInt();
            System.out.println("introduce coordenada y");
            coordy=sc.nextInt();
                }
                while(!(coordx>=0&&coordx<3)||!(coordy>=0&&coordy<3));
            
            
             char letra=tablero[coordx][coordy];
            switch(letra){
                case '*':
                    System.out.println("has tenido suerte");
                    copiatablero[coordx][coordy]='_';
                    tablero[coordx][coordy]='_';
                    aciertos--;
                   
                    break;
             

                case 'M': 
                System.out.println("has pisado una mina, te vas a la mierda");
                copiatablero[coordx][coordy]='M';
                
                vidas--;
                break;
            }
                
                System.out.println( "te queda "+ vidas+" vida");
            
            
            mostrar(copiatablero);
            
            
            
             if(aciertos==0){
                 vidas--;
                System.out.println("has ganado makina");
            }
            }
            while(vidas!=0);
           
            
            System.out.println("has salido del juego");
            
            
            
            
            
            
            
            
            
            
            
            
                    
                    
                    
                    
    }
    // funciones
    
    //rellenar
    public static void rellenar(char[][] a){
         for(int fila=0;fila<a.length;fila++)
             Arrays.fill(a[fila], '*');
     }
    
    //mostrar matriz
      public static void mostrar(char [][] a){
    for (int i=0;i<a.length;i++){
        System.out.println(Arrays.toString(a[i]));
    }
}
    
      
      //introducir mina aleatoria
      public static void introducirMina(char[][] m,int tamaño, char letra){
      
      int posx,posy;
      posx=(int) (Math.random()*m.length);
      posy=(int) (Math.random()*m.length);
      
          m[posx][posy]=letra;
          
      }
}
    

