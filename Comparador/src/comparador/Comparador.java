/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparador;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Medac
 */
public class Comparador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File mercadona = new File("mercadona.txt");
        File carrefour = new File("carreofour");
        String nombre = " ";
        String precio=" ";
        int pr;
        int cont=0;
        Producto[] array=new Producto[4];
        try {
            FileReader filereader = new FileReader(mercadona);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            
         //  System.out.println(nombre);
                nombre=bufferedreader.readLine();
            while(nombre!=null){
                
                precio=bufferedreader.readLine();
                if (precio==null){
                    new throw IOException();
                }
                else{
                pr=Integer.parseInt(precio);
                array[cont]=new Producto (nombre,pr);
                cont++;
                nombre=bufferedreader.readLine();
                }
                
            }
            
        } catch (IOException e) {
            System.out.println("error al leer archivo");

        }
    }//main



}
