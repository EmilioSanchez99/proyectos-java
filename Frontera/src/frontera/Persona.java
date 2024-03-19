/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontera;

/**
 *
 * @author Medac
 */
public class Persona {
    //atributos
    private String nombre;
    private String dni;
            
    //constructores
    
    Persona(String nombre, String dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    
    //metodos
    public String getNombre (){
          return nombre;
    }
    public String getDni (){
          return dni;
    }
    
     @Override
    public String toString(){
        return " nombre "+nombre +" dni "+dni;
        
    }
}
