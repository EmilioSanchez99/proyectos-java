/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map.ejercicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 *
 * @author Medac
 */
public class MapEjercicios {

    static double sumaTotal3 = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<String, Double> mapa = new HashMap<>();
        mapa.put("Emilio", 6.0);
        mapa.put("Sergio", 9.0);
        mapa.put("Ivan", 8.0);
        mapa.put("Alvaro", 5.0);
        mapa.put("Monica", 2.0);

        System.out.println("con for each normal");
        double sumaTotal = 0;
        for (double suma : mapa.values()) {
            sumaTotal = sumaTotal + suma;
        }
        double media = sumaTotal / mapa.size();
        System.out.println("suma total:" + sumaTotal);
        System.out.println("media:" + media);
        System.out.println("---------");
        System.out.println("con iterator");
        double sumaTotal2 = 0;

        Iterator<String> it = mapa.keySet().iterator();
        while (it.hasNext()) {
            String clave = it.next();
            double valor = mapa.get(clave);
            sumaTotal2 += valor;
        }
        System.out.println(sumaTotal2);
        System.out.println(sumaTotal2 / mapa.size());

        System.out.println("----------");
        System.out.println("con foreach");
        mapa.forEach((clave, valor) -> {
            sumaTotal3 += valor;
        });
        System.out.println(sumaTotal3);
        System.out.println("---------------");

        HashMap<Double, String> inverso = new HashMap<>();

        Iterator<String> it2 = mapa.keySet().iterator();
        while (it2.hasNext()) {
            String nombre = it2.next();
            double valor = mapa.get(nombre);
            inverso.put(valor, nombre);
        }
        System.out.println(mapa);
        System.out.println(inverso);

        TreeMap<String, Integer> mapa3 = new TreeMap<>();
        mapa3.put("juan", 18);
        mapa3.put("elena", 20);
        mapa3.put("zarko", 50);
        mapa3.put("alvaro", 18);
        System.out.println(mapa3);

        HashMap<String, Integer> mapa4 = new HashMap<>();
        mapa4.put("juan", 18);
        mapa4.put("elena", 20);
        mapa4.put("zarko", 50);
        mapa4.put("alvaro", 18);
        System.out.println(mapa4);

        LinkedHashMap<String, Integer> mapa5 = new LinkedHashMap<>();

        mapa5.put("zarko", 50);
        mapa5.put("juan", 18);
        mapa5.put("elena", 20);
        mapa5.put("alvaro", 18);
        System.out.println(mapa5);

    }

}
