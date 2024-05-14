/*
 *  Elaborar un algoritmo que imprima la suma de los primeros N números naturales.
 */
package Repetitiva;

import java.util.Scanner;

/**
 *
 * @author ivand
 */
public class EjN7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i, suma;

        System.out.println("Digite el numero");
        n = leer.nextInt();

        i = 1;
        suma = 0;
        while (i <= n) {
            suma = suma + i;
        i += 1;

    }

    System.out.println (

"La suma es: "+ suma);
    }
}
    
     
      /**
       * // Solicitamos al usuario que ingrese el valor de N
        String input = JOptionPane.showInputDialog("Ingrese el valor de N:");
        
        try {
            int N = Integer.parseInt(input);

            // Calculamos la suma de los primeros N números naturales
            int suma = calcularSumaNumerosNaturales(N);

            // Mostramos la suma usando JOptionPane
            JOptionPane.showMessageDialog(null, "La suma de los primeros " + N + " números naturales es: " + suma);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero válido.");
        }
    }

    // Función para calcular la suma de los primeros N números naturales
    public static int calcularSumaNumerosNaturales(int N) {
        // Utilizamos la fórmula de la suma de los primeros N números naturales: (N * (N + 1)) / 2
        return (N * (N + 1)) / 2;
    }
}
 */