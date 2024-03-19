/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motel;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class Motel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        // 1 inserta huesped 2 ver numero de habitaciones libres 3 calcula precio por nombre del huesped 50€
        //  4 elimina huesped por nombre 5 busca huesped por nombre 6 buescar huesped por nº habitacion 7 salir 
        Huesped[] array = new Huesped[20];

        do {
            System.out.println("1.Insertar Huesped 2.Ver nº habitaciones libres 3. ver precio por huesped 4.Eliminar huesped 5.buscar huesped 6. buscar huesped por n1 habitacion 7. salir");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1: //insertar huesped

                    if (!estaLLeno(array)) {
                        for (int i = 0; i < array.length; i++) {

                            if (array[i] == null) {

                                array[i] = new Huesped();

                                i = array.length;

                            }

                        }

                    } else {
                        System.out.println("esta lleno");
                    }

                    break;

                case 2: //ver nº hab

                    int contHabitaciones = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] == null) {
                            contHabitaciones++;

                        }

                    }
                    System.out.println(contHabitaciones);
                    break;

                /* case 3: //ver precio buscado por nombre
                   System.out.println("Introduce nombre a buscar");
                    String buscar = sc.next();
                    

                    for (int i = 0; i < array.length; i++) {
                        if (buscar.equals(array[i].getNombre()) && (array[i] != null)) {
                            
                            System.out.println("el precio de " + array[i].getNombre() + " es " + array[i].getPrecio());
                            break;
                        }
                        else if( buscar.equals(array[i].getNombre())&&(array[i]!=null)){
                            
                            System.out.println("no se ha encontrado");
                            
                        }
                        

                    }
                    if (encontrado) {
                        System.out.println("no se encuentra");
                    }*/
                case 3: //ver precio por nombre de huesped

                    System.out.println("Introduce nombre a buscar");
                    String buscar = sc.next();
                    boolean encontrado = false;

                    for (int i = 0; i < array.length; i++) {
                        if (array[i] != null && buscar.equals(array[i].getNombre())) {
                            System.out.println("El precio de " + array[i].getNombre() + " es " + array[i].getPrecio());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se ha encontrado");
                    }

                    break;

                case 4: //eliminar huesped
                    int eliminar = 0;
                    if (eliminar < 21 && eliminar >= 0) {
                        System.out.println("que huesped quieres eliminar");
                        eliminar = sc.nextInt();
                        array[eliminar] = null;

                    }
                    break;

                case 5:
                    System.out.println("introduce el nombre a buscar");
                    String buscarNombre = sc.next();
                    int posicion = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (buscarNombre.equals(array[i])) {
                            posicion = i;

                        }

                    }
                    System.out.println("esta en la habitacion " + posicion);
                    break;

                case 6: //buscar por num habitacion
                    int habitacion;

                    System.out.println("introduce la habitacion a buscar");
                    habitacion = sc.nextInt();

                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[habitacion].getNombre() + " se aloja en esta habotacion");
                        i = array.length;
                    }

                    break;
                case 7:
                    opcion = 7;
                    System.out.println("has salido");
            }// switch

        }//do 
        while (opcion != 7);

        //mostrar el array
        /*for (int i = 0; i < array.length; i++) {
                            if (array[i]!=null) {
                                System.out.print(array[i] +" ");
                            }
                            
                            
                        }*/
    } //main

    // comprobar si esta lleno
    public static boolean estaLLeno(Huesped[] array) {
        boolean lleno = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                lleno = false;
            }

        }

        return lleno;
    }

}//fin
