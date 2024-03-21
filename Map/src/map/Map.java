/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 *
 * @author Medac
 */
public class Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<Integer, String> numeros = new HashMap<>(); //ordena de forma natural, en este caso de numeros de menor a mayor
        numeros.put(1, "rojo");
        numeros.put(3, "Azul");
        numeros.put(2, "verde");
        System.out.println(numeros.put(1, "amarillo"));//aqui el PUT hace de funcion, machaca el nuevo valor y devuelve el antoguo
        System.out.println("HashSet");
        System.out.println(numeros);
        String antiguo = numeros.put(2, "rosa");/*
        AQUI GUARDO LO QUE ME DEVUELVE EL PUT EN UNA VARIABLE
         */
        System.out.println(antiguo);
        numeros.remove(1);
        System.out.println(numeros);
        System.out.println("-------------------");

        //METODOS
        /*
        .SIZE
        .ISEMPTY
        .PUT
        .GET
        .CLEAR
        .CONTAINSKEY
        .CONTAINSVALUE
        .VALUES
        .REMOVE
         */
        //MANERAS DE RECORRER UN DICCIONARIO
        //1
        HashMap<Integer, String> map = new HashMap<>(); //ordena por tamaño de memoria
        map.put(1, "almeria");
        map.put(3, "cadiz");
        map.put(2, "huelva");

        for (HashMap.Entry<Integer, String> ciudades : map.entrySet()) {
            int clave = ciudades.getKey();
            String valor = ciudades.getValue();
            System.out.println(ciudades);
        }

        //2
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int clave = it.next();
            String valor = map.get(clave);
            System.out.println(clave + valor);
            //System.out.println(it);
        }

        //3
        for (String ciudad : map.values()) {
            System.out.println(ciudad);
        }
        
        //4
        map.forEach((clave, valor) -> {
            System.out.println("clave" + clave + "valor" + valor);});
        

        System.out.println("--------------");

        TreeMap<Integer, String> numeros2 = new TreeMap<>();//ordena de menor a mayor
        numeros2.put(1, "rojo");
        numeros2.put(3, "Azul");
        numeros2.put(2, "verde");
        System.out.println("TreeMap");
        System.out.println(numeros2);

        numeros2.remove(1);
        System.out.println(numeros2);

        System.out.println("-----------------");

        LinkedHashMap<Integer, String> numeros3 = new LinkedHashMap<>();//ordena por orden de insercion

        numeros3.put(1, "rojo");
        numeros3.put(3, "Azul");
        numeros3.put(2, "verde");
        System.out.println("LinkedHashMap");
        System.out.println(numeros3);

        numeros3.remove(1);
        System.out.println(numeros3);

    }

}
