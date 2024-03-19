/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guerramundial;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Medac
 */
public class GuerraMundial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("ciudad.txt");
        File file2=new File ("ciudadCodificada.txt");
        char[] array = new char[6];
        int[] array2 = new int[6];
        int num;
        String nombre;
        char letra;

        //rellenar array con la palabra
        FileReader filereader = null;
        try {

            if (file.canRead()) {
                filereader = new FileReader(file);

                num = filereader.read();
                while (num != -1) {
                    letra = (char) num;
                    //System.out.print(letra);

                    for (int i = 0; i < array.length; i++) {
                        array[i] = letra;
                        num = filereader.read();
                        letra = (char) num;
                    }

                }
                System.out.println(array); //aqui
                filereader.close();
            }

        } catch (IOException e) {
            System.out.println("error al leer archivo");

        }

        codificar(array, array2);

        
        mostrar(array2);
        
        String frase=descodificar(array2);
        System.out.println(frase);
        
        try {
            FileWriter filewriter = new FileWriter(file2, false);  //true añade y false sustituye
            
           BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
           bufferedwriter.write(frase);
           
           
          
           
           
           
           bufferedwriter.close();
        }
        
       catch (IOException e) {
            System.out.println("error al leer archivo");

        }
       
        
        
        

    }//main
    

    public static void mostrar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void codificar(char[] array, int[] array2) {
        int x;
        for (int i = 0; i < array.length; i++) {
            
            x = array[i];
            array2[i] = x;

        }

    }
    
    public static String descodificar(int[]array2){
        char y = 0;
        char[]array3=new char[6];
       String frase = null;
        for (int i = 0; i < array2.length; i++) {
            y=(char)array2[i];
            array3[i]=y;
            
           
            
        }
        frase=String.copyValueOf(array3);
        return frase;
    }

}
 