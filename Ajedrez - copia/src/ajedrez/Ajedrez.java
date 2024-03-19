/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ajedrez;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ajedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ficha[][] tablero = new Ficha[8][8];

        Rellenar(tablero);
        Mostrar(tablero);
        int elegidax = 0;
        int elegiday = 0;

        System.out.println("que posicion quieres mover?");

        //controlar posiciones correctas
        do {
            System.out.println("Ingrese las coordenadas (elegidax elegiday):");
            elegidax = sc.nextInt();
            elegiday = sc.nextInt();
        } while (elegidax < 0 || elegidax >= 8 || elegiday < 0 || elegiday >= 8 || !(tablero[elegidax][elegiday].isNegras()));

        
        switch(tablero[elegidax][elegiday].getNombre()){
            case "P":
                //moverPeon(tablero);
                break;
            case "T":
                
            
        }
    }//main

    //rellenar tablero
    public static void Rellenar(Ficha tablero[][]) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                tablero[i][j] = new Ficha(true);

            }

        }
        //torres
        tablero[0][0] = new Torre(true);
        tablero[0][7] = new Torre(true);
        tablero[7][0] = new Torre(false);
        tablero[7][7] = new Torre(false);

        //peones
        for (int i = 0; i < tablero.length; i++) {
            tablero[1][i] = new Peon(true, i);
            tablero[6][i] = new Peon(false, i);

        }

        //Alfiles
        tablero[0][1] = new Alfil(true);
        tablero[0][6] = new Alfil(true);
        tablero[7][1] = new Alfil(false);
        tablero[7][6] = new Alfil(false);

        //caballos
        tablero[0][2] = new Caballo(true);
        tablero[0][5] = new Caballo(true);
        tablero[7][2] = new Caballo(false);
        tablero[7][5] = new Caballo(false);

        //Reyes
        tablero[0][4] = new Rey(true);
        tablero[7][4] = new Rey(false);

        //reinas
        tablero[0][3] = new Reina(true);
        tablero[7][3] = new Reina(false);

    }

//mostrar
    public static void Mostrar(Ficha[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

   

}
