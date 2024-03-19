/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package señoranillos;

/**
 *
 * @author Medac
 */
public abstract class Jugador {
    //atributo 

    protected int vida;
    protected int ataque;
    boolean vivo;
    int size = 0;

    protected Carta[] cartas;

    //  constructor
    public Jugador() {
        vivo = true;
        cartas = new Carta[10];

    }

    //metodos
    public int getAtaque() {
        return ataque;
    }

    public int getVida() {
        return vida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public void robarCarta(Carta carta) {

        cartas[size] = carta;
        size++;

    }

    public void verCarta() {
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i] != null) {
                System.out.println("posicion=" + i + "." + cartas[i]);
            }
        }
    }

    public void usarCarta(int elegida) {
        vida = vida + cartas[elegida].getVida();
        ataque = ataque + cartas[elegida].getAtaque();
        cartas[elegida]=null;

    }

    @Override
    public String toString() {
        return " vida " + vida + " ataque " + ataque;
    }

}
