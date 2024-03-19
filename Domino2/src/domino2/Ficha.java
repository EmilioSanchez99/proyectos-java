/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domino2;

/**
 *
 * @author Medac
 */
public class Ficha implements Comparable<Ficha> {

    int a;
    int b;
    int peso;

    public Ficha(int a, int b) {
        this.a = a;
        this.b = b;

        if (a == b) {
            peso = a + b + 100;
        } else {
            peso = a + b;
        }

    }

    public void darVuelta(Ficha ficha) {

        int aux = a;
        a = b;
        b = aux;
      

    }

    @Override
    public String toString() {
        return "[" + a + "||" + b + "]";
    }

    @Override
    public int compareTo(Ficha o) {

        return (peso - o.peso);

    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getPeso() {
        return peso;
    }

}
