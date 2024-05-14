/*
 * N6
 */
package Repetitivo;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class EjercicioR1 {
          public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitamos al usuario que ingrese la cantidad de números primos que desea encontrar
        System.out.print("Ingrese la cantidad de números primos que desea encontrar: ");
        int n = leer.nextInt();

        int count = 0; // Contador para llevar la cuenta de cuántos números primos se han encontrado
        int num = 2; // Comenzamos con el primer número primo, que es 2

        // Iteramos hasta encontrar los primeros N números primos
        while (count < n) {
            if (esPrimo(num)) { // Verificamos si el número actual es primo
                System.out.print(num + ", ");
                count++;
            }
            num++; // Pasamos al siguiente número
        }

        leer.close();
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // 1 y números negativos no son primos
        }
        // Iteramos desde 2 hasta la raíz cuadrada del número para verificar si tiene divisores
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si el número es divisible por algún otro número, no es primo
            }
        }
        return true; // Si no se encontraron divisores, el número es primo
    }
}
        

