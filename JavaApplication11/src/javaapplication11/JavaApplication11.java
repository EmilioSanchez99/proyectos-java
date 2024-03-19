/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;
import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;

/**
 *
 * @author emili
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        try{
            
            int edad=sc.nextInt();
            int division=edad/0;
            
        }
        catch(InputMismatchException e){
            System.out.println("error");
        }
        System.out.println("buvbs");
    }
    
}
