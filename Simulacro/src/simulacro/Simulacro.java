/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacro;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Simulacro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        int pos = 0;
        Persona[] alumnos = new Persona[100];

        do {
            System.out.println("1. Insertar alumno 2. mostrar alumnos 3. mostrar alumnas 4. mostrar suspensos 5. mostrar estadisticas 6. salir");

            respuesta = sc.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("1.masculino o 2.femenino?");
                    int genero = sc.nextInt();
                    System.out.println("di el nombre");

                    if (genero == 1) {// masculino

                        alumnos[pos] = new Alumno(sc.next());

                    } else { //femenino
                        alumnos[pos] = new Alumna(sc.next());

                    }

                    alumnos[pos].insertarNotas(); //se llama al metodo de insertar notas
                    alumnos[pos].estaAprobado();

                    pos++;
                    break;

                case 2:
                    for (int i = 0; i < alumnos.length; i++) {
                        if (alumnos[i] instanceof Alumno) {
                            System.out.println(alumnos[i]);

                        }

                    }

                    break;

                case 3:
                    for (int i = 0; i < alumnos.length; i++) {
                        if (alumnos[i] instanceof Alumna) {
                            System.out.println(alumnos[i]);

                        }

                    }

                    break;

                case 4:
                    System.out.println("1.alumnos 2. alumnas");
                    int res = sc.nextInt();

                    for (int i = 0; i < pos; i++) {
                        alumnos[i].estaAprobado();
                        if (res == 1) {
                            if (alumnos[i] instanceof Alumno && alumnos[i].isSuspenso()) {
                                System.out.println(alumnos[i]);

                            }

                        } else {
                            if (alumnos[i] instanceof Alumna && alumnos[i].isSuspenso()) {
                                System.out.println(alumnos[i]);
                            }

                        }
                    }
                    break;

                case 5:
                    double contm = 0,
                     contf = 0;
                    for (int i = 0; i < pos; i++) {
                        if (alumnos[i].isSuspenso() && alumnos[i] instanceof Alumno) {
                            contm++;

                        } else if (alumnos[i].isSuspenso() && alumnos[i] instanceof Alumna) {
                            contf++;

                        }
                    }
                    System.out.println("alumnos suspensos"+ contm/pos+"alumnas suspensas"+contf/pos);

                    break;

                case 6:
                    System.out.println("has salido");
                    break;

                default:
                    System.out.println("vuelve a introduir ");
                    break;

            }//switch

        }// do
        while (respuesta != 6);

    }

}
