/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package borrarcomentarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Medac
 */
public class BorrarComentarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepctionSinPuntoComa,IOException {

        File file = new File("comentario.txt");
        boolean comentado=false;
        try {
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            String linea = " ";
            String[] arrayLinea;
            linea = bufferedreader.readLine();

            int i = 0;

            while (linea != null) {
                
                if (!linea.contains("//") && (!comentado)&&!linea.contains("/*")&&!linea.contains("*/")){
                    System.out.println(linea);
                    
                }
                else if(linea.contains("/*")){
                    comentado=true;
                }
                else if(linea.contains("*/")){
                    comentado=false;
                }
                
                
                if (!linea.endsWith(";")||(linea.endsWith("}")||linea.endsWith("{"))){
                    throw new ExcepctionSinPuntoComa();
                }
                
                linea=bufferedreader.readLine();
                   

            }
            
            

            bufferedreader.close();

        } catch (IOException e) {
            System.out.println("no se puede leer el archivo");

        }
        catch(ExcepctionSinPuntoComa e2){
            
            System.out.println(e2);
            
            
        }

    }//main

  
}
