/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palabras.repetidas;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Medac
 */
public class PalabrasRepetidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        meter una frase, leer ese string y recortarlo con split, meterlo en arraylist y
        mostrar las palabras que se duplican, y las que no meterlas en un set
        */
        String frase="Esta clase es es mejor mejor que la clase a clase clase";
        String [] array=frase.split(" ");
        List<String> arrayFrase = Arrays.asList(array);
        LinkedList <String> lista=new LinkedList<>();
        lista.addAll(arrayFrase);
        
        System.out.println(lista);
        //aqui se meten las que no estan repetidas
        TreeSet<String>norepetidas=new TreeSet<String>(lista);
        
        TreeSet<String>repetidas=new TreeSet<String>();
        //aqui se meten las que si estan repetidas
        for(String o :lista){
            if (lista.indexOf(o)!=lista.lastIndexOf(o)) {
                repetidas.add(o);
                System.out.println("***"+lista.indexOf(o));
                 System.out.println("***"+lista.lastIndexOf(o));
            }
        }
        System.out.println(norepetidas);
        System.out.println(repetidas);
        
        
        
    }
    
    
    
}
