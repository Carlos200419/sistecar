//Elabore un algoritmo que lea dos números e imprima la suma si los dos números son positivos. 

package Selectivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class ejercicio16 {
    public static void main (String[] args){
                //Declaracion de variables 
                
                Scanner Scanner = new Scanner(System.in);
                
                // Solicitar al usuario que ingrese el primer número
                System.out.print("Ingrese el primer número: ");
                double numero1 = Scanner.nextDouble();

                // Solicitar al usuario que ingrese el segundo número
                System.out.print("Ingrese el segundo número: ");
                double numero2 = Scanner.nextDouble();
                
               //verificar si ambos numero
               
               if ( numero1 > 0 && numero2 >0){
                   //calcule la suma de los numero 
                   double suma = numero1 + numero2;
               //imprima la suma
               
                   System.out.println("La suma de los dos numeros es:" + suma);
               } else{
                   System.out.println("Ambos numero deben ser positivos para calcular la suma");}
        }       
    }
