/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medauto;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Medauto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] pista = new String[3][10];
        String[] cartaObjetivo = new String[3];

        //cartas objetivo
        cartaObjetivo[0] = "Camión primero y Moto segundo ";
        cartaObjetivo[1] = "Camión segundo y coche primero";
        cartaObjetivo[2] = "Camión tercero y moto primero";

        //declaramos vehiculos y los meto en un array
        Coche coche = new Coche();
        Moto moto = new Moto();
        Camion camion = new Camion();

        Vehiculo[] jugadores = {camion, moto, coche};
        
        
        rellenarPista(pista, coche, moto, camion);
        mostrar(pista);
        
        //creo el mazo y lo relleno con un metodo fuera del main
        Carta[] mazo = new Carta[10];

        rellenar(mazo);

        //EMPEZAR A JUGAR   
        System.out.println("empieza el juego");

        //aqui se eligen las carta objetivo
        for (int i = 0; i < 3; i++) {
            System.out.println("elige un numero del 1 al 3 para obtener tu objetivo, cada eleccion corresponde a: camion, moto y coche respectivamente");

            int elegido = sc.nextInt();

            switch (elegido) {
                case 1:
                    System.out.println(cartaObjetivo[0]);
                    break;
                case 2:
                    System.out.println(cartaObjetivo[1]);
                    break;
                case 3:
                    System.out.println(cartaObjetivo[2]);
                    break;
                default:
                    System.out.println("vuelve a elegir");
                    break;

            }
        }
       // System.out.println(coche); esto es para no tener que usar el .getnombre, usando el override tostring en clase vehiculo

        //aqui se empieza a coger carta y mover
        boolean ganar = false;
        do {
            for (int i = 0; i < 3; i++) {
                System.out.println(jugadores[i].getNombre() + " coge una carta");
                int rand = (int) (Math.random() * 10);
                mazo[rand].getEstado();
                System.out.println("quien quieres que mueva? 1.camion 2.moto 3.coche");
                int resp = sc.nextInt();
                switch (resp) {
                    case 1:
                        if (mazo[rand].getEstado() == 0) {
                            camion.avanzar();

                        } else {
                            camion.retroceder();
                        }
                        
                        break;

                    case 2:
                        if (mazo[rand].getEstado() == 0) {
                            moto.avanzar();

                        } else {
                            moto.retroceder();
                        }
                        break;
                    case 3:
                        if (mazo[rand].getEstado() == 0) {
                            coche.avanzar();

                        } else {
                            coche.retroceder();
                        }
                        break;
                }
                rellenarPista(pista, coche, moto, camion);
                mostrar(pista);
            }
            // aqui contemplo si llega a la casilla 9, gana.
            //hay veces que llega a la casilla 9 y gana y otras no, no me dio tiempo a ver el por qué

            if (camion.getPosy() == 9) {
                System.out.println("ha ganado" + camion.getNombre());
                ganar = true;
            } else if (moto.getPosy() == 9) {
                System.out.println("ha ganado" + moto.getNombre());
                ganar = true;
            } else if (coche.getPosy() == 9) {
                System.out.println("ha ganado" + coche.getNombre());
                ganar = true;
            }

        } while (!ganar);
        System.out.println("fin del juego");

    }//main

    //metodos
    public static void rellenar(Carta[] mazo) {
        for (int i = 0; i < mazo.length; i++) {

            if (i < 6) {
                mazo[i] = new Carta("carta" + i, 0);

            } else {
                mazo[i] = new Carta("carta" + i, 1);
            }

        }
    }

    public static void rellenarPista(String[][] a, Coche coche, Moto moto, Camion camion) {
        for (int fila = 0; fila < a.length; fila++) {
            Arrays.fill(a[fila], "_");
        }
        a[coche.getPosx()][coche.getPosy()] = coche.getNombre();
        a[moto.getPosx()][moto.getPosy()] = moto.getNombre();
        a[camion.getPosx()][camion.getPosy()] = camion.getNombre();

    }

    public static void mostrar(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
