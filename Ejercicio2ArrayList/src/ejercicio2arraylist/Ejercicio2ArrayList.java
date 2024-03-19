/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2arraylist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author Medac
 */
public class Ejercicio2ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("texto1");
        String texto1 = sc.next();
        ArrayList<Character> arrayList1 = new ArrayList<>();

        for (int i = 0; i < texto1.length(); i++) {
            arrayList1.add(texto1.charAt(i));
        }
        System.out.println(arrayList1);

        System.out.println("texto2");
        String texto2 = sc.next();
        ArrayList<Character> arrayList2 = new ArrayList<>();
        for (int i = 0; i < texto2.length(); i++) {
            arrayList2.add(texto2.charAt(i));
        }
        System.out.println(arrayList2);

        ArrayList<Character> arrayList3 = new ArrayList<>();

        System.out.println("frase concatenada");
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);

//        for(char letra: texto1.toCharArray()){
//            arrayList1.add(letra);
//        }
//        System.out.println(arrayList1);
    }

}
