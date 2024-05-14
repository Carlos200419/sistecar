/*
 //Elaborar un algoritmo que lea el nombre, la edad, el sexo (1. masculino y 2. femenino) y el estado civil (1. Soltero, 
2. Casado, 3. Divorciado, 4. Viudo, 5. Otros) de N personas y calcule e imprima:
· Número de hombres solteros.
· Número de mujeres casadas.
· Promedio de edad de las mujeres solteras.
· Porcentaje de hombres viudos.
· Número de hombres divorciados menores de 30 años.
· Numero de mujeres solteras con edades entre 20 y 28 años.

 */
package Repetitivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class Ejercicio29R {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int MenSolteros = 0;
        int WomCasadas = 0;
        int totalMujeresSolteras = 0;
        int edadMujeresSolteras = 0;
        int MenViudos = 0;
        int MenDivorciadosMenores30 = 0;
        int WomSolterasEntre20y28 = 0;

        System.out.print("Cantidad de personas (N): ");
        int N = leer.nextInt();

        int i = 0;
        while (i < N) {
            System.out.println("Persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = leer.next();
            System.out.print("Edad: ");
            int edad = leer.nextInt();
            System.out.print("Sexo (1. Masculino, 2. Femenino): ");
            int sexo = leer.nextInt();
            System.out.print("Estado Civil (1. Soltero, 2. Casado, 3. Divorciado, 4. Viudo, 5. Otros): ");
            int estadoCivil = leer.nextInt();

            if (sexo == 1) { // Hombre
                if (estadoCivil == 1) { // Soltero
                   MenSolteros++;
                } else if (estadoCivil == 4) { // Viudo
                   MenViudos++;
                } else if (estadoCivil == 3 && edad < 30) { // Divorciado menor de 30
                    MenDivorciadosMenores30++;
                }
                
            } else if (sexo == 2) { // Mujer
                if (estadoCivil == 2) { // Casada
                    WomCasadas++;
                    
                } else if (estadoCivil == 1 && edad >= 20 && edad <= 28) { // Soltera entre 20 y 28
                    totalMujeresSolteras++;
                    edadMujeresSolteras += edad;
                }
            }
            i++;
        }

        System.out.println("Número de hombres solteros: " + MenSolteros);
        System.out.println("Número de mujeres casadas: " + WomCasadas);

        if (totalMujeresSolteras > 0) {
            double promedioEdadWomSolteras = (double) edadMujeresSolteras / totalMujeresSolteras;
            System.out.println("Promedio de edad de las mujeres solteras: " + promedioEdadWomSolteras);
        } else {
            System.out.println("No hay mujeres solteras en el rango de edad especificado.");
        }

        double porcentajeHombresViudos = (MenViudos * 100.0) / N;
        System.out.println("Porcentaje de hombres viudos: " + porcentajeHombresViudos + "%");
        System.out.println("Número de hombres menores de 30 años divorciados: " + MenDivorciadosMenores30);
        System.out.println("Número de mujeres solteras entre 20 y 28 años: " + totalMujeresSolteras);
    }
}
    

