/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author Medac
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CuentaCorriente cuenta1=new CuentaCorriente("Emilio","888888f");
       cuenta1.mostrar();
       cuenta1.ingresar();
       cuenta1.mostrar();
       cuenta1.retirar();
       cuenta1.mostrar();
        System.out.println("---------------");
       CuentaCorriente cuenta3=new CuentaCorriente("Jose","8888888f",500,-100);
       cuenta3.mostrar();
        System.out.println("----------------");
       CuentaCorriente cuenta2=new CuentaCorriente(800);
       cuenta2.mostrar();
       CuentaCorriente cuenta5=new CuentaCorriente(persona2,5000,-100);
       
       
       
       
       
       
       
    }
    
}
