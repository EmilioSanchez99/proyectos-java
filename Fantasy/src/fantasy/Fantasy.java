/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Fantasy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //crear array total
        Jugador[] jugadores = new Jugador[22];
        jugadores[0] = new Jugador("pepe", "centro", 20000);
        jugadores[1] = new Jugador("juan", "portero", 30000);
        jugadores[2] = new Jugador("jose", "delantero", 10000);
        jugadores[3] = new Jugador("miguel", "centro", 40000);
        jugadores[4] = new Jugador("juanantonio", "centro", 23000);
        jugadores[5] = new Jugador("pepillo", "delantero", 10000);
        jugadores[6] = new Jugador("sergio", "defensa", 20000);
        jugadores[7] = new Jugador("leandro", "centro", 70000);
        jugadores[8] = new Jugador("emilio", "centro", 50000);
        jugadores[9] = new Jugador("volo", "defensa", 15000);
        jugadores[10] = new Jugador("pablo", "defensa", 20000);
        jugadores[11] = new Jugador("santiago", "centro", 70000);
        jugadores[12] = new Jugador("imad", "defensa", 40000);
        jugadores[13] = new Jugador("alvaro", "defensa", 60000);
        jugadores[14] = new Jugador("kiko", "centro", 40000);
        jugadores[15] = new Jugador("damian", "defensa", 30000);
        jugadores[16] = new Jugador("luis H.", "centro", 40000);
        jugadores[17] = new Jugador("victor", "portero", 20000);
        jugadores[18] = new Jugador("manuel", "centro", 10000);
        jugadores[19] = new Jugador("fernando", "portero", 50000);
        jugadores[20] = new Jugador("juanlu", "defensa", 20000);
        jugadores[21] = new Jugador("ivan", "centro", 10000);

        //crear array de plantilla
        Jugador[] plantilla = new Jugador[11];
        rellenar(jugadores, plantilla);
        Jugador[] aux = new Jugador[2];

        //jugar
        int opcion;
        do {
            System.out.println("selecciona: 1.Mostrar plantilla  2.Cambiar jugador  3.Valor del Equipo 4.Salir.");
            opcion = sc.nextInt();
            switch (opcion) {

                case 1: //mostrar plantilla
                    System.out.println("tu plantilla");
                    mostrar(plantilla);
                    
                    
                    
                    break;

                case 2://cambiar jugador
                    System.out.println("jugadores disponibles");
                    mostrar(jugadores);
                    System.out.println("-----------------------------");//divisor para leer mejor
                    System.out.println("tu plantilla");
                    mostrar(plantilla);

                    System.out.println("elige la posicion del jugador que quieres cambiar de la lista");
                    int posx = sc.nextInt();
                    System.out.println("elige la posicion del jugador que quieres cambiar de tu plantilla");
                    int posy = sc.nextInt();

                    //controlar que el jugador cambiado vuelva a la lista general mediante un array auxiliar de cambios
                    aux[0] = plantilla[posy];
                    plantilla[posy] = jugadores[posx];
                    jugadores[posx] = aux[0];

                    mostrar(aux);

                    break;

                case 3: //valor del equipo
                    valor(plantilla);
                    break;

                case 4://salir
                    break;

                default://por si introduce un numero incorrecto
                    System.out.println("numero incorrecto, cuelve a elegir");

                    break;

            }//switch

        }//do 
        while (opcion != 4);

        System.out.println("has salido");

    }

    //metodo rellenar
    private static void rellenar(Jugador[] jugadores, Jugador[] plantilla) {

        int posTotal = 0;
        int posPlantilla = 0;
        int portero = 0;
        int delantero = 0;
        int centro = 0;
        int defensa = 0;
        for (int i = 0; i < plantilla.length; i++) {


            //comprobamos que no sea null y lo insertamos en el array de plantilla
     
                do {
                //random de la lista total
                    posTotal = (int) (Math.random() * 22);
                    if ((jugadores[posTotal] != null)&&((jugadores[posTotal].getPosicion()).equalsIgnoreCase("portero"))) {
                        portero++;
                        plantilla[i] = jugadores[posTotal];
                        jugadores[posTotal]=null;
                        

                    } else if ((jugadores[posTotal] != null)&&((jugadores[posTotal].getPosicion()).equalsIgnoreCase("delantero"))) {
                        delantero++;
                        plantilla[i] = jugadores[posTotal];
                        jugadores[posTotal]=null;

                    } else if ((jugadores[posTotal] != null)&&((jugadores[posTotal].getPosicion()).equals("centro"))) {
                        System.out.println(centro);
                        centro++;
                        plantilla[i] = jugadores[posTotal];
                        jugadores[posTotal]=null;

                    } else if ((jugadores[posTotal] != null)&&((jugadores[posTotal].getPosicion()).equalsIgnoreCase("defensa"))) {
                        defensa++;
                        plantilla[i] = jugadores[posTotal];
                        jugadores[posTotal]=null;
                    }
                    else{
                        if(i==0){
                            i=0;
                        }
                        else{
                            i--;
                        }
                            
}
                } while (portero < 3 && defensa < 6 && centro < 6 && delantero < 5);

            

            //AQUI HE INTENTADO HACER EL EXTRA PERO ME SALTA EXCEPCION, HE COMENTADO LOS IF Y EL DO WHILE CON LAS EXCLUSIONES
           /* jugadores[posTotal] = null;*/
           

        }
        
        System.out.println("portero"+portero+", "+"defensa"+defensa+", "+"centro"+centro+", "+"delantero"+delantero);
    }

    //mostrar
    private static void mostrar(Jugador[] plantilla) {
        for (int i = 0; i < plantilla.length; i++) {
            if (plantilla[i] != null) { //esto es para cuando quiera ver la lista de jugadores totales, no se vean los null
                System.out.println("posicion " + i + " = " + plantilla[i]);
            }

        }
    }

    //metodo valor
    public static void valor(Jugador[] plantilla) {
        int valor = 0;
        for (int i = 0; i < plantilla.length; i++) {
            valor = valor + plantilla[i].getPrecio();
        }
        System.out.println(valor);

    }

}//main
