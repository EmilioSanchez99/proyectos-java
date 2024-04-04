/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Carta> mazo = new LinkedList<>();

        crearMazo(mazo);

        System.out.println(mazo.size());

        LinkedList<Carta> J1 = new LinkedList<>();
        LinkedList<Carta> J2 = new LinkedList<>();

        Collections.shuffle(mazo);
        System.out.println(mazo);
        int contJ1, contJ2;
        boolean plantadoJ1 = false, plantadoJ2 = false;

        //Jugador 1
        do {
            System.out.println(" ***TURNO J1*** \n 1.robar 2.plantarse");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    J1.add(mazo.pollFirst());
                    System.out.println(J1);

                    break;
                case 2:
                    plantadoJ1 = true;
                    System.out.println(J1);
                    break;
                default:
                    System.out.println("introduce de nuevo");
                    break;

            }
            System.out.println("*** llevas " + contar(J1) + " puntos ***");
            System.out.println("-------------------------------------");

            //Jugador 2
            System.out.println(" ***TURNO J2*** \n 1.robar 2.plantarse");
            int opcion2 = sc.nextInt();
            switch (opcion2) {
                case 1:
                    J2.add(mazo.pollFirst());
                    System.out.println(J2);

                    break;
                case 2:
                    plantadoJ2 = true;
                    System.out.println(J2);
                    break;
                default:
                    System.out.println("introduce de nuevo");
                    break;

            }
            System.out.println("*** llevas " + contar(J2) + " puntos ***");
            System.out.println("-------------------------------------");

        } while (!plantadoJ1 && !plantadoJ2);

        int diferenciaJ1, diferenciaJ2;

        diferenciaJ1 = 21 - (contar(J1));
        diferenciaJ2 = 21 - (contar(J2));

        comprobar(diferenciaJ1, diferenciaJ2);

    }//main

    private static void crearMazo(LinkedList<Carta> mazo) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 0; j < 1; j++) {
                mazo.add(new Carta(i, "picas"));
                mazo.add(new Carta(i, "corazones"));
                mazo.add(new Carta(i, "diamantes"));
                mazo.add(new Carta(i, "trebol"));
            }

        }
    }

    private static int contar(LinkedList<Carta> J1) {
        int suma = 0;
        for (int i = 0; i < J1.size(); i++) {
            suma = suma + (J1.get(i).getNumero());
        }
        return suma;
    }

    /*private static void comprobar(LinkedList<Carta> J1, LinkedList<Carta> J2){
        switch (Integer.compare(contar(J1), contar(J2))) {
            case 1:
                System.out.println("ha ganado el Jugador 1");
                break;
            case 0:
                System.out.println("empate");
                break;
            case -1:
                System.out.println("ha ganado el Jugador 2");
                break;
            

        }
    }*/
    private static void comprobar(int a, int b) {

        if (a == 0) {
            System.out.println("ha ganado el Jugador 1 IF");
        } else if (b == 0) {
            System.out.println("ha ganado el Jugador 2 IF");
        }
        switch (Integer.compare(a, b)) { //devuelve 1 si es a>b, 0 igual o -1 si a<b
            case 1:
                System.out.println("ha ganado el Jugador 2 SWITCH");
                break;
            case 0:
                System.out.println("empate SWITCH");
                break;
            case -1:
                System.out.println("ha ganado el Jugador 1 SWITCH");
                break;
        }

    }

}
