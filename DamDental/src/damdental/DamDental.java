/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package damdental;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class DamDental {

    Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InputMismatchException {
        Scanner sc = new Scanner(System.in);

        Paciente[] arrayPacientes = new Paciente[100];

        System.out.println("Bienvenido a DamDental");

        boolean salir = false;
        do {
            System.out.println("elige una opcion: 1.crear paciente 2.ver pacientes 3.sondaje 4.salir");
            int opcion = sc.nextInt();
            switch (opcion) {

                case 1://crear paciente

                    File pacientes = new File("pacientes.txt");
                    File config = new File("config.txt");
                    try {
                        FileReader filereader_config = new FileReader(config);
                        BufferedReader bufferedreader_config = new BufferedReader(filereader_config);
                        String tamaño = bufferedreader_config.readLine();
                        int tamaño_num = Integer.parseInt(tamaño);
                       

                        FileWriter filewriter_config = new FileWriter(config, false);//TRUE TE MANTINE LO QUE HYA DENTRO  Y FALSE TE BORRA EL ARCHIVO PARA ESCRIBIR 
                        BufferedWriter bufferedWriter_config = new BufferedWriter(filewriter_config);

                        tamaño_num++;
                        String tamaño_string = String.valueOf(tamaño_num);
                        bufferedWriter_config.write(tamaño_string + "\n");
                        bufferedWriter_config.close();
                        String nom;
                        String ape;
                        int edad2;

                        FileReader filereader = new FileReader(pacientes);
                        System.out.println("dime el nombre");
                        nom = sc.next();
                        System.out.println("dime el apellido");
                        ape = sc.next();
                        System.out.println("dime la edad");
                        edad2 = sc.nextInt();

                        arrayPacientes[tamaño_num] = new Paciente(nom, ape, edad2, tamaño_num);

                        FileWriter filewriter = new FileWriter(pacientes, true);//TRUE TE MANTINE LO QUE HYA DENTRO  Y FALSE TE BORRA EL ARCHIVO PARA ESCRIBIR 
                        BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
                        String nuevo_paciente = tamaño_num + " " + nom + " " + ape + " " + edad2 + " ";

                        bufferedWriter.write(nuevo_paciente + "\n");
                        bufferedWriter.close();

                    } catch (InputMismatchException e4) {
                        System.out.println(" ERROR HAS INTRODUCIDO UN STRING EN VEZ DE UN INT");

                    } catch (IOException e) {
                        System.out.println(e);
                    }

                    break;

                case 2: //ver pacientes

                    File inventario = new File("pacientes.txt");
                    try {
                        FileReader filereader2 = new FileReader(inventario);
                        BufferedReader bufferedreader2 = new BufferedReader(filereader2);
                        boolean salir2 = false;

                        String aux = bufferedreader2.readLine();

                        while (aux != null) {

                            String[] division = aux.split(" ");
                            System.out.println("ID: " + division[0] + " Nombre: " + division[1] + " apelido: " + division[2] + " edad: " + division[3]);
                            aux = bufferedreader2.readLine();

                        }
                        bufferedreader2.close();

                    } catch (IOException e2) {
                        System.out.println(e2);
                    }

                    break;

                case 3://sondaje
                    String texto;
                    String total;
                    File sondaje = new File("sondaje.txt");
                    FileReader filereader_sondaje = new FileReader(sondaje);
                    BufferedReader bufferedreader_sondaje = new BufferedReader(filereader_sondaje);

                    try {
                        texto = bufferedreader_sondaje.readLine();
                        String arrayLinea[] = texto.split(" ");
                        System.out.println("Han sangrado los pacientes:");
                        for (int i = 0; i < arrayLinea.length; i++) {
                            if (arrayLinea[i].contains("+")) {
                                total = arrayLinea[i].substring(1);

                                System.out.println(total);

                            }

                        }
                    } catch (IOException e5) {
                        System.out.println(e5);
                    }

                    break;

                case 4://salir
                    salir = true;
                    System.out.println("Has salido");
                    break;
                default:
                    break;

            }
        } while (!salir);

    }//main

    public static void mostrar(Paciente[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i]);

            }
        }
    }

}
