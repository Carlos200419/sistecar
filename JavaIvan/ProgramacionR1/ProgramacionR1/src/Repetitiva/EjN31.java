/*
 * En un grupo de N estudiantes se tomaron las siguientes notas parciales que tienen, cada una, un valor en 
porcentaje: examen escrito (50%), trabajos (20%), qüices (20%) y participación (10%). Elabore un algoritmo que lea el 
código y las calificaciones parciales de los estudiantes y calcule e imprima:
· La nota definitiva de cada estudiante y un mensaje indicando si aprobó o no.
· Número de estudiantes con calificación inferior a 2.
· Número de estudiantes con calificación superior a 4.
· Nota promedio del grupo.
· Código del estudiante que obtuvo la nota definitiva más alta y su nota.
 */
package Repetitiva;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class EjN31 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de estudiantes: ");
        int numEstudiantes = leer.nextInt();
        
        int estudiantesInferiorDos = 0;
        int estudiantesSuperiorCuatro = 0;
        double sumaNotas = 0;
        double notaMaxima = 0;
        int codigoMaximo = 0;

        for (int i = 1; i <= numEstudiantes; i++) {
            System.out.println("\nEstudiante " + i + ":");
            System.out.print("Ingrese el código del estudiante: ");
            int codigo = leer.nextInt();
            
            System.out.print("Ingrese la nota del examen escrito (50%): ");
            double examenEscrito = leer.nextDouble();
            
            System.out.print("Ingrese la nota de los trabajos (20%): ");
            double trabajos = leer.nextDouble();
            
            System.out.print("Ingrese la nota de los quices (20%): ");
            double quices = leer.nextDouble();
            
            System.out.print("Ingrese la nota de la participacion (10%): ");
            double participacion = leer.nextDouble();

            double notaDefinitiva = (examenEscrito * 0.5) + (trabajos * 0.2) + (quices * 0.2) + (participacion * 0.1);
            sumaNotas += notaDefinitiva;

            if (notaDefinitiva < 2) {
                estudiantesInferiorDos++;
            } else if (notaDefinitiva > 4) {
                estudiantesSuperiorCuatro++;
            }

            if (notaDefinitiva > notaMaxima) {
                notaMaxima = notaDefinitiva;
                codigoMaximo = codigo;
            }

            System.out.println("Nota definitiva: " + notaDefinitiva);
            if (notaDefinitiva >= 3) {
                System.out.println("¡Estudiante aprobado!");
            } else {
                System.out.println("Estudiante reprobado");
            }
        }

        double promedioGrupo = sumaNotas / numEstudiantes;

        System.out.println("\nNumero de estudiantes con calificacion inferior a 2: " + estudiantesInferiorDos);
        System.out.println("Numero de estudiantes con calificacion superior a 4: " + estudiantesSuperiorCuatro);
        System.out.println("Nota promedio del grupo: " + promedioGrupo);
        System.out.println("Codigo del estudiante con la nota mas alta: " + codigoMaximo);
        System.out.println("Nota mas alta: " + notaMaxima);
    }
}
