/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domino2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Domino2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Ficha> lista = new LinkedList<>();
        crear(lista);
        // System.out.println(lista);

        LinkedList<Ficha> tablero = new LinkedList<>();

        //crear jugadores y sus fichas
        Jugador j1 = new Jugador("emilio");
        LinkedList<Ficha> listaJ1 = new LinkedList<>();

        Jugador j2 = new Jugador("Sergio");
        LinkedList<Ficha> listaJ2 = new LinkedList<>();
 
        repartir(lista, listaJ1, listaJ2);

        System.out.println("fichas de Emilio" + listaJ1);
        System.out.println("fichas de Sergio" + listaJ2);
        System.out.println("---------------");

        //empieza el juego con la funcion y los primeros dos movimientos
        try {
            int comprobado = comprobar(listaJ1, listaJ2, tablero);
            boolean vacio=false;

            boolean puesta = false;
            while (!puesta) { //en este bucle forzar a poner una ficha valida, EN CASO DE QUE NO, ROBA UNA
                if (comprobado == 0) {
                    System.out.println("es el turno de Sergio, \n elige ficha, si no tienes, pon cualquiera y robaras una");
                    System.out.println(listaJ2);
                    int elegido = sc.nextInt();
                    if (tablero.get(tablero.size() - 1).getB() == listaJ2.get(elegido).getA()) {

                        tablero.add(listaJ2.get(elegido));
                        listaJ2.remove(elegido);
                        puesta = true;
                    } else if (tablero.get(0).getA() == listaJ2.get(elegido).getB()) {

                        tablero.add(0, listaJ2.get(elegido));
                        listaJ2.remove(elegido);
                        System.out.println(tablero);
                        puesta = true;
                    } else if (tablero.get(tablero.size() - 1).getB() == listaJ2.get(elegido).getB()) {//dar vuelta

                        tablero.add(darVuelta(listaJ2.get(elegido)));//funcion fuera del main
                        listaJ2.remove(elegido);
                        System.out.println(tablero);
                        puesta = true;
                    } else if (tablero.get(0).getA() == listaJ2.get(elegido).getA()) {//dar vuelta

                        tablero.add(darVuelta(listaJ2.get(elegido)));//funcion fuera del main
                        listaJ2.remove(elegido);
                        System.out.println(tablero);
                        puesta = true;
                    } else {
                        System.out.println("no se puede poner esa ficha");
                        if (!lista.isEmpty()) {
                            listaJ2.add(lista.pollFirst());
                            System.out.println(tablero);
                        } else {
                            System.out.println("no hay mas fichas");
                            vacio=true;
                        }

                    }

                } else {
                    System.out.println("es el turno de Emilio, \n elige ficha, si no tienes, pon cualquiera y robaras una");
                    System.out.println(listaJ1);
                    int elegido = sc.nextInt();
                    if (tablero.get(tablero.size() - 1).getB() == listaJ1.get(elegido).getA()) {

                        tablero.add(listaJ1.get(elegido));
                        listaJ1.remove(elegido);
                        puesta = true;
                    } else if (tablero.get(0).getA() == listaJ1.get(elegido).getB()) {

                        tablero.add(0, listaJ1.get(elegido));
                        listaJ1.remove(elegido);
                        System.out.println(tablero);
                        puesta = true;
                    } else if (tablero.get(tablero.size() - 1).getB() == listaJ1.get(elegido).getB()) {//dar vuelta

                        tablero.add(darVuelta(listaJ1.get(elegido)));//funcion fuera del main
                        listaJ1.remove(elegido);
                        System.out.println(tablero);
                        puesta = true;
                    } else if (tablero.get(0).getA() == listaJ1.get(elegido).getA()) {//dar vuelta

                        tablero.add(darVuelta(listaJ1.get(elegido)));//funcion fuera del main
                        listaJ1.remove(elegido);
                        System.out.println(tablero);
                        puesta = true;
                    } else {
                        System.out.println("no se puede poner esa ficha");
                        if (!lista.isEmpty()) {
                            listaJ1.add(lista.pollFirst());
                            System.out.println(tablero);
                        } else {
                            System.out.println("no hay mas fichas");
                            vacio=true;
                        }
                    }
                }
            }
            

            System.out.println(tablero);

            //hasta aqui son los dos primeros movimientos, aqui empieza ya la jugabilidad por turnos
            int opcion = 0;//do while

            do {
                //JUEGA EMILIO
                if (comprobado == 0) {//aqui se controla que juegue el que le toca mediante la fucion comprobar para ver quien ha empezado primero
                    //asi me aseguro de que se lleve el orden correcto, y lo voy cambiando en los if else para llevar el orden
                    System.out.println("fichas de Emilio" + listaJ1);
                    System.out.println("fichas de Sergio" + listaJ2);

                    System.out.println("turno de Emilio");
                    System.out.println("que quieres hacer: 1. poner ficha 2. robar ficha. 3.salir");

                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println(" elige ficha");
                            System.out.println(listaJ1);
                            int elegido2 = sc.nextInt();
                            if (tablero.get(tablero.size() - 1).getB() == listaJ1.get(elegido2).getA()) {

                                tablero.add(listaJ1.get(elegido2));
                                listaJ1.remove(elegido2);
                                comprobado = 1;
                            } else if (tablero.get(0).getA() == listaJ1.get(elegido2).getB()) {

                                tablero.add(0, listaJ1.get(elegido2));
                                listaJ1.remove(elegido2);
                                comprobado = 1;

                            } else if (tablero.get(tablero.size() - 1).getB() == listaJ1.get(elegido2).getB()) {//dar vuelta

                                tablero.add(darVuelta(listaJ1.get(elegido2)));//funcion fuera del main
                                listaJ1.remove(elegido2);
                                System.out.println(tablero);
                                comprobado = 1;
                            } else if (tablero.get(0).getA() == listaJ1.get(elegido2).getA()) {//dar vuelta

                                tablero.add(darVuelta(listaJ1.get(elegido2)));//funcion fuera del main
                                listaJ1.remove(elegido2);
                                System.out.println(tablero);
                                comprobado = 1;
                            } else {
                                System.out.println("no se puede poner esa ficha");
                                
                            }

                            System.out.println(tablero);

                            break;
                        case 2: //robar
                            if (!lista.isEmpty()) {
                                listaJ1.add(lista.pollFirst());
                                System.out.println(tablero);
                            } else {
                                System.out.println("no hay mas fichas");
                                vacio=true;
                            }

                            break;

                        case 3:
                            System.out.println("has salido");
                            break;

                        default:
                            System.out.println("velve a introducir numero valido");
                            break;

                    }

                } else { //JUEGA SERGIO
                    System.out.println("fichas de Emilio" + listaJ1);
                    System.out.println("fichas de Sergio" + listaJ2);
                    System.out.println("turno de Sergio");
                    System.out.println("que quieres hacer: 1. poner ficha 2. robar ficha.  3.salir");

                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println(" elige ficha");
                            System.out.println(listaJ2);
                            int elegido3 = sc.nextInt();
                            if (tablero.get(tablero.size() - 1).getB() == listaJ2.get(elegido3).getA()) {

                                tablero.add(listaJ2.get(elegido3));
                                listaJ2.remove(elegido3);
                                comprobado = 0;
                            } else if (tablero.get(0).getA() == listaJ2.get(elegido3).getB()) {

                                tablero.add(0, listaJ2.get(elegido3));
                                listaJ2.remove(elegido3);

                                comprobado = 0;
                            } else if (tablero.get(tablero.size() - 1).getB() == listaJ2.get(elegido3).getB()) {//dar vuelta

                                tablero.add(darVuelta(listaJ2.get(elegido3)));//funcion fuera del main
                                listaJ2.remove(elegido3);

                                comprobado = 0;
                            } else if (tablero.get(0).getA() == listaJ2.get(elegido3).getA()) {//dar vuelta

                                tablero.add(darVuelta(listaJ2.get(elegido3)));//funcion fuera del main
                                listaJ2.remove(elegido3);

                                comprobado = 0;
                            } else {
                                System.out.println("no se puede poner esa ficha");
                                
                            }

                            System.out.println(tablero);

                            break;
                        case 2: //robar
                            if (!lista.isEmpty()) {
                                listaJ2.add(lista.pollFirst());
                                System.out.println(tablero);
                            } else {
                                System.out.println("no hay mas fichas");
                                vacio=true;
                            }

                            break;

                        case 3:
                            System.out.println("has salido");

                            break;

                        default:
                            System.out.println("velve a introducir numero valido");
                            break;

                    }
                }
                

                if (vacio) {//comprobar en caso de que la lista de robar se acabe, ver quien gana mediante el peso
                    Collections.sort(listaJ1);
                    Collections.sort(listaJ2);
                    if (listaJ1.getLast().getPeso() > listaJ2.getLast().getPeso()) {
                        System.out.println("Ha ganado Emilio");
                        

                    } else {
                        System.out.println("ha ganado Sergio");
                        
                    }
                    opcion=3;

                }

            } while (opcion != 3 && (!listaJ1.isEmpty() || !listaJ2.isEmpty()));//aqui se sale si alguno se queda sin fichas y gana

        } catch (InputMismatchException e) {
            System.out.println("valor introducido incorrecto empanao");

        } catch (IndexOutOfBoundsException e2) {
            System.out.println("te has salido del array pringao");
        }

    }//main

   

    public static void crear(LinkedList<Ficha> lista) {

        for (int i = 0; i < 7; i++) {

            for (int j = 0; j <= i; j++) {

                lista.add(new Ficha(i, j));

            }

        }

    }

    public static void repartir(LinkedList<Ficha> lista, LinkedList<Ficha> listaJ1, LinkedList<Ficha> listaJ2) {
        Collections.shuffle(lista);

        for (int i = 0; i < 6; i++) {
            listaJ1.add(lista.pollFirst());
            listaJ2.add(lista.pollFirst());

        }

    }

    public static int comprobar(LinkedList<Ficha> listaJ1, LinkedList<Ficha> listaJ2, LinkedList<Ficha> tablero) {

        Collections.sort(listaJ1);
        Collections.sort(listaJ2);
        if (listaJ1.getLast().getPeso() > listaJ2.getLast().getPeso()) {
            System.out.println("empieza Emilio");
            System.out.println(listaJ1);
            tablero.add(listaJ1.pollLast());
            System.out.println("---tablero-----");
            System.out.println(tablero);
            System.out.println("---------------");
            return 0;
        } else {
            System.out.println("empieza Sergio");
            System.out.println(listaJ2);
            tablero.add(listaJ2.pollLast());
            System.out.println("---tablero-----");
            System.out.println(tablero);
            System.out.println("---------------");
            return 1;

        }

    }

    private static Ficha darVuelta(Ficha ficha) {

        int aux = ficha.getA();
        ficha.setA(ficha.getB());
        ficha.setB(aux);
        return ficha;
    }

}
