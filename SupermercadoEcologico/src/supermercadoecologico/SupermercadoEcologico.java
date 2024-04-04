/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercadoecologico;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class SupermercadoEcologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> catalogo = new HashMap<>();
        HashMap<String, Integer> ticket = new HashMap<>();

        catalogo.put("avena", 2.21);
        catalogo.put("garbanzos", 2.39);
        catalogo.put("tomate", 1.59);
        catalogo.put("jengibre", 3.13);
        catalogo.put("quinoa", 4.50);
        catalogo.put("guisantes", 1.60);

        String producto;
        int cantidad = 0;
        do {
            System.out.println("----------catalogo----------");
            for (Map.Entry<String, Double> productos : catalogo.entrySet()) {
                System.out.println(productos.getKey() + ": " + productos.getValue() + "€");
            }
            System.out.println("---------------------------");
            System.out.println("Producto:");
            producto = sc.next();
            if (catalogo.containsKey(producto)) {
                System.out.println("Cantidad");
                cantidad = sc.nextInt();

                ticket.put(producto, cantidad);

            } else if (producto.equalsIgnoreCase("fin")) {
                System.out.println("*****Ticket*****");
                 System.out.println(" producto "+" cantidad "+" precio "+ " subtotal");
                for (Map.Entry<String, Integer> tickets : ticket.entrySet()) {
                    double precio=catalogo.get("tomate");
                    double subtotal=tickets.getValue()*precio;
                    System.out.println(tickets.getKey() + ":      " + tickets.getValue()+"          " +precio);
                }
                System.out.println("has salido");
            } else {
                System.out.println("producto no encontrado");

            }

        } while (!producto.equalsIgnoreCase("fin"));

    }

}
