/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1000km;

import java.util.LinkedList;

/**
 *
 * @author Medac
 */
public class Jugador {
    
  LinkedList<Carta>cartas;
  int KmTotales;

    public Jugador(LinkedList<Carta> cartas, int KmTotales) {
        this.cartas = cartas;
        this.KmTotales = KmTotales;
    }

    public LinkedList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(LinkedList<Carta> cartas) {
        this.cartas = cartas;
    }

    public int getKmTotales() {
        return KmTotales;
    }

    public void setKmTotales(int KmTotales) {
        this.KmTotales = KmTotales;
    }

    @Override
    public String toString() {
        return "cartas=" + cartas + ", KmTotales=" + KmTotales + '}';
    }
    

}
