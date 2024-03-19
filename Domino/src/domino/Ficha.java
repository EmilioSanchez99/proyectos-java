/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domino;

/**
 *
 * @author Medac
 */
public class Ficha {
    
    int a;
    int b;

    public Ficha(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    
    
    @Override
    public String toString() {
        return "[" + a + ", " + b +"]";
    }
    
    
    
    
}
