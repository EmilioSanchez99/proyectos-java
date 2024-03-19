/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Domino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ME HE QUEDADO EN QUE ME DA ERROR AL SELECCIONAR LA FICHA DEL J2 POR EL TAMAÑO DEL ARRAY, 
        //ADEMAS TENGO QUE CONTROLAR PARA AL PONER UNA FICHA, DARLE LA VUELTA SI ES NECESARIO
        //me coge siempre la misma ficha
        
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        ArrayList<Ficha> tablero = new ArrayList<>();

        //crear fichas y meterlas en ArrayList
        ArrayList<Ficha> lista = new ArrayList<>();
        crear(lista);
        System.out.println(lista);

        //crear jugadores y sus fichas
        Jugador j1 = new Jugador("emilio");
        ArrayList<Ficha> listaJ1 = new ArrayList<>();

        Jugador j2 = new Jugador("Victor");
        ArrayList<Ficha> listaJ2 = new ArrayList<>();

        repartir(lista, listaJ1, listaJ2);

        do {

            //jugador 1
            System.out.println("fichas de Emilio" + listaJ1);
            System.out.println("fichas de Victor" + listaJ2);
            System.out.println("1 poner ficha 2.coger ficha. 3 salir");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    boolean primera = true;
                    System.out.println("elige que ficha poner J1");
                    int elegido = sc.nextInt();
                    if (tablero.isEmpty()) {
                        tablero.add(listaJ1.get(elegido));
                        listaJ1.remove(elegido);
                        System.out.println(tablero);
                    } else {
                        if (tablero.get(tablero.size()).getB() == listaJ1.get(elegido).getA()) {
                            tablero.add(listaJ1.get(elegido));
                            listaJ1.remove(elegido);
                            System.out.println(tablero);
                        } else if (tablero.get(0).getA() == listaJ1.get(elegido).getB()) {
                            tablero.add(0, listaJ1.get(elegido));
                            listaJ1.remove(elegido);
                            System.out.println(tablero);
                        }
                        else {
                            System.out.println("no se puede");
                        }

                    }

                    break;
                case 2:
                    int rand = (int) (Math.random() * 29);
                    listaJ1.add(lista.get(rand));
                    break;
                case 3:
                    salir=true;
                    break;
                default:
                    System.out.println("incorrecto");
                    break;

            }

            //jugador 2
            System.out.println("fichas de Emilio" + listaJ1);
            System.out.println("fichas de Victor" + listaJ2);
            System.out.println("1 poner ficha 2.coger ficha. 3 salir");

            int opcion2 = sc.nextInt();
            switch (opcion2) {
                case 1:
                    boolean primera = true;
                    System.out.println("elige que ficha poner J1");
                    int elegido = sc.nextInt();
                    if (tablero.isEmpty()) {
                        tablero.add(listaJ2.get(elegido));
                        listaJ2.remove(elegido);
                        System.out.println(tablero);
                    } else {
                        if (tablero.get(tablero.size()).getB() == listaJ2.get(elegido).getA()) {
                            tablero.add(listaJ2.get(elegido));
                            listaJ2.remove(elegido);
                            System.out.println(tablero);
                        } else if (tablero.get(0).getA() == listaJ2.get(elegido).getB()) {
                            tablero.add(0, listaJ2.get(elegido));
                            listaJ2.remove(elegido);
                            System.out.println(tablero);
                        }
                        else{
                            System.out.println("no se puede");
                        }

                    }

                    break;
                case 2:
                    int rand2 = (int) (Math.random() * 29);
                    listaJ2.add(lista.get(rand2));
                    break;
                case 3:
                    salir=true;
                    break;
                default:
                    System.out.println("incorrecto");
                    break;

            }

        } while (!salir);

    }

    public static void crear(ArrayList lista) {
        for (int i = 0; i <= 6; i++) {
            lista.add(new Ficha(0, i));
        }
        for (int i = 1; i <= 6; i++) {
            lista.add(new Ficha(1, i));
        }
        for (int i = 2; i <= 6; i++) {
            lista.add(new Ficha(2, i));
        }
        for (int i = 3; i <= 6; i++) {
            lista.add(new Ficha(3, i));
        }
        for (int i = 4; i <= 6; i++) {
            lista.add(new Ficha(4, i));
        }
        for (int i = 5; i <= 6; i++) {
            lista.add(new Ficha(5, i));
        }
        for (int i = 6; i <= 6; i++) {
            lista.add(new Ficha(6, i));
        }
    }

    public static void repartir(ArrayList lista, ArrayList listaJ1, ArrayList listaJ2) {
        Collections.shuffle(lista);

        for (int i = 0; i < 6; i++) {
            listaJ1.add(lista.get(i));
            
        }
        for (int i = 6; i < 12; i++) {
            listaJ2.add(lista.get(i));
        }

    }

    public static void comprobar(ArrayList tablero) {

    }

}

//pollfirst