/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class EF {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1 = obtenerNumero("Digite el primer número", leer);
        int num2 = obtenerNumero("Digite el segundo número", leer);

        if (num1 <= 3 && num2 <= 3) {
            
            // Realiza la suma de los dos números
            int sumaDecimal = num1 + num2;

            // Convierte el resultado de la suma a binario
            String resultadoBinario = decimalABinario(sumaDecimal);

            // Muestra el resultado en decimal y binario
            System.out.println("El resultado de la suma en decimal es: " + sumaDecimal);
            System.out.println("El resultado de la suma en binario es: " + resultadoBinario);
            
        } else {
            System.out.println("Error: Los números deben ser menores o iguales a 3.");
        }
    }

    public static int obtenerNumero(String mensaje, Scanner leer) {
        int numero;
        while (true) {
            System.out.println(mensaje);
            if (leer.hasNextInt()) {
                numero = leer.nextInt();
                break;
            } else {
                System.out.println("Error: Debes ingresar un número entero válido.");
                leer.next(); // Limpiar el buffer del scanner

            }
        }
        return numero;
    }

    public static String decimalABinario(int numero) {
        // Convierte un número decimal a su representación binaria manualmente
        StringBuilder binario = new StringBuilder();
        while (numero > 0) {
            int residuo = numero % 2;
            binario.insert(0, residuo);
            numero = numero / 2;
        }
        return binario.toString();
    }
}

    
