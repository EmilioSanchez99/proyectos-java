/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundirlaflota2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class HundirLaFlota2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
       
     
    
     
   
     /*mostrarMatriz(tablero);*/
     
       
       //declaramos array tablero
       char[][] tablero=new char[10][10];
            for(int i=0;i<tablero.length;i++){
                for(int j=0;j<tablero[0].length;j++){
                    tablero[i][j]='A';
                }
    }
 
            
            /*System.out.println("-----------");*/
            
            //declaramos arrays de barcos
            
       
            
        introducirBarco(tablero, 5,'B');
        introducirBarco(tablero, 3,'C');
        introducirBarco(tablero, 1,'D');
       
        char[][] copiatablero=new char[10][10];
        rellenar(copiatablero);
        
        //Jugar
        int coordx,coordy;
        int contB1=5,contB2=3,contB3=1;
        do{
            System.out.println("introduce coordenada x");
            coordx=sc.nextInt();
            System.out.println("introduce coordenada y");
            coordy=sc.nextInt();
            
            
            char letra=tablero[coordx][coordy];
                switch(letra){
                    case 'A':
                        System.out.println("agua");
                        break;
                    case 'B':
                        System.out.println("tocado");
                        tablero[coordx][coordy]='T';
                        contB1--;
                        copiatablero[coordx][coordy]='T';
                        break;
                    case 'C':
                        System.out.println("tocado");
                        tablero[coordx][coordy]='T';
                        contB2--;
                        copiatablero[coordx][coordy]='T'; 
                        break;
                    case 'D':
                        System.out.println("tocado");
                        tablero[coordx][coordy]='T';
                        contB3--;
                        copiatablero[coordx][coordy]='T';    
                        break;
                        
                }       
           mostrar(copiatablero);
            System.out.println("------");
           mostrar(tablero);
                
        }
        
         while(!(contB1==0&&contB2==0&&contB3==0));
        
       
        
       

       
       
       
       
       
       
       
       
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
      boolean  condicion;
      int posx,posy;
      
      do{
      condicion=false;
      posx=(int) (Math.random()*10);
      posy=(int) (Math.random()*10);
      if(posy+tamaño<m[0].length){
          condicion=true;
           //comprobar que no coincidan barcos
           for (int i=0;i<tamaño;i++){
               if(m[posx][posy+i]!='A'){
                   condicion=false;
               }
           }
           if(condicion==true){
               for(int i=0;i<tamaño;i++){
                   m[posx][posy+i]=letra;
               }
           }
      }
      }
      while(!condicion);
     }
     
     
}
