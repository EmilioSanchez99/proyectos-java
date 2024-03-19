/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

/**
 *
 * @author Medac
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println(numeros.size());
        numeros.add(5);//añadir 
        numeros.add(3);
        numeros.add(8);
        System.out.println(numeros);

        System.out.println(numeros.size());
        numeros.add(1, 4);//añadir en posicion especifica
        System.out.println(numeros);

        numeros.set(0, 1);//sustituir en una posicion
        System.out.println(numeros);

        System.out.println(numeros.get(0));//obtenemos el valor de esa posicion

        System.out.println("------------------");

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("pepe");
        nombres.add("elena");
        nombres.remove(1);
        System.out.println(nombres);

        for (String str : nombres) {
            System.out.println(str);
        }

        System.out.println("------------------------");

        LinkedList<String> arrayLink = new LinkedList<>();
        arrayLink.add("pepe");
        arrayLink.add("Juan");
        arrayLink.add(1, "elena");
        arrayLink.remove(0);
        arrayLink.addFirst("antonio");
        arrayLink.addLast("silvia");
        System.out.println(arrayLink);

        System.out.println("-------------------");

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("juan", 23));
        personas.add((new Persona("Pepe", 20)));
        personas.add(new Persona());
        personas.add(new Persona("elena", 25));

        for (Persona str : personas) {
            if (str.getNombre() == null) {
                str.setEdad(24);
                str.setNombre("emilio");
            }
        }
        System.out.println(personas);
        Collections.sort(personas);
        System.out.println(personas);

//         for (Persona str:personas) {
//            if (str.getNombre()==null) {
//                personas.add((personas.indexOf(str)), new Persona("jose",30));
//                
//            }
//        }
//        System.out.println(personas);
        System.out.println("------------------");

        ArrayList<Integer> num = new ArrayList<>();
        num.add(7);
        num.add(2);
        num.add(3);

        Collections.sort(num); //ordenar
        System.out.println(num);

        Collections.shuffle(num); //desordenar
        System.out.println(num);

    }

}
