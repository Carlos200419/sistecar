/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 *  Desarrollar un algoritmo que al digitar dos número imprima la suma y si este es par o impar
 */
 
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EjN1_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Solicitar al usuario los dos números
        System.out.println(" Desarrollar un algoritmo que al digitar dos número imprima la suma y si este es par o impar");
        System.out.print("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = leer.nextInt();
        
        // Calcular la suma
        int suma = num1 + num2;
        int multi = num1*num2;
        
        // Imprimir la suma
        System.out.println("La suma de los dos números es: " + suma);
        System.out.println("La multiplicacion de los dos números es: " + multi);
        
        // Determinar si la suma es par o impar
        if (suma % 2 == 0) {
            System.out.println("La suma es un número par.");
        } else {
            System.out.println("La suma es un número impar.");
       
                
        }
    }
}
    

