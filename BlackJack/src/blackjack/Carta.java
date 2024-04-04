/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author Medac
 */
public class Carta implements Comparable <Carta>{
    
    private char letra=' ';
    private int numero;
    private String palo;
    

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
        this.numero=numero;
        
        //this.peso=Integer.toString(numero).charAt(0);
        
        switch(numero){
            case 1:
                letra='a';
                break;
            case 10:
                letra='j';
                break;
            case 11:
                letra='q';
                break;
            case 12:
                letra='k';
                break;
        }
        
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    
    @Override
    public String toString() {
        if  (letra==' ')
            return""+ numero+" "+palo;
        else{
            return ""+letra+" "+palo;
        }
    }
    @Override
    public int compareTo(Carta o) {
        
        return numero-o.numero;
        
    }
    
}
