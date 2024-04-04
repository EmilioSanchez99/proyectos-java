/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoslistasmapas;

import java.util.*;

/**
 *
 * @author Medac
 */
public class MetodosListasMapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> arraylist = new ArrayList<>();
        ArrayList<Integer> arraylist2 = new ArrayList<>();
        ArrayList<Integer> arraylist3 = new ArrayList<>();

        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(360);
        linkedlist.add(304);
        linkedlist.add(3);
        linkedlist.add(320);
        
        System.out.println(linkedlist.peekFirst());
        
        arraylist.add(1);
        arraylist.add(1, 8);

        arraylist2.add(4);
        arraylist2.add(1, 10);
        arraylist.addAll(arraylist2); //añade un arraylist o lo que sea dentro de un arraylist
        arraylist.addAll(linkedlist);
        
        arraylist3=(ArrayList<Integer>) arraylist.clone();//para clonar un arraylist
        System.out.println(arraylist3);
        
     
    
        // metodo removeIf
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Eva");

        // Mostrar el ArrayList antes de eliminar elementos
        System.out.println("ArrayList antes de eliminar elementos: " + nombres);

        // Eliminar nombres con longitud menor o igual a 4 caracteres
        nombres.removeIf(paco -> paco.length() <= 4);

        // Mostrar el ArrayList después de eliminar elementos
        System.out.println("ArrayList después de eliminar elementos: " + nombres);
    
        
        
        System.out.println(arraylist);
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
      

    }

}
