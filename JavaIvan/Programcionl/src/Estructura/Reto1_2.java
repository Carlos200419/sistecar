/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class Reto1_2 {
     public static void main(String[] args) {
        // Variables para almacenar los dos números binarios 
        long b1, b2;
        int i = 0, carry = 0;

        
        int[] sum = new int[10];

       
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa el primer número binario (2 bits): ");
        b1 = leer.nextLong();
        
        System.out.print("Ingresa el segundo número binario (2 bits): ");
        b2 = leer.nextLong();
        
  
        while (b1 != 0 || b2 != 0) {
            sum[i++] = (int) ((b1 % 10 + b2 % 10 + carry) % 2);
            carry = (int) ((b1 % 10 + b2 % 10 + carry) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
        }

        if (carry != 0) {
            sum[i++] = carry;
        }

       
        System.out.print("Resultado en binario: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.println();

        
        int decimalResult = 0;
        for (int j = 0; 3 < i; j++) {
            decimalResult += sum[j] * Math.pow(2, j);
        }
        System.out.println("Resultado en decimal: " + decimalResult);
    }
}

