/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discoteca;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Persona {

    Scanner sc = new Scanner(System.in);

    int edad;
    String nombre;
    double saldo;

    public Persona() throws EdadException,SaldoException{
        System.out.println("introduce edad");
        edad = sc.nextInt();
        System.out.println("introduce nombre");
        nombre = sc.next();
        System.out.println("introduce saldo");
        saldo = sc.nextInt();
        if (edad < 18) {
            throw new EdadException();

        }
        else if (saldo<0){
            throw new SaldoException();
        }

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void meterDinero(double dinero) {

    }

    public void sacarDinero(double dinero) throws SaldoException {
       

            if (saldo < dinero) {
                throw new SaldoException();

            }
            //en el else iria la operacion para cuando si puede sacar dinero, que no me dio tiempo 
            

        
    }
}
