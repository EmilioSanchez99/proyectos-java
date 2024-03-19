/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medauto;

/**
 *
 * @author Medac
 */
public class Moto extends Vehiculo{
        public Moto(){
        super();
        nombre="moto";
        posx=1;
        posy=0;
    }

    @Override
    public void avanzar() {
        posy=posy+4;
        if (posy > 9) {
            posy = 9;
        }
    }

    @Override
    public void retroceder() {
        posy=posy-4;
        if (posy<0) {
            posy=0;
            
        }

    }
    
}
