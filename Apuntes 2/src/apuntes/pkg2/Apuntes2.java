/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntes.pkg2;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Apuntes2 {
    //aqui declaramos una funcion ''media'' correspondiente al ejercicio 1
public static double media(double num1,double num2){
    double res=(num1+num2)/2;
    return res;
}
    
public static int potencia(int b, int e){
    int res=1;
    for(int i=1;i<=e;i++){
    res=res*b;
  }
    return res;
}

public static int factorial(int num){
    int res=1;
        for(int i=num;i>0;i--){
            res=res*i;
            
        }
        return res;
}


 

    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        
        //Ejercicio 1 aplicar una funcion ''media'' asignada arriba del todo fuera de MAIN
        
         /*int a=5;
         int b=6;
          System.out.println(media(a,b));*/
         
         // Ejercicio 2 aplicar funcion ''potencia'' asignada arriba
         
         /*int base,exp;
         System.out.println("dime la base");
         base=sc.nextInt();
         System.out.println("dime la exponencia");
         exp=sc.nextInt();
         System.out.println("el resultado es"+potencia(base,exp));*/
         
         //factorizar 
         
         /*System.out.println("introduce un numero para factorizar");
         int num; 
         num=sc.nextInt();
         System.out.println(factorial(num));*/
         
         //Tipos de salto : ''continue'' salta el paso en el que cumpla la condicion
         
         /*for (int i=0;i<4;i++){
             if(i==2){
                 continue;
             }
             System.out.println("i"+i);
         }*/
          /*int a=0;
        for( int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(j+2);
            }
            System.out.println(i*3);
        }*/
          //Ejercicio funcion
          
          
          
        
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
    
          
    }
    
}
