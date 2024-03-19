/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventario;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ExceptionBarra {

        String texto = null;
        String[] arrayLinea = null;
        Articulo[] articulos = new Articulo[100];

        int cont = 0;
        File file = new File("fichero.txt");
        FileReader filereader = new FileReader(file);
        BufferedReader bufferedreader = new BufferedReader(filereader);
        try {

            texto = bufferedreader.readLine();

            while (texto != null) {
                if (texto.contains("/")) {
                    throw new ExceptionBarra();

                }
                arrayLinea = texto.split(":");
                articulos[cont] = new Articulo(arrayLinea[0], Integer.parseInt(arrayLinea[1]), Integer.parseInt(arrayLinea[2]));

                texto = bufferedreader.readLine();

                cont++;
            }
            mostrar(articulos);
            bufferedreader.close();

        } catch (ExceptionBarra e2) {
            System.out.println(e2);

        } catch (IOException e) {
            System.out.println(e);
        }

    }//main

    public static void mostrar(Articulo[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i]);

            }
        }
    }
}
