/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public abstract class Persona {

    Scanner sc = new Scanner(System.in);

    //atributos
    protected String nombre;
    protected double[] notas;
    protected boolean suspenso = false;

    //constructores 
    public Persona(String nombre) {
        this.nombre = nombre;
        notas = new double[6];
    }

    //metodos
    public void insertarNotas() {
        String[] nombre = {"prog", "sis", "bbdd", "fol", "entorn", "LLMM"};

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Cual es la nota de" + nombre[i]);
            notas[i] = sc.nextDouble();

        }
    }

    public void estaAprobado() {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                suspenso = true;

            }

        }

    }

    @Override
    public String toString() {
        String respuesta = "";
        for (int i = 0; i < notas.length; i++) {
            respuesta = respuesta + notas[i] + "||";
        }
        return nombre + respuesta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSuspenso() {
        return suspenso;
    }

}
