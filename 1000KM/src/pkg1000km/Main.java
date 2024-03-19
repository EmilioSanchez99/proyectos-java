/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1000km;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*empieza bien, obliga a poner un semaforo verde al principio
        si luego eliges cartas de ataque las pone bien en la mesa del otro
        --controlar poner semaforo verde cuando tengo semaforo rojo
        --controlar poner gasolina_ok y semaforo verde cuando tengo semaforo rojo
        
        */
        Scanner sc = new Scanner(System.in);

        LinkedList<Carta> cartas = new LinkedList<>();

        crearCartas(cartas);
//        System.out.println(cartas);
//        System.out.println(cartas.size());

        LinkedList<Carta> cartasJ1 = new LinkedList<>();
        LinkedList<Carta> cartasJ2 = new LinkedList<>();

        repartir(cartas, cartasJ1, cartasJ2);

        Jugador j1 = new Jugador(cartasJ1, 0);
        Jugador j2 = new Jugador(cartasJ2, 0);

//        System.out.println(cartasJ1);
//        System.out.println(cartasJ2);
        LinkedList<Carta> mesaJ1 = new LinkedList<>();
        LinkedList<Carta> mesaJ2 = new LinkedList<>();
        System.out.println("..............EMPIEZA EL JUEGO............");
        do {

            System.out.println("                    Turno de Jugador 1");
            mostrarTablero(mesaJ1, mesaJ2, j1, j2);
            System.out.println("--------------------CARTAS JUGADOR 1----------");
            System.out.println(j1.getCartas());
            System.out.println("Elige una carta");
            int elegido = sc.nextInt();
            if (j1.getCartas().get(elegido).isAtaque()) { //si la carta que queremos poner es ataque comprobamos en la mesa del J2 si
                if (comprobarVerde(mesaJ2)) {               //se le puede poner
                    mesaJ2.add(j1.getCartas().get(elegido));
                    j1.getCartas().remove(elegido);
                } else {
                    System.out.println("no se puede poner esa carta porque no tiene semaforo verde");
                    j1.getCartas().remove(elegido);
                }

            } else { //si la carta que queremos poner no es de ataque
                if (mesaJ1.isEmpty()&&j1.getCartas().get(elegido).getNombre().equalsIgnoreCase("semaforo_verde")) {
                    mesaJ1.add(j1.getCartas().get(elegido));
                    j1.getCartas().remove(elegido);
                } else if (comprobarVerde(mesaJ1)) {
                    mesaJ1.add(j1.getCartas().get(elegido));
                    j1.getCartas().remove(elegido);
                } else {
                    System.out.println("no se puede poner esa carta porque no tiene semaforo verde");
                    j1.getCartas().remove(elegido);
                }
            }

            System.out.println("                    Turno de Jugador 2");
            mostrarTablero(mesaJ1, mesaJ2, j1, j2);
            System.out.println("--------------------CARTAS JUGADOR 2--------------");
            System.out.println(j2.getCartas());
            System.out.println("Elige una carta");
            int elegido2 = sc.nextInt();
            if (j2.getCartas().get(elegido2).isAtaque()) { //si la carta que queremos poner es ataque comprobamos en la mesa del J2 si
                if (comprobarVerde(mesaJ1)) {               //se le puede poner
                    mesaJ1.add(j2.getCartas().get(elegido2));
                    j2.getCartas().remove(elegido2);
                } else {
                    System.out.println("no se puede poner esa carta porque no tiene semaforo verde");
                    j2.getCartas().remove(elegido2);
                }

            } else { //si la carta que queremos poner no es de ataque
                if (mesaJ2.isEmpty()&&j2.getCartas().get(elegido).getNombre().equalsIgnoreCase("semaforo_verde")) {
                    mesaJ2.add(j2.getCartas().get(elegido2));
                    j2.getCartas().remove(elegido2);
                } else if (comprobarVerde(mesaJ2) || mesaJ2.isEmpty()) {
                    mesaJ2.add(j2.getCartas().get(elegido2));
                    j2.getCartas().remove(elegido2);
                } else {
                    System.out.println("no se puede poner esa carta porque no tiene semaforo verde");
                    j2.getCartas().remove(elegido2);
                }
            }

            //mostrarTablero(mesaJ1,mesaJ2,j1,j2);
        } while (!j1.getCartas().isEmpty() || !j2.getCartas().isEmpty());

    }//main

    public static void mostrarTablero(LinkedList<Carta> mesaJ1, LinkedList<Carta> mesaJ2, Jugador j1, Jugador j2) {
        System.out.println("CARTAS DE LA MESA");
        System.out.print("J1" + mesaJ1);
        System.out.println("km totales: " + j1.getKmTotales());
        System.out.print("J2" + mesaJ2);
        System.out.println("km totales: " + j2.getKmTotales());
    }

    public static boolean comprobarVerde(LinkedList<Carta> mesa) {
        boolean verde = false;
        if (mesa.isEmpty()) {
            verde = false;
        } else if (mesa.getLast().getNombre().equalsIgnoreCase("Semaforo_Verde") || mesa.getLast().getDistancia() != 0) {
            verde = true;
        }

        return verde;
    }

    public static void repartir(LinkedList<Carta> cartas, LinkedList<Carta> cartasJ1, LinkedList<Carta> cartasJ2) {

        Collections.shuffle(cartas);

        for (int i = 0; i < 6; i++) {
            cartasJ1.add(cartas.pollFirst());
            cartasJ2.add(cartas.pollFirst());

        }

    }

    public static void crearCartas(LinkedList<Carta> cartas) {
        for (int i = 0; i < 8; i++) {
            cartas.add(new Carta("Semaforo_Verde", 0, false));
            cartas.add(new Carta("Semaforo_Rojo", 0, true));
            cartas.add(new Carta("Gasolina_OK", 0, false));
            cartas.add(new Carta("Sin_Gasolina", 0, true));

            if (i < 2) {
                cartas.add(new Carta("Avanza_25KM", 25, false));
                cartas.add(new Carta("Avanza_50KM", 50, false));
                cartas.add(new Carta("Avanza_75KM", 75, false));
                cartas.add(new Carta("Avanza_150KM", 150, false));
                cartas.add(new Carta("Avanza_200KM", 200, false));
            } else {
                cartas.add(new Carta("Avanza_100KM", 100, false));
            }

        }
    }
}
