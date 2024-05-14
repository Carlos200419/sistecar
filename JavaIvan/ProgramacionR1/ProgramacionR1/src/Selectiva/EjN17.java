/*
 *  Elabore un algoritmo que lea dos números e imprima la diferencia entre el primero y el segundo si por 
lo menos uno es positivo. De lo contrario, imprima su cociente.
 */
package Selectiva;

import java.util.Scanner;

/**
 *
 * @author ivand
 */
public class EjN17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Digite el primer numero");
        double num1 = leer.nextDouble();

        System.out.println("Digite el segundo numero");
        double num2 = leer.nextDouble();

        if (num1 > 0 || num2 > 0) {

            double diferencia = num1 - num2;
            System.out.println("La diferemcia entre los numeros es" + diferencia);

        } else {
            if (num2 != 0) {
                double cociente = num1 / num2;

                System.out.println("El cociente es" + cociente);
            }
        }
    }
}
