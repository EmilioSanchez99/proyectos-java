/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package señoranillos;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class SeñorAnillos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aragorn aragorn = new Aragorn();
        Legolas legolas = new Legolas();
        Gimli gimli = new Gimli();
        Orco orco = new Orco();
        Jugador[] jugadores = {aragorn, legolas, gimli};

        Carta[] mazo = new Carta[10];

        //rellenar mazo
        for (int i = 0; i < mazo.length; i++) {
            int vida = (int) (Math.random() * 10);
            int ataque = (int) (Math.random() * 10);
            mazo[i] = new Carta(vida, ataque);

        }

        //jugar 
        do {
            for (int i = 0; i < jugadores.length; i++) {
                int random = (int) (Math.random() * 10);
                jugadores[i].robarCarta(mazo[random]);
                jugadores[i].verCarta();

                System.out.println("que quieres hacer: 1.usar carta 2.pelear");
                int respuesta = sc.nextInt();
                switch (respuesta) {
                    case 1:

                        System.out.println("elige la carta que quieres usar");
                        int elegida = sc.nextInt();
                        jugadores[i].usarCarta(elegida);
                        break;
                    case 2:
                        orco.setVida(orco.getVida() - jugadores[i].getAtaque());
                        System.out.println("has atacado");
                        break;

                }

            }// for

            //orco
            int round = (int) (Math.random() * 3);

            jugadores[round].setVida(jugadores[round].getVida() - orco.getAtaque());

        } while (jugadores[0].getVida() > 0 || jugadores[1].getVida() > 0 || jugadores[2].getVida() > 0);
    }

}
