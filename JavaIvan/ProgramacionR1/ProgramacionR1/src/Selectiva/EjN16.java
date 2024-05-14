/*
 * Elabore un algoritmo que lea dos números e imprima la suma si los dos números son positivos.
 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EjN16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        
        int suma = num1 +  num2;
        System.out.println("La suma de los dos numero es"+ suma);
        
    }
    
}
