  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicararraysmatrices;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author emili
 */
public class PracticarArraysMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        
        //APUNTES
        
        //copiar matriz
        
       /* int[][] matriz=new int[3][3];
            for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[0].length;j++){
                    matriz[i][j]=3;
                }
    }
        int[][] matrizCopia=matriz.clone();
        
        //comparar matriz
        
        boolean iguales= Arrays.equals(matriz, matrizCopia);
        System.out.println(iguales);
        
        //ordenar matriz
            Arrays.sort(matriz);
        
        //encontrar valor maximo
        int maximo = matriz[0][0];
        int minimo = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
            maximo = matriz[i][j];
                }
                if (matriz[i][j] < minimo) {
            minimo = matriz[i][j];
        }
    }
}
        System.out.println(minimo+","+maximo);
        
        //sumar elementos de matriz
     int suma = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            suma += matriz[i][j];
    }
}

            System.out.println(suma);
            
            
        //buscar valor en matriz
        
        int valorBuscado = 3;
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorBuscado) {
            encontrado = true;
            
        }
    }
}
        System.out.println(encontrado);
       
        
        
        
        int[] array = {5, 2, 9, 1, 3, 6, 4};

        // Ordenar la matriz en orden ascendente
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
       
        // Invertir el orden de los elementos para obtener orden descendente
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
        
        //obtener las dimensiones de una matriz
        
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        System.out.println(filas +","+columnas);*/
        
        
        
        
         //EJERCICIOS
         
         // crer una matriz en la que la posicion (n,m) sea la suma de n+m
         
         /*int [][] tabla= new int [5][5];
         
         for(int i=0;i<5;i++){
             for(int j=0;j<5;j++){
                 tabla[i][j]=i+j;
             }
         }
         
         mostrar(tabla);*/
        
   
        
        
        
        
        
        
        
        
        

        
    

        
        
    }
    
    //Funciones y metodos
    
    
    //Mostrar una matriz
    
    public static void mostrar(int [][] a){
    for (int i=0;i<a.length;i++){
        System.out.println(Arrays.toString(a[i]));
    }
}
    
    //rellenar matriz
     public static void rellenar(int [][] a){
         for(int fila=0;fila<a.length;fila++)
             Arrays.fill(a[fila], 'A');
     }
     
     
     //introducir mina aleatoria
      public static void introducirMina(char[][] m,int tamaño, char letra){
      
      int posx,posy;
      posx=(int) (Math.random()*m.length);
      posy=(int) (Math.random()*m.length);
      
          m[posx][posy]=letra;
          
      }
    
      
      //introducir barco
     
     public static void introducirBarco(char[][] m,int tamaño, char letra){
         
     }
     
}
