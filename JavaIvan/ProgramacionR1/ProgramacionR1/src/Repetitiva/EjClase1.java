/*
 *
 */
package Repetitiva;

import java.util.Scanner;

/**
 *
 * @author ivand
 */
public class EjClase1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Digite numero de personas a registrar: ");
        int numeroPersonas = leer.nextInt();

        int HS = 0; // hombres soltero
        int MC = 0; // mujeres casadas
        int TMS = 0; // total mujeres solteras
        int EMS = 0; // edad mujeres solteras
        int HV = 0; // hombres viudos
        int HDM30 = 0; // hombresDivorciadosMenores30
        int MSE20y28 = 0; // mujeresSolterasEntre20y28

        for (int i = 0; i < numeroPersonas; i++) {
            
            System.out.print("Nombre: ");
            String nombre = leer.next();
            
            System.out.print("Edad: ");
            int edad = leer.nextInt();
            
            System.out.print("Sexo (1. Masculino, 2. Femenino): ");
            int sexo = leer.nextInt();
            
            System.out.print("Digite estado civil (1. Soltero, 2. Casado, 3. Divorciado, 4. Viudo, 5. Otros): ");
            int estadoCivil = leer.nextInt();

            if (sexo == 1) { // Hombre
                if (estadoCivil == 1) { // Soltero
                    HS++;
                } else if (estadoCivil == 4) { // Viudo
                    HV++;
                } else if (estadoCivil == 3 && edad < 30) { // Divorciado y menor de 30 años
                    HDM30++;
                }
            } else if (sexo == 2) { // Mujer
                if (estadoCivil == 2) { // Casada
                    MC++;
                } else if (estadoCivil == 1) { // Soltera
                    TMS++;// total de mujeres soltesras 
                    EMS += edad; // suma de mujeres solteras
                    if (edad >= 20 && edad <= 28) { // Edades entre 20 y 28 años
                        MSE20y28++;
                    }
                }
            }
        }

        double promedioEdadMujeresSolteras = TMS > 0 ? (double) EMS / TMS : 0;
        double porcentajeHombresViudos = (double) HV / numeroPersonas * 100;

        System.out.println("Numero de hombres solteros: " + HS);
        System.out.println("Numero de mujeres casadas: " + MC);
        System.out.println("Promedio de edad de las mujeres solteras: " + promedioEdadMujeresSolteras);
        System.out.println("Porcentaje de hombres viudos: " + porcentajeHombresViudos + "%");
        System.out.println("Numero de hombres divorciados menores de 30 años: " + HDM30);
        System.out.println("Numero de mujeres solteras entre 20 y 28 años: " + MSE20y28);
    }
}
