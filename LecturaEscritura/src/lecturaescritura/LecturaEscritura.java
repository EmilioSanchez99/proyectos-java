/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecturaescritura;

import java.io.*;

/**
 *
 * @author Medac
 */
public class LecturaEscritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //archivo en la misma carpeta del proyecto
        File file = new File("inspector.txt");

        //archivo guardado en otro directorio
        // File file2=new File("aqui poner la ruta");
        if (file.canRead()) {
            System.out.println("se puede leer");
        } else {
            System.out.println("no se puede leer");
        }
        int num;
        char letra = 0;
        char[] palabra = new char[8];
        String frase;
        String frase2 = "";

        try {
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            frase = bufferedreader.readLine();
            while (frase != null) {
                frase2 = frase2 + frase + '\n';
                frase = bufferedreader.readLine();
            }
            System.out.println(frase2);
            bufferedreader.close();

        } catch (IOException e) {
            System.out.println("error al leer archivo");

        }

        //ahora vamos a escribir en el archivo
        try {
            FileWriter filewriter = new FileWriter(file, true);  //true añade y false sustituye
            
           BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
           bufferedwriter.write("hola"+" ");
           bufferedwriter.newLine();
           bufferedwriter.write("que tal" + " "+'\n');
           
           
           
           bufferedwriter.close();
        }
        
       catch (IOException e) {
            System.out.println("error al leer archivo");

        }

        
        
        
        
        
        
        
        
        
        
        FileReader filereader = null;
        try {

            if (file.canRead()) {
                filereader = new FileReader(file);

                num = filereader.read();
                while (num != -1) {
                    letra = (char) num;
                    //System.out.print(letra);

                    for (int i = 0; i < palabra.length; i++) {
                        palabra[i] = letra;
                        num = filereader.read();
                        letra = (char) num;
                    }

                }
                System.out.println(palabra);
                filereader.close();
            }

        } catch (IOException e) {
            System.out.println("error al leer archivo");
            filereader.close();
        }
    }//main

}
