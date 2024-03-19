/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package danmental_corregido;

import java.io.File;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Medac
 */
public class DanMental_Corregido {

    /**1
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file1 = new File("pacientes.txt");
        File file2 = new File("config.txt");
        File file3 = new File("sondaje.txt");
        boolean salir = false;
        int size;
        int cont = 0;

        do {
            System.out.println("1.crear 2 ver 3 sondaje 4 salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1://crear paciente
                     try {
                    size = devolverTamaño(file2);
                    System.out.println("introduce nombre");
                    String nombre = sc.next();
                    System.out.println("introduce apellido");
                    String apellido = sc.next();
                    System.out.println("introduce la edad");
                    String edad = sc.next();
                    

                    FileWriter filewriter = new FileWriter(file1, true);
                    BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
                    bufferedwriter.write(size + " " + nombre + " " + apellido + " " + edad + " ");
                    bufferedwriter.newLine();
                    bufferedwriter.close();
                    bufferedwriter = new BufferedWriter(new FileWriter(file2, false));
                    bufferedwriter.write(String.valueOf(size));

                } catch (IOException e) {
                    System.out.println(e);
                }

                break;
                case 2://ver 
                    
                    try {
                    size = devolverTamaño(file2);
                    Paciente[] pacientes = new   Paciente[size];

                    BufferedReader bufferedreader = new BufferedReader(new FileReader(file1));
                    String linea = bufferedreader.readLine();

                    while (linea != null) {
                        String[] division = linea.split(" ");

                        Paciente paciente = new Paciente(division[1], division[2], Integer.parseInt(division[3]), Integer.parseInt(division[0]));

                        pacientes[cont] = paciente;
                        cont++;
                        linea = bufferedreader.readLine();
                    }
                    bufferedreader.close();
                    
                } catch (IOException e) {
                    System.out.println(e);
                }

                break;
                case 3://sondaje
                    try{
                        System.out.println("sangrado en pacientes: ");
                        BufferedReader br=new BufferedReader (new FileReader(file3));
                        String texto=br.readLine();
                        String[]array=texto.split(" ");
                        for (int i = 0; i < array.length; i++) {
                            if (array[i].contains("+")) {
                                System.out.println(array[i].substring(1));
                                
                            }
                            
                        }
                                
                    }
                        catch(IOException e){
                            System.out.println(e);
                        }
                    break;
                case 4:
                    salir=true;
                    System.out.println("has salido");
                    break;
                    
                default:
                    System.out.println("incorrecto,elige de nuevo");
                    break;
                      

            }
        } while (!salir);

    }//main

    private static int devolverTamaño(File file2) throws IOException {
        int num = 0;
        try {
            FileReader filereader = new FileReader(file2);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            String texto = bufferedreader.readLine();
            if (texto != null) {
                num = Integer.parseInt(texto);

            }
            else{
                num=1;
            }
            
        } catch (IOException e) {
            System.out.println(e);
        }

        return num;

    }

}
