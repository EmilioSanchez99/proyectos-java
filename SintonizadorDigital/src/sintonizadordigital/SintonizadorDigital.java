/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sintonizadordigital;

/**
 *
 * @author Medac
 */
public class SintonizadorDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SintonizadorFM sint1=new SintonizadorFM (108);
        sint1.subir();
        sint1.mostrar();
        sint1.bajar();
        sint1.bajar();
        sint1.bajar();
        sint1.mostrar();
    }
    
}
