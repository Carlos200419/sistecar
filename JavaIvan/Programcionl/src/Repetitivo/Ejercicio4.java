/*
 * //4. Elaborar un algoritmo que lea un número entero positivo y obtenga los múltiplos de 3 comprendidos entre 3 y el 
//número leído.
 */
package Repetitivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Leer un número entero positivo
        System.out.print("Ingrese un número entero positivo: ");
        int numero = leer.nextInt();
        
        // Comprobar si el número es positivo
        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
        } else {
            System.out.println("Múltiplos de 3 entre 3 y " + numero + ":");
            int i = 3;
            while (i <= numero) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
              i++;
            }
        }

    }
    
}
