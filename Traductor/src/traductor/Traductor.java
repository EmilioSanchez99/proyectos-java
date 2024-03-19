/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package traductor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class Traductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        File frase = new File("frase.txt");
        File diccionario = new File("diccionario.txt");

        String[][] matriz = new String[10][2];
        String[] arrayFrase = null;

        try {

            //leer y mostrar la frase base
            FileReader filereader = new FileReader(frase);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            String fraseBase = bufferedreader.readLine();
            System.out.println(fraseBase);

            arrayFrase = fraseBase.split(" ");

            //leer y separar el diccionario
            FileReader filereader2 = new FileReader(diccionario);
            BufferedReader bufferedreader2 = new BufferedReader(filereader2);
            boolean cont = true;
            String linea;
            int i = 0;
            String[] arrayLinea;
            linea = bufferedreader2.readLine();
            while (linea != null) {

                arrayLinea = linea.split(";");

                matriz[i][0] = arrayLinea[0];
                matriz[i][1] = arrayLinea[1];

                i++;

                linea = bufferedreader2.readLine();

            }

        } catch (IOException e) {
            System.out.println("no se puede acceder al archivo");

        } catch (NullPointerException e2) {
            System.out.println("archivo vacio");

        }

        try {
            FileWriter filewriter = new FileWriter(frase, false);  //true añade y false sustituye
            BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
            boolean salir = false;
            int i = 0;

            for (int j = 0; j < arrayFrase.length; j++) {
                for (int k = 0; k < matriz[0].length; k++) {
                    if (arrayFrase[j].equalsIgnoreCase(matriz[k][0])) {
                        arrayFrase[j] = matriz[k][1];

                    }

                }

            }

            String aux = " ";
            for (int j = 0; j < arrayFrase.length; j++) {
                aux = aux + arrayFrase[j] + " ";

            }

            System.out.println(aux);

            bufferedwriter.write(aux);
            bufferedwriter.close();

        } catch (NullPointerException e2) {
            System.out.println(" no se puede sobreescribir porque el archivo esta vacio");

        }

    }//main

    public static void mostrar(String[][] a) {
        for (int i = 0; i < a.length; i++) {

            System.out.println(Arrays.toString(a[i]));

        }

    }

    public static void mostrarArray(String[] array) {

        for (int i = 0; i < array.length; i++) {
            do{
                System.out.print(array[i]);
            }
            while(array[i]!=null);
        }
    }

}
