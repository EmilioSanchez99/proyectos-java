/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajedrez;

/**
 *
 * @author Medac
 */
public class Peon extends Ficha {

    boolean primeraVez = true;

    Peon(boolean estado, int col) {
        super(estado);
        nombre = "P";
        posy = col;
        if (negras) {
            posx = 1;
        } else {

        }
        posx = 6;

    }

    public void Mover(Ficha[][] tablero) {
        
        System.out.println("donde?");
        int dondex = sc.nextInt();
        int dondey = sc.nextInt();
        
        if ((Math.abs(posx - dondex)) == 1) {
            Ficha ficha = tablero[dondex][dondey];
            switch (Math.abs(posy - dondey)) {
                case 0:
                    //delante
                    if (ficha.getNombre().equals("_")) {
                        posx = dondex;
                        posy = dondey;

                    } else {
                        System.out.println("no se puede");
                    }
                    break;
                case 1:
                    //lateral 

                    if (!(ficha.getNombre().equals("_"))) {
                        if (negras == ficha.isNegras()) {
                            System.out.println("no se puede porque es tuyo");

                        } else {

                            posx = dondex;
                            posy = dondey;
                            tablero[dondex][dondey].setNombre("_");
                        }
                    }
                    break;
            }

        } else if ((Math.abs(posx - dondex)) == 2) {
            if (primeraVez) {
                 Ficha ficha = tablero[dondex][dondey];
            switch (Math.abs(posy - dondey)) {
                case 0:
                    //delante
                    if (ficha.getNombre().equals("_")) {
                        posx = dondex;
                        posy = dondey;

                    } else {
                        System.out.println("no se puede");
                    }
                    break;
                case 1:
                    //lateral 

                    if (!(ficha.getNombre().equals("_"))) {
                        if (negras == ficha.isNegras()) {
                            System.out.println("no se puede porque es tuyo");

                        } else {

                            posx = dondex;
                            posy = dondey;
                            tablero[dondex][dondey].setNombre("_");
                        }
                    }
                    break;
                default:
                    System.out.println("movimiento incorrecto");
            }

                primeraVez = false;
            }
        }

    }

}
