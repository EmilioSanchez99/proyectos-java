/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Paciente {
    Scanner sc=new Scanner(System.in);
    int id;
    String nombre;
    int edad;

    public Paciente() {
        nombre=sc.next();
        edad=sc.nextInt();
    }
    
    
}
