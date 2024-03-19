
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploarraylist;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Paciente implements Comparable<Paciente> {

    Scanner sc = new Scanner(System.in);
    static int cont = 0;
    int id;
    String nombre;
    int edad;

    public Paciente() {

        System.out.println("introduce nombre");
        nombre = sc.next();
        System.out.println("introduce edad");
        edad = sc.nextInt();
        cont++;
        id=cont;

    }

    @Override
    public int compareTo(Paciente o) {
        return (edad - o.edad);
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

}
