/*
 *Elaborar un algoritmo que imprima la suma de los primeros N números pares positivos.
 */
package Repetitiva;

import java.util.Scanner;



/**
 *
 * @author ivand
 */
public class EjN8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 2;
        int suma = 0;

        System.out.println("Digite el numero entero: ");
        int n = leer.nextInt();

        while (contador <= n) {
            System.out.print(contador + " , ");
            suma += contador;
            contador += 2;
        }

        System.out.println("La suma de los números pares es igual a: " + suma);

    }
}



/**
for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
           
  */

