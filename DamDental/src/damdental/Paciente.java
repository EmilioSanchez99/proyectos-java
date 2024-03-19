/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package damdental;
import java.util.Scanner;
import java.io.*;


/**
 *
 * @author Medac
 */
public class Paciente {
    Scanner sc=new Scanner(System.in);
    
    //atributos 
    
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int id=0;
    
    //constructor

    public Paciente(String nombre, String apellido, int edad, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id=id;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Paciente{" + "sc=" + sc + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", id=" + id + '}';
    }
    
    public void Añadir(Paciente[]arrayPacientes){
        File pacientes=new File("pacientes.txt");
        try{
            String nom;
            String ape;
            int edad2;
            int id2;
            FileReader filereader=new FileReader(pacientes);
            System.out.println("dime el nombre");
            nom=sc.next();
            System.out.println("dime el apellido");
            ape=sc.next();
            System.out.println("dime la edad");
            edad2=sc.nextInt();
           
            arrayPacientes[id]=new Paciente(nom,ape,edad2,id);
             id++;
             
            
            
        }
        catch(IOException e){
            System.out.println(e);
        }
        
        
    }
    
    
    
    
    
}
