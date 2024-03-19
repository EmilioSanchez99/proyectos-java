/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author Medac
 */
public class Set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //en los SET da igual el orden y no se pueden tener duplicado

        HashSet<Integer> numeros = new HashSet<>(); //ordena por tamaño de memoria
        numeros.add(5);
        numeros.add(3);
        numeros.add(9);
        numeros.add(10);
        numeros.add(6);

        System.out.println(numeros);
        HashSet<String> nombre = new HashSet<>();
        nombre.add("juan");
        nombre.add("perez");
        System.out.println(nombre);

        Iterator<String> it = nombre.iterator();
        while (it.hasNext()) {
            System.out.println("mombre es" + it.next());
        }
        String prueba = "pepe";
        
        HashSet<Integer> numeros2=new HashSet<>();
        
        numeros2.add(3);
        numeros2.add(5);
        numeros2.add(7);
        int cont=0;
        for (int i = 0; i <= 10; i++) {
            if (numeros2.contains(i)) {
                cont++;                
            } 
        }
        
        System.out.println(cont);
        
        HashSet<Persona> personas=new HashSet<>();
        System.out.println("--------");
        personas.add(new Persona(23,"emilio","978675j"));
        personas.add(new Persona(30,"sergio","56789s"));
        System.out.println(personas);
        
//        personas.add(new Persona(23,"jose","3438478s"));
//        personas.add(new Persona(25,"Juan","54675778s"));
//        personas.add(new Persona(24,"Laura","94779356f"));
//        Persona p1=new Persona(30,"maria","6787980d");
//        personas.add(p1);
//        System.out.println(personas);
//        Persona p2=new Persona(30,"maria","6787980d");
//        personas.add(p2);
//        System.out.println(personas);
//        System.out.println(personas.contains(p1));

        Persona p1=new Persona(23,"juan","777");
        Persona p2=new Persona(23,"juan","777");
        personas.add(p1);
        personas.add(p2);
        System.out.println(personas);
        
            
                                       
                                                                
         TreeSet <String> nombre2= new TreeSet<>(); //ordena por criterio natural      
         nombre2.add("pepe");
         nombre2.add("jhonny");
         nombre2.add("benito");
         nombre2.add("aitortilla");
         System.out.println(nombre2);
                                             
         TreeSet<Persona>personas2=new TreeSet<>();
         personas2.add(new Persona(23,"juan","877689e"));
         personas2.add(new Persona(21,"pepe","978687e"));
         
         System.out.println(personas2);
         
         
         
         LinkedHashSet <String> nombres3=new LinkedHashSet<>(); //ordenan segun insercion
         nombres3.add("jose");
         nombres3.add("pepe");
         nombres3.add("elena");
         System.out.println(nombres3);
         

    }
}

