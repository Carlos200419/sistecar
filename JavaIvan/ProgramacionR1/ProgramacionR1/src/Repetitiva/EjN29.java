/*
 * Elaborar un algoritmo que lea el nombre, la edad, el sexo 
(1. masculino y 2. femenino) y el estado civil (1. Soltero, 2. Casado, 3. Divorciado, 4. Viudo, 5. Otros) de N personas y calcule e imprima:
· Número de hombres solteros.
· Número de mujeres casadas.
· Promedio de edad de las mujeres solteras.
· Porcentaje de hombres viudos.
· Número de hombres divorciados menores de 30 años.
· Numero de mujeres solteras con edades entre 20 y 28 años.
 */
package Repetitiva;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class EjN29 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int HS = 0;
        int MC = 0;
        int MS = 0;
        System.out.println("Digite su nombre:");
        String nom = leer.next();

        System.out.println("Digite su edad: ");
        byte edad = leer.nextByte();

        System.out.println("Digite su sexo M/F: ");
        int sexo = leer.nextInt();

        System.out.println("Digite su estado civil C/S: ");
        char estado = leer.next().charAt(0);

        if (sexo == 1 && estado == HS) {
            HS = HS + 1;
        }
        if (sexo == 2 && estado == MC) {
            MC = MC + 1;
        }
        byte sumaedad = 0;
        if (sexo == 2 && estado == MS) {
            sumaedad = (byte) (sumaedad + edad);
            MS = MS + 1;
        }

    }
}
