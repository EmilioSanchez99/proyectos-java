/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parkingrecuperacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Medac
 */
public class ParkingRecuperacion {

    static int gananciaTotal = 0;
    static double gananciaPersonal = 0;
    static String horas;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File file = new File("fichero.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            int id = 0;
            HashMap<Integer, Coche> mapa = new HashMap<>();
            String frase;
            frase = bf.readLine();
            System.out.println(frase);
            while (frase != null) {
                String[] array = frase.split(" ");
                mapa.put(id, new Coche(id, array[0], array[1]));
                frase = bf.readLine();
                id++;
            }
            bf.close();
            mostrar(mapa);
            int opcion = 0;
            do {
                File file2 = new File("fichero3.txt");
                FileWriter fw = new FileWriter(file2, false);
                BufferedWriter bw = new BufferedWriter(fw);
                mapa.forEach((clave, valor) -> {
                    try {
                        bw.write(clave + valor.getMatricula() + valor.getHoraEntrada() + valor.getHoraSalida());
                        bw.newLine();
                    } catch (IOException ex) {
                    }
                });
                bw.close();
                System.out.println("que quieres hacer 1. introducir hora de salida 2. ver precio por matricula 3. calcular ganancia del parking 4.ver mi ganancia 5.salir");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("introduce la matricula ");
                        String matricula = sc.next();
                        mapa.forEach((clave, valor) -> {
                            if (valor.getMatricula().equalsIgnoreCase(matricula)) {
                                System.out.println("introduce hora de salida");
                                int horaSalida = sc.nextInt();
                                valor.setHoraSalida(horaSalida);
                            }
                        });
                        break;
                    case 2:
                        System.out.println("introduce matricula");
                        String matricula2 = sc.next();
                        mapa.forEach((clave, valor) -> {
                            if (valor.getMatricula().equalsIgnoreCase(matricula2)) {
                                int horas = valor.getHoraSalida() - valor.getHoraEntrada();
                                int precio = horas * 10;
                                System.out.println("el precio es" + precio);
                            }
                        });
                        break;
                    case 3:
                        mapa.forEach((clave, valor) -> {
                            int horasTotales = valor.getHoraSalida() - valor.getHoraEntrada();
                            gananciaTotal = gananciaTotal + (horasTotales * 10);
                        });
                        System.out.println(gananciaTotal);
                        gananciaTotal = 0;
                        break;
                    case 4:
                        mapa.forEach((clave, valor) -> {
                            int horasTotales = valor.getHoraSalida() - valor.getHoraEntrada();

                            gananciaTotal = gananciaTotal + (horasTotales * 10);
                            gananciaPersonal = gananciaTotal * 0.10;
                        });
                        System.out.println(gananciaPersonal);
                        gananciaTotal = 0;
                        gananciaPersonal = 0;
                        break;
                    case 5:
                        System.out.println("has salido");
                        break;
                    default:
                        System.out.println("incorrecto");
                        break;
                }
            } while (opcion != 5);
        } catch (IOException e) {
        }
    }//main
    public static void mostrar(HashMap<Integer, Coche> mapa) {
        for (Coche coches : mapa.values()) {
            System.out.println(coches);
        }
    }
    public static String totalHoras(HashMap<Integer, Coche> mapa) {

        mapa.forEach((clave, valor) -> {
            horas = String.valueOf(valor.getHoraSalida());
            horas = horas + String.valueOf(valor.getHoraSalida());
        });
        return horas;
    }
}
