/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class Array {

    public static int sumaArray(int[]a){
        int suma=0;
        for(int i=0;i<7;i++){
            suma=suma+a[i];
        }
        return suma;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        
        /*int[] array={5,3,2,1,7};
         System.out.println(array[0]);*/
       
        /*int[] array2= new int[3];
            array2[0]=2;
            array2[1]=3;
            System.out.println(array2[0]+";"+array2[1]+";"+array2[2]);*/
        
       
        
        
        /*int[] array3=new int[4];
        // RELLENAR e introducir por teclado
        for(int i=0;i<4;i++){
            System.out.println("introduce valores");
            array3[i]=sc.nextInt();
        }
        //MOSTRAR por teclado
        for(int i=0;i<4;i++){
            System.out.print(array3[i]+";");
        }*/
        
        
        /*int total=0;
        int [] array4=new int[7];
        for(int i=0;i<7;i++){
            System.out.println("introduce valores");
            array4[i]=sc.nextInt();
            total=array4[i]+total;
        }
        System.out.println("el total es"+ total);*/
        
        
        // hacer lo mismo con FUNCIONES
        
        /*int total=0;
        int[] array5=new int [7];
        for(int i=0;i<7;i++){
            System.out.println("introduce valores");
            array5[i]=sc.nextInt();
            
        }
        System.out.println(sumaArray(array5));*/
        
        
        // ejercicio array ver por pantalla a la inversa
        
        /*System.out.println("cuantos numeros quieres introducir?");
        int cantidad;
        cantidad=sc.nextInt();
        int[] array6=new int[cantidad];
        
            for(int i=0;i<cantidad;i++){
                System.out.println("introduce los valores");
                array6[i]=sc.nextInt();
                
            }
            for(int i=0;i<cantidad;i++){
        
                System.out.print(array6[i] + ";");
            }
        
           for(int a=cantidad-1;a>-1;a--){
               
               System.out.print(array6[a]+";");
           }*/
        
        
            //ejercicio
            
            /*int[] array7={7,5,3};
            int size=array7.length;
            System.out.println(size);*/
            
            /*int[]a={3,2,7};
            int[]b;
            a=null;
            b=a;
            System.out.println(b[0]);*/
            
             //ejercicio
             /*int num1,num2,num3;
             int[] random=new int[3];
             random[0]=(int)(Math.random()*10);
             random[1]=(int)(Math.random()*10);
             random[2]=(int)(Math.random()*10);
             System.out.println(Arrays.toString(random));
             int[] usuario=new int[3];
             System.out.println("introduce los numeros");
             usuario[0]=sc.nextInt();
             usuario[1]=sc.nextInt();
             usuario[2]=sc.nextInt();
             for(int i=0;i<3;i++){
                 boolean respuesta= false;
                 if(random[i]==usuario[i]){
                     respuesta=true;
                     System.out.println(respuesta);
                 }
                 else{
                     respuesta=false;
                     System.out.println(respuesta);
                 }
                     
             }
             
             // aqui se usa el metodo rapido arrays.equals para comparar
             
             boolean respuesta=Arrays.equals(random, usuario);
             System.out.println(respuesta);
             
             //con while
             while(usuario[0]!=random[0]||usuario[1]!=random[1]||usuario[2]!=random[2]){
                 System.out.println("es incorrecto,vuelve a intentarlo");
             usuario[0]=sc.nextInt();
             usuario[1]=sc.nextInt();
             usuario[2]=sc.nextInt();
                 
             }*/
             
             
             
             //Ejercicio con .FILL
                     
             /*char a[]=new char[5];
             Arrays.fill(a,'a');
             System.out.println(Arrays.toString(a));*/
             
             
             
             //Ejercicio
            
             /*int [] fijo={1,2,3};
             System.out.println("introduce el tamaño de tu cadena");
             
              int cantidad;
            cantidad=sc.nextInt();
            int[] user=new int[cantidad];
        
            for(int i=0;i<cantidad;i++){
                System.out.println("introduce el valor" +i);
                user[i]=sc.nextInt();
            }
            
             System.out.println(comparar(fijo , user));*/
             
             
             
            //ejercicio añadir un valor a una array
            
            /*int [] fijo={3,2,4,7};
            int []usuario=new int[5];
            //igualamos el array usuario al fijo hasta la posicion 2
            for(int i=0;i<2;i++){
                usuario[i]=fijo[i];
            }
            System.out.println("introduce un numero");//introducimos el valor de la posicion 2
            
            usuario[2]=sc.nextInt();
                //igualamos las siguientes posiciones al array fijo
             for(int i=3;i<5;i++){
                 usuario[i]=fijo[i-1];
             }
            
            System.out.println(Arrays.toString(usuario));
            
            Arrays.sort(usuario);// el comando Arrays.sort es para ordenar el array
            System.out.println(Arrays.toString(usuario));*/
            
            
            //matrices
            
            /*int[][] matriz=new int[3][3];
            for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[0].length;j++){
                    matriz[i][j]=3;
                }
    }
            
            for(int fila=0;fila<matriz.length;fila++){
                System.out.println(Arrays.toString(matriz[fila]));
            }
             
            int[][] matriz2= {{2,3},{4,7},{5,5}};
            mostrarArray(matriz2);
            
            
             char[][] matriz3=new char[3][4];
            for(int i=0;i<matriz3.length;i++){
                for(int j=0;j<matriz3[0].length;j++){
                    matriz3[i][j]='x';
                }
    }
            
            for(int fila=0;fila<matriz.length;fila++){
                System.out.println(Arrays.toString(matriz3[fila]));
            }
            mostrarArray(matriz3);*/
                
             
            
             
            /* int cont=0;
             int[] array={1,1,1,2,2,3,4,5};
             int[]array2=new int[array.length];
             for(int i=0;i<array.length;i++){
                 for( int j=i+1;j<array.length;j++){
                     if(array[i]==array[j]){
                         cont++;
                     }
                 }
                 if(cont==0){
                     array2[i]=array[i];
                 }
             }
                     
             System.out.println(Arrays.toString(array2));*/
            
            //cadenas de ARRAYS
            
            char[]cadena=new char [4];
            cadena[0]='h';
            cadena[1]='o';
            cadena[2]='l';
            cadena[3]='a';
            System.out.println(Arrays.toString(cadena));
            System.out.println(cadena.length);
            
             
             
        
        
        
        
        
        
        
        
        
        }
    
    //funciones
    
    public static void mostrarArray(int [][] a){
    for (int i=0;i<a.length;i++){
        System.out.println(Arrays.toString(a[i]));
    }
}
     public static void mostrarArray(char [][] a){
    for (int i=0;i<a.length;i++){
        System.out.println(Arrays.toString(a[i]));
    }
}
    
    
    //ejercicio LINEA 156
    
    public static boolean comparar (int [] a,int[] b){
        boolean aux=true;
       for(int i=0;i<a.length;i++){
           
           if(a[i]!=b[i]){
               aux=false;
               
           }
           
       }
    return aux;
    }

   
    
}

        
    
        
    
    
    

