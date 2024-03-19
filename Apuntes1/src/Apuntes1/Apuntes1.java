/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Apuntes1;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Apuntes1 {
public static double media(double num1,double num2){
    double res=(num1+num2)/2;
    return res;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // System.out.print("Hola aula5");
       
       Scanner sc=new Scanner (System.in);
       
       
      /* float a=5;
       float b=2;
       System.out.println(a);
       System.out.println(b);
       float suma=a/b;
       System.out.println(suma);
       System.out.println("la suma es" + suma);*/
       
       // calculo de celsius a fahrenheit    
       
      /* double f;
       double c=40;
               f=c*1.8+32;
               System.out.println("los grados fahrenheit son" + f);*/
               
               // calculo 2
           
               
               /*double fahrenheit;
               double celsius=40;
               fahrenheit=celsius*1.8+32;
               System.out.println("los grados fahrenheit son" + f);*/
               
               // dato alfanumerico
               
               /*char letra='a';
               System.out.println("la letra es: "+letra);*/
               
               // datos booleanos
               
               /*boolean respuesta=true;
                       System.out.println(respuesta);
                       
                       boolean booleano1=true;
                       boolean booleano2=false;
                       boolean resultado;
                       resultado=booleano1&&booleano2;
                       System.out.println(resultado);
                       resultado=booleano1||booleano2;
                       System.out.println(resultado);
                       resultado=!booleano1;
                       System.out.println(resultado);
                       resultado=!booleano1&&!booleano2;
                       System.out.println(resultado);
                       
                       //operdores relacionales
                       /*int num1=5;
                       int num2=8;
                       System.out.println("¿es igual? "+(num1==num2));
                       char letra1='a';
                       char letra2='a';
                       System.out.println("¿es igual?"+(letra1==letra2));*/
                       
                       // usar Math.
                       
                      /* System.out.println(Math.sqrt(25));*/
                        
                       // conversiones
                       
                       /*double num=8.3;
                       int resul=(int)num;
                       System.out.println(resul);
                       int num3=8;
                       double resul1=num3;
                       System.out.println(resul1);
                       char let='a';
                       int res=let;
                       System.out.println(res);
                       int v=20;
                       char re=(char)v;
                       System.out.println(re);*/
                              
                       // para comentar varias lineas, se pone /* al principio y al final
                       
                       //ejercicio edad introduciendo datos por teclado
                       
                       /*int nacimiento;
                       int actual;
                       int edad;
                       System.out.println("introduce el año actual");
                       actual=sc.nextInt();
                       System.out.println("introduce el año de nacimiento");
                       nacimiento=sc.nextInt();
                       edad = actual-nacimiento;
                       System.out.println("mi edad es" + edad);*/
                               
                       //redondear numeros metidos por teclado
                        
                      
                       /*   double real;
                       System.out.println("el numero a redondear es");
                       real=sc.nextDouble();
                       int redondeo;
                       real=real+0.5;
                       redondeo=(int)real;
                       System.out.println("el numero redondeado es "+redondeo);*/
                       
                       // calcular area circunferencia 
                       
                        /*double radio;
                        System.out.println("introduce el radio");
                        radio=sc.nextDouble();
                        double area= Math.PI*Math.pow(radio,2);
                        System.out.println("el area es "+ area);
                        double longitud= 2*Math.PI*radio;
                        System.out.println("la longitud es "+ longitud);
                        double arearedondeada=(int)area;
                        double longitudredondeada=(int)longitud;
                        System.out.println("el area redondeada es "+arearedondeada);
                        System.out.println("la longitud redondeada es " +longitudredondeada);
                        System.out.println("el area redondeada2 es"+Math.round(area));
                        System.out.println("la longitud redondeada2 es"+ Math.round(longitud));*/
                        
                        // USAR IF
                        
                        /*int num;
                        System.out.println("introduce el numero");
                        num= sc.nextInt();
                        if (num%2==0){
                            System.out.println("el numero es par");
                        }
                            else{
                                    System.out.println("es impar");
                                    }
                        
                        */
                        
                        // ver si dos numeros son iguales
                        
                       /* int num1, num2;
                        System.out.println("introduce un numero");
                        num1= sc.nextInt();
                        num2=sc.nextInt();
                        if(num1==num2){
                            System.out.println("son iguales");
                        }
                        
                        else{
                            System.out.println("no son iguales");
                            if (num1>num2) {
                                System.out.println(num1 +" es mayor que "+ num2);
                            }
                                else{
                                        System.out.println(num1 +" no es mayor que "+ num2);
                                        }
                                
                            } */
                       
                       // ordenar 3 numeros de mayor a menor
                       
                       /*int num1,num2,num3;
                       System.out.println("introduce 3 numeros");
                       num1=sc.nextInt();
                       num2=sc.nextInt();
                       num3=sc.nextInt();
                       if(num1>num2&&num3>num1) {
                           System.out.println(num3+">"+num1+">"+num2);
                       }  
                       else if(num1>num3&&num2>num1) {
                           System.out.println(num2+">"+num1+">"+num3);
                       }   
                       else if(num2>num1&&num3>num2) {
                           System.out.println(num3+">"+num2+">"+ num1); 
                          
                       }
                       else if (num2>num3&&num1>num2) { 
                           System.out.println(num1+">"+num2+">"+ num3);
                           
                       }  
                       else if (num3>num1&&num2>num3) {
                           System.out.println(num2+">"+num3+">"+ num1);
                           
                       }
                       else if (num3>num2&&num1>num3) { 
                           System.out.println(num1+">"+num3+">"+ num2);
                           
                           
                       } */
                       
                       // calcular ecuacion segundo grado
                       
                       /*double a,b,c;
                       double x1,x2;
                       double aux;
                       double aux2;
                       
                       
                       a=sc.nextDouble();
                       b=sc.nextDouble();
                       c=sc.nextDouble();
                       aux= b*b-4*a*c;
                       aux2=2*a;
                       
                       if(aux<0) {
                           System.out.println("no es posible");
                       }
                       else{
                           if (aux2==0) {
                           System.out.println("no es posible");
                       }
                       x1=(-b+Math.sqrt (aux))/(2*a);
                       x2=(-b-Math.sqrt(aux))/(2*a);
                       System.out.println("la solucion es"+x1 +"y" +x2);
                       
                       }
                       */
                       
                       //jugar a quien es quien
                       
                     /*  boolean bigote, gafas, pelo, barba, perilla, sombrero;
                       int respuesta;
                       System.out.println("quieres jugar al quien es quien? 1.yes 2.no");
                       respuesta=sc.nextInt();
                       if(respuesta==1){
                           System.out.println("tiene bigote?");
                           bigote=sc.nextBoolean();
                           System.out.println("tiene gafas?");
                           gafas=sc.nextBoolean();
                           System.out.println("tiene pelo?");
                           pelo=sc.nextBoolean();
                           System.out.println("tiene barba?");
                           barba=sc.nextBoolean();
                           System.out.println("tiene perilla?");
                           perilla=sc.nextBoolean();
                           System.out.println("tiene sombrero?");
                           sombrero=sc.nextBoolean();
                       
                           if(!bigote&&gafas&&!pelo&&!barba&&!perilla&&!sombrero){
                          System.out.println(" es lupas");
                                  }
                          else if(!bigote&&!gafas&&pelo&&!barba&&!perilla&&!sombrero){
                                  System.out.println("es monica");
                                  }
                          else if(bigote&&!gafas&&!pelo&&!barba&&!perilla&&!sombrero){
                               System.out.println("es nike");
                              
                                  }
                          else if(!bigote&&!gafas&&pelo&&!barba&&!perilla&&sombrero){
                               System.out.println("es kiko");
                              
                                  }
                          else if(!bigote&&!gafas&&!pelo&&barba&&!perilla&&!sombrero){
                               System.out.println("es medinilla");
                              
                                  }
                          else if(!bigote&&!gafas&&!pelo&&!barba&&perilla&&sombrero){
                               System.out.println("es alejandro");
                              
                                  }
                           
                           
                       }
                       
                      
                       else{
                           System.out.println("no juegas");
                       } 
                           */
                       
                       
                    
                        // poner nota segun numero metido
          
          /*System.out.println("introduce un numero");
          int numero;
          numero=sc.nextInt();
          if(numero<5){
              System.out.println("es insuficiente");
          }
          else if (numero==5){
              System.out.println("es suficiente");
          }
          else if (numero==6){
              System.out.println("es bien");
          }       
          else if(numero==7||numero==8){
              System.out.println("es notable");
          }
          else if (numero==9||numero==10){
              System.out.println("es sobresaliente");
          }
          else if (numero<0||numero>10){
              System.out.println("la chupas");
          }
                 
          switch(numero){
              case 0: 
                  System.out.println("tiene un 0");
              break;
              case 1:
                  System.out.println("tiene un 1");
              break;
              case 2:
                  System.out.println("tiene un 2");
               break;
              default: 
                  System.out.println("no es ninguno");
               break;
            
          }*/
          
          // ejercicios switch
          
                /*System.out.println("elige un numero: 1.luns 2.Martes 3.miercoles .4jueves 5.viernes 6.sabado 7.domingo"); 
                int num;
                num=sc.nextInt();
                switch(num){
                    case 1:
                        System.out.println("Lunes");
                        break;
                    case 2:
                        System.out.println("Martes");
                         break;
                }*/
                       
                
                //para introducir letra por teclado
                
                /*char dia;
        System.out.println("Introduce la inicial del dia de la semana.");
        dia = sc.next().charAt(0);
        switch (dia) {
            case 'l':
                System.out.println("Hoy es Lunes.");
                break;
            case 'm':
                System.out.println("Hoy es Martes.");
                break;
            case 'x':
                System.out.println("Hoy es Miercoles");
                break;
            case 'j':
                System.out.println("Hoy es Jueves.");
                break;
            case 'v':
                System.out.println("Hoy es Viernes");
                break;
            case 's':
                System.out.println("Hoy es Sabado.");
                break;
            case 'd':
                System.out.println("Hoy es Domingo");
                break;
            default:
                System.out.println("Eso no corresponde a ningun dia de la semana INUTIL");
                break;
        }*/
                
                // bucles 
                
         //while
            
               /*int a=3;
               while (a<5){
                   System.out.println("hola");
                   a++;
                   
               }*/
               
               /*int num;
                        System.out.println("introduce el numero");
                        num= sc.nextInt();
                        if (num%2==0){
                            System.out.println("el numero es par");
                        }
                            else{
                                    System.out.println("es impar");
                                    }
                        while(num==0){
                            System.out.println("la pelas");
                            
                        }*/
                  /*int num;
                  System.out.println("introduce un numero");
                   num=sc.nextInt();
                   while(num!=0){
                       if(num%2==0){
                           System.out.println("es par");
                           num=sc.nextInt();
                       }
                           else if(num%2!=0){
                               System.out.println("es impar");
                               num=sc.nextInt();
                                   }   
                           }
                        System.out.println("la pelas");
                        /*
                            
                        //el numero secreto
                      
                        /*int num2; 
                       double num;
                       num=Math.random()*100+1;
                       int num3=(int)num;
                        
                       num2=sc.nextInt();
                       while(num2!=num3&&num2!=-1){
                          
                          if(num2<num3){
                              System.out.println("es menor");    
                          }
                          else if (num2>num3){
                              System.out.println("es mayor");
                          }
                          num2=sc.nextInt();
                        }
                       
                           if (num2==num3){
                               System.out.println("has acertado");
                           }    
                           if (num2==-1){
                               System.out.println("has salido del juego");
                           }
                           */
                  
                  
            //do while
                       /*int a=1;
                       do{
                           System.out.println("hola");
                           a++;
                       }
                       while(a<3);*/
                       
                 //ejercicio rangos
                 /*
                 int min, max,introducido;
                 System.out.println("introduce rango min");
                       min=sc.nextInt();
                       System.out.println("introduce el rango max");
                       max=sc.nextInt();
                       
                       do{
                           System.out.println("introduce el numero deseado");
                       introducido=sc.nextInt();

                       }
                       while(introducido<min||introducido>max); */
                 
                 //tabla de multiplicar
              /* int num;
               System.out.println("introduce un numero del 1-10");
               num=sc.nextInt();
               
               while (num>0&&num<11) {
                   
                       System.out.println(num*1+","+num*2+","+num*3);
                       System.out.println("introduce otro numero");
                       num=sc.nextInt();
                   }*/
               //otra opcion
               /*int num;
               int a=1;
               do{
                   System.out.println("introduce un numero");
                   num=sc.nextInt();
               }
               while(!(num>0&&num<11));
               while(a<11){
                   System.out.println(num+"*"+a+"="+(num*a));
                   a++;
               }*/
               
        //for
        /*for(int i=1;i<11;i++){
        System.out.println("hola");
    }*/
                      
              //while se usa cuando puede que no se use una primera vez,
              //do while para cuando almenos se ejecuta una primera vez
              //for se usa cuando sabemos el numero de veces que se ejecutara
              
         //muestra el producto de los 10 primeros numeros impares
          /*int resultado=1;
         for (int a=1;a<20;a=a+2){
             resultado=resultado*a;
         }
        System.out.println("resultado"+resultado);*/
          
          //ejercicio
          /*int contador=0;
            for(int a=0;a<3;a++){
                for(int b=0;b<3;b++){
                    contador++;
                    System.out.print(contador);
                }
                System.out.println("");
                contador=0;
            }*/
          
          
          //ejercicios java asteriscos
          
          for(int i=0;i<4;i++){
              for(int j=0;j<i;j++){
                  
                  System.out.print("*");
              }
              System.out.println("*");
              
          }
          
          System.out.println("---------------");
          
          for (int i=0;i<4;i++){
              for(int j=3;i<j;j--){
                  System.out.print("*");
              }
              System.out.println("*");
          }
          
          /*int a=5;
          int b=6;
          System.out.println(media(a,b));*/
          
         /* for(int i=0;i<8;i++){
            for(int j=0;j<i;j++){
            
            System.out.print("*");
            }
              System.out.println("*");
          }*/
          
           
          
          
                
              
              
               
 
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
    }
 }

               
               

               
              

                       
                       
                           
                       
                            
               
                                
                                
                
               
              
               
        
        
                
                
                
                               
                              
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                    
          
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                       
                       
                       
                       
                       
                       
                              
                      
                           
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                                    
                            
                            
    
    
                          
    
    

                            
                            
                        
                        
                        
                    
                        
                                
                        
                                
                        
                       
                        
                        
                        
                        
                        
                        
                        
                       
                                
                                           
                              
                       
                       
                       
                       
                       
                       
                       

                              
                               
                       
                       
               
               
               
               
               
               
               
              
               
               
               
       
               
      
    
       
       
       
       
       
    
    

 
