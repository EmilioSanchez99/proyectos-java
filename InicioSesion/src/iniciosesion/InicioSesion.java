/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iniciosesion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class InicioSesion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <String,String>map=new HashMap<>();
        map.put("admin", "admin");
        map.put("user", "user");
        
        boolean correcto=false;
        int intentos=0;
        while(!correcto&&intentos<3){
            System.out.println("introduce usuario");
            String usuario=sc.next();
            System.out.println("introduce contraseña");
            String contraseña=sc.next();
            if (map.containsKey(usuario)&&map.get(usuario).equalsIgnoreCase(contraseña)) {
                correcto=true;
                System.out.println("ere un maquina");
            }
            else{
                System.out.println("incorrecto");
                intentos++;
            }
        }
        if (!correcto) {
            System.out.println("intentos maximos alcanzados");
        }
        
    }
    
}
