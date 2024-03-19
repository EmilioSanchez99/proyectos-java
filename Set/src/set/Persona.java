/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set;

import java.util.Objects;

/**
 *
 * @author Medac
 */
public class Persona implements Comparable <Persona>{
    int edad;
    String nombre;
    String dni;

    public Persona(int edad, String nombre, String dni) {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + ", dni=" + dni + '}';
    }

    @Override
    public int hashCode() {
        int a=(int)(Math.random()*10);
        
       
        
        return a;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int compareTo(Persona o) {
        
        
        return (nombre.compareTo(o.nombre));//para alfabeticamente
                


    }

   
    
    
    
}
