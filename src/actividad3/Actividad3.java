
package actividad3;

import java.util.Scanner;

public class Actividad3 {

        public static void encabezado() {
            
            System.out.println(" ============================================================== ");
            System.out.println(" ============== Universidad Autonoma de Campeche ============== ");
            System.out.println(" ============================================================== ");
            System.out.println(" =================== Facultad de Ingenieria =================== ");
            System.out.println(" ============================================================== ");
            System.out.println(" =========== Ingenieria en Sistemas Computacionales =========== ");
            System.out.println(" ============================================================== ");
            System.out.println(" ==================== 21 de abril del 2021 ==================== ");
            System.out.println ("");  
            }
       
        public static void Presentacion() {
         
          Scanner entrada = new Scanner(System.in);
          
          System.out.println ("");  
          System.out.println(" ============================================================== ");
          System.out.println(" ==================== Actividades ============================= "); 
          System.out.println(" ============================================================== ");
          System.out.println ("");  
          System.out.println (" Escoge el numero de la actividad que deseas:");  
          System.out.println ("");  
          System.out.println (" [1] Imprimir la suma consecutiva del 0 al 10 ");  
          System.out.println (" [2] Calcula el factorial del 1 al 10  ");  
          System.out.println (" [3] Calcula el factorial del 1 hasta el numero que desee ");  
          System.out.println (" [4] Calcula la media de la suma del 0 hasta el numero que desee ");  
          System.out.println (" [5] Promedio de numeros/ Suma / Mayor y Menor / Distancia ");  
          System.out.println (" [6] Dias de la semana ");  
          System.out.println (" [7] Juego de gato ");  
         
          principal(entrada.nextInt()); 
      
      }  
        
        public static void suma() {
           
           int suma = 0; 
         
           for (int i = 1; i <= 10; i ++) {
           
               suma += i;
          }
                 
           System.out.println("La suma de consecutiva de 0 al 10 es = " + suma);
     
       }
      
        public static void primerFactorial() {
      
          int factorial = 1; 
                 
          for (int i = 10; i >= 1; i--) {  
              
           factorial *= i;     
                              
          }         
                     
          System.out.println("El factorial del 1 al 10 = " + factorial);
      }
         
        public static void segundoFactorial(int numeroF){
            
            int numero = numeroF; 
            int factorial = 1; 
            
            for (int i = numero; i >= 1; i--) {
        
           
            factorial *= i;
          
           }
       
            System.out.println("El factorial del 1 al " + numero + " es: " + factorial);
         }    
              
        public static void media(double numeroM){    
        
             double numeroX = numeroM; 
             double suma = 0; 
             
             for (int i = 1; i <= numeroX; i++) {
            
                 suma += i;
           }
             
             double media = suma / numeroX; 
                     
            System.out.println(" La media de " + numeroX + " es: " + media );
         }
             
        public static void promedio(int numeroX) {
             
             Scanner entrada = new Scanner(System.in); 
             
             int numero = numeroX; 
             int suma = 0; 
             double promedio; 
             int diferencia; 
             
             int arrays [] = new int[numero] ; 
          
             for (int i = 0; i < arrays.length; i++) {
               
                System.out.println(" Introduzca un valor " + (i +1) + ": "  );
                arrays[i] = entrada.nextInt();                                
            }
              int mayor; 
              int menor; 
              
              mayor = menor = arrays [0] ;
              
              for (int i = 0; i < arrays.length; i++) {
                 
                  if(arrays [i] > mayor) {
                      mayor = arrays[i];
              } else if (arrays [i] < menor) {
                      menor = arrays[i];   
              }               
                   suma += arrays [i];  
              }
         
              promedio = (double)suma/ (double)numero; 
              diferencia = mayor - menor; 
              
              System.out.println("La cantidad de valores introducidos fueron : " + numero);
              System.out.println("El promedio de los valores introducidos fue : " + promedio);
              System.out.println("El numero mayor introducido fue : " + mayor);
              System.out.println("El numero menor introducido fue : " + menor);
              System.out.println("La diferencia del numero mayor y menor es de: " + diferencia);
         } 
        
        public static void DiasDeLaSemana() {
         
            String dias[] = new String [7]; 
            
            dias[0] = "Lunes" ;
            dias[1] = "Martes" ;
            dias[2] = "Miercoles" ;
            dias[3] = "Jueves" ;
            dias[4] = "Viernes" ; 
            dias[5] = "Sabado" ;
            dias[6] ="Domingo" ; 
            
            for (String DiasDeLaSemana: dias) {
                System.out.println(DiasDeLaSemana);
            }
        }
       
        public static void Gato()  {
        
          
            String Gato[][] = new String[3][3];
             
             for(String vertical[]: Gato){
              for(String horizontal: vertical){          
                 System.out.print("x" + " ");
             }        
                  System.out.println("");
             }
            
        }
                 
        public static void main(String[] args) {
          encabezado();
          
          Presentacion();
        }  
       
        public static void principal(int numero) {
          
           Scanner entrada = new Scanner(System.in); 
               
           int valor = numero; 
           
           switch (valor) {
               
                case 1:
                   System.out.println("" );
                   System.out.println(" ================================================================= ");
                   System.out.println(" =========== Imprimir la suma consecutiva del 0 al 10 ============ ");  
                   System.out.println(" ================================================================= ");
                   suma ();
                   break;
                case 2:
                   System.out.println("" );
                   System.out.println(" ================================================================= ");
                   System.out.println(" ================ Calcula el factorial del 1 al 10 =============== ");  
                   System.out.println(" ================================================================= ");
                   primerFactorial(); 
                   break;     
                case 3:
                   System.out.println("" );
                   System.out.println(" ================================================================= ");
                   System.out.println(" ===== Calcula el factorial del 1 hasta el numero que desee ====== ");  
                   System.out.println(" ================================================================= ");
                   segundoFactorial(entrada.nextInt()); 
                   break;
               case 4:
                   System.out.println("" );
                   System.out.println(" ================================================================= ");
                   System.out.println(" == Calcula la media de la suma del 0 hasta el numero que desee == ");  
                   System.out.println(" ================================================================= ");
                   media(entrada.nextDouble());
                   break;        
                case 5:
                   System.out.println("" );
                   System.out.println(" ================================================================= ");
                   System.out.println(" ===== Promedio de numeros/ Suma / Mayor y Menor / Distancia ===== ");  
                   System.out.println(" ================================================================= ");
                   promedio(entrada.nextInt()); 
                   break;     
                case 6:
                   System.out.println("" );
                   System.out.println(" ================================================================= ");
                   System.out.println(" ======================= Dias de la semana ======================= ");  
                   System.out.println(" ================================================================= ");
                   DiasDeLaSemana(); 
                   break;
               case 7:
                   System.out.println("" );
                   System.out.println(" ================================================================= ");
                   System.out.println(" ========================= Juego de gato ========================= ");  
                   System.out.println(" ================================================================= ");
                   Gato(); 
                   break;        
           }
           
        
      }   
      
}


     
        
          
          
       
    
    
