/*
 *   Elaborar un algoritmo que lea un número entero positivo y 
     obtenga todos los divisores del número leído.
 */
package Repetitiva;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EjN5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Digite el numero entero: ");
        int num = leer.nextInt();
        
        if (num>0){ // verificamos si el numero es positivo
            System.out.println("Los divisores de "+ num + "son: ");
            
            //Utilizamos un bucle  for para encontrar los divisores
            for (int i = 1; i<=num; i++){
            // Si el residuo de la divicion es cero, entoces i es un divisor
            if (num % i ==0){
                System.out.println(i);
            }
            }
        }else{
            System.out.println("El numero digitado no es valido. Debe ser positivo");
            
        }
    }
}
