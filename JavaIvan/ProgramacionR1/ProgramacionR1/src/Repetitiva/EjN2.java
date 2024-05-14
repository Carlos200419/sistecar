/*
 *  Elaborar un algoritmo que imprima los números pares comprendidos entre 1 y 1000.
 */
package Repetitiva;

/**
 *
 * @author ivand
 */
public class EjN2 {
    public static void main(String[] arg) {
     int i;
      i = 1;    
        // Utilizamos un bucle for para imprimir los números naturales del 1 al 100.
        while (i<= 1000){
            if (i % 2 == 0)//si el numero es par
            System.out.println(i);
            i++;
        }
               System.out.println("Fin del ciclo i"+ i);
    }
}
