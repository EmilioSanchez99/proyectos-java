/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control_excepcipones;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Control_Excepcipones {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        /*int b=0;
        int a=5;
        try{
            System.out.println(a/b);
            
        }
        catch(ArithmeticException e){
            System.out.println("no se puede dividir entre 0");
        }
        */
        /*int num;
        int[]array={3,4,7};
        System.out.println("introduce numero");*/
        
       /* try{
            num=sc.nextInt();
           System.out.println(array[num]/num); 
           
        }*/
       
       /*try{
           division(array);
           
       }
        catch(ArithmeticException e){
           
            System.out.println("error por dividir por 0");
        }
       catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("error tamaño array");
        }
        
        catch(InputMismatchException e3){
            System.out.println("no es un valor correcto, se espera int y ha recibido otro tipo");
        }
        
        finally{
            System.out.println("entrando en el finally");
        }*/
       
       
       
       try{
           int edad=sc.nextInt();
       
       if (edad<18){
           throw new ArithmeticException();
       }
       }
       catch
       
        
        
        
        
        
        
    }//main

    

  
        Scanner sc=new Scanner(System.in);

    public static void division(int[]array) throws ArithmeticException{
        Scanner sc=new Scanner(System.in);
        
        /*try{*/
            int num=sc.nextInt();
        System.out.println(array[num]/num);
        System.out.println("final del try");
        if (num>2) {
            throw new ArrayIndexOutOfBoundsException();
            
        }
        
        
        
        //}
       /* catch(ArithmeticException e){
            System.out.println("error por division");
        }*/
        
       //new throw ArithmeticException("hola"){
        //System.out.println("hola");
    
   
    }
      
    
}
