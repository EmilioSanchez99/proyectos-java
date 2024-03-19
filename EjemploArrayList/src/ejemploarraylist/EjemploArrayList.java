/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploarraylist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author Medac
 */
public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        boolean salir = false;
        do {

            System.out.println("1. crear 2.ordenar 3. mostrar 4.salir");
            int elegido = sc.nextInt();
            switch (elegido) {

                case 1:
                    pacientes.add(new Paciente());
                    
                    break;
                case 2:
                    Collections.sort(pacientes);
                    break;
                case 3:
                    System.out.println(pacientes);
                    break;
                case 4:
                    salir = true;
                    break;

            }

        } while (!salir);

    }

}
