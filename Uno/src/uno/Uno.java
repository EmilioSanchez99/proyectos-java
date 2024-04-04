/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uno;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Carta> cartas = new LinkedList();      
        rellenar(cartas);
        Collections.shuffle(cartas);
        LinkedList<Carta> J1 = new LinkedList<>();
        LinkedList<Carta> J2 = new LinkedList<>();
        LinkedList<Carta> mesa = new LinkedList<>();
        repartir(cartas,J1,J2);
        
        mesa.add(cartas.pollFirst());
        Collections.sort(cartas);
        mostrar(cartas);
        do {
            //jugador 1
            mostrar(J1);
            System.out.println("1.robar 2.jugar la carta");
            int resp = sc.nextInt();

            switch (resp) {
                case 1:
                    J1.add(cartas.pollFirst());
                    break;
                case 2:
                    System.out.println("que carta quieres usar");
                    if (J1.get(resp).getColor().equalsIgnoreCase(mesa.getLast().getColor())||J1.get(resp).getNumero()==mesa.getLast().getNumero()) {
                        mesa.add(J1.get(resp));
                        J1.remove(resp);
                    }
                    else{
                        J1.add(cartas.pollFirst());
                    }
                    break;
                default:
                    break;
            }
        } while (!J1.isEmpty()||!J2.isEmpty());
    }//main

    public static void rellenar(LinkedList<Carta> cartas) {
        for (int i = 0; i < 10; i++) {
            cartas.add(new Carta("rojo", i));
            cartas.add(new Carta("amarillo", i));
            cartas.add(new Carta("azul", i));
            cartas.add(new Carta("verde", i));

        }
    }

    public static void repartir(LinkedList<Carta> cartas, LinkedList<Carta> J1, LinkedList<Carta> J2) {
        for (int i = 0; i < 7; i++) {
            J1.add(cartas.pollFirst());
            J2.add(cartas.pollFirst());
        }
    }

    private static void mostrar(LinkedList<Carta> J) {
        for (int i = 0; i < J.size(); i++) {
            System.out.println(i+"."+J.get(i));
        }

    }

}
