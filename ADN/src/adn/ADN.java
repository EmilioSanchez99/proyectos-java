/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adn;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Medac
 */
public class ADN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("adn.txt");

        System.out.println("Introduce una subcadena");
        try {
            String subcadena = sc.next();
            char[] subCadenaArray = subcadena.toCharArray();
            
            //match es como un contains pero con un patron, por ejemplo [0-9] 
            //esto sustituye a los 4 if de abajo

            if (!subcadena.matches("[ACGT]+")) {
                System.out.println("La subcadena introducida contiene caracteres no válidos.");
                throw new LetraException();
            }
            

            if (subCadenaArray[0] == 'C' || subCadenaArray[0] == 'G' || subCadenaArray[0] == 'T' || subCadenaArray[0] == 'A') {
                if (subCadenaArray[1] == 'C' || subCadenaArray[1] == 'G' || subCadenaArray[1] == 'T' || subCadenaArray[1] == 'A') {
                    if (subCadenaArray[2] == 'C' || subCadenaArray[2] == 'G' || subCadenaArray[2] == 'T' || subCadenaArray[2] == 'A') {
                        if (subCadenaArray[3] == 'C' || subCadenaArray[3] == 'G' || subCadenaArray[3] == 'T' || subCadenaArray[3] == 'A') {

                            FileReader fr = new FileReader(file);
                            BufferedReader bf = new BufferedReader(fr);
                            String cadena = bf.readLine();
                            System.out.println(cadena);

                            if (cadena.contains(subcadena)) {
                                System.out.println("correcto");

                                String cadena2 = cadena.replaceAll(subcadena, "ACAT");
                                System.out.println(cadena2);

                                // System.out.println(Math.abs(cadena.compareTo(subcadena)));
                                System.out.println(contarSubcadena(cadena, subcadena));

                            }

                        } else {
                            throw new LetraException();
                            // System.out.println("no encontrado");
                        }
                    } else {
                        throw new LetraException();
                        // System.out.println("no encontrado");
                    }
                } else {
                    throw new LetraException();
                    // System.out.println("no encontrado");
                }
            } else {
                throw new LetraException();
                // System.out.println("no encontrado");
            }

        } catch (LetraException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }//main
        
    public static int contarSubcadena(String texto, String subcadena) {
        int recuento = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = texto.indexOf(subcadena, lastIndex);

            if (lastIndex != -1) {
                recuento++;
                lastIndex += subcadena.length();
            }
        }
        return recuento;
    }
}
