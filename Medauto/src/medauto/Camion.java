/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medauto;

/**
 *
 * @author Medac
 */
public class Camion extends Vehiculo {

    public Camion() {
        super();
        nombre = "camion";
        posx = 0;
        posy = 0;
    }

    @Override
    public void avanzar() {
        posy = posy + 2;
        if (posy > 9) {
            posy = 9;
        }

    }

    @Override
    public void retroceder() {
        posy = posy - 2;
        if (posy < 0) {
            posy = 0;

        }

    }
}
