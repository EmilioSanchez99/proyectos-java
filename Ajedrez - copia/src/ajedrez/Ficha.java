/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajedrez;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public   class Ficha {
    Scanner sc=new Scanner(System.in);

    //atributos
    String nombre;
    boolean negras=false;
    int posx;
    int posy;
    

    public Ficha(boolean negras) {
        nombre ="_";
        this.negras=negras;
        
    }

    //metodo
    public String getNombre() {
        return nombre;
    }

    public boolean isNegras() {
        return negras;
    }

    public void setNegras(boolean negras) {
        this.negras = negras;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



   
    @Override
    public String toString() {
        return nombre;
    }

}
