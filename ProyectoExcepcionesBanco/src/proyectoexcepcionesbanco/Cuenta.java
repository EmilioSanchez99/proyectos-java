/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexcepcionesbanco;

/**
 *
 * @author Medac
 */
public class Cuenta {
    
    private String nombre;
    private int numero;
    private double saldo;

    public Cuenta(String nombre, int numero, double saldo) throws SaldoInsuficienteException {
        
        
        if (saldo<0) {
            throw new SaldoInsuficienteException("saldo inicial negativo");
        }
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
        
    }
     @Override
    public String toString() {
        return nombre;
    }
    
    public void movimiento(double valor) throws SaldoInsuficienteException{
        if (saldo+valor<0) {
            throw new SaldoInsuficienteException("saldo insuficiente");
        }
        saldo=+valor;
    }
    
    
}
