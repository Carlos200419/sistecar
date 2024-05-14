/*
 //En un grupo de N estudiantes se tomaron las siguientes notas parciales que tienen, cada una, un valor en 
porcentaje: examen escrito (50%), trabajos (20%), qüices (20%) y participación (10%). Elabore un algoritmo que lea el 
código y las calificaciones parciales de los estudiantes y calcule e imprima:
· La nota definitiva de cada estudiante y un mensaje indicando si aprobó o no.
· Número de estudiantes con calificación inferior a 2.
· Número de estudiantes con calificación superior a 4.
· Nota promedio del grupo.
· Código del estudiante que obtuvo la nota definitiva más alta y su nota.
 */
package Repetitivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class Ejercicio31R {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Numeros de estudiantes (N): ");
        int NumeroAlumnos = leer.nextInt();

        double maximaCalificacion = -1; // Variable para mantener el seguimiento de la nota máxima
        int codigoAlumnoMaxima = 0; // Variable para mantener el seguimiento del código del estudiante con la nota máxima
        int estudiantesCalifInferior2 = 0; // Contador de estudiantes con calificación inferior a 2
        int estudiantesCalifSuperior4 = 0; // Contador de estudiantes con calificación superior a 4
        double sumaCalificaciones = 0; // Variable para mantener la suma de las notas de todos los estudiantes
     
                
        int i = 0;
        while (i < NumeroAlumnos) {
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.print("Código del estudiante: ");
            int codigoAlumno = leer.nextInt();
            
            System.out.print("Calificación examen escrito (50%): ");
            double califParcialEscrito = leer.nextDouble();
            
            System.out.print("Calificación trabajos (20%): ");
            double califTrabajos = leer.nextDouble();
            
            System.out.print("Calificación quices (20%): ");
            double califQuices = leer.nextDouble();
            
            System.out.print("Calificación participación (10%): ");
            double califParticipacion = leer.nextDouble();

            // Calcular la nota definitiva
            double notaDefinitiva = (califParcialEscrito * 0.5) + (califTrabajos * 0.2) + (califQuices * 0.2) + (califParticipacion * 0.1);
            
            // Verificar si el estudiante aprobó o no
            String resultado = (notaDefinitiva >= 3.0) ? "Aprobado" : "Reprobado";

            // Actualizar las estadísticas
            sumaCalificaciones += notaDefinitiva;
            if (notaDefinitiva < 2.0) {
                estudiantesCalifInferior2++;
            }
            if (notaDefinitiva > 4.0) {
                estudiantesCalifSuperior4++;
            }
            if (notaDefinitiva > maximaCalificacion) {
                maximaCalificacion = notaDefinitiva;
                codigoAlumnoMaxima = codigoAlumno;
            }

            // Imprimir la nota definitiva y el resultado
            System.out.println("Nota definitiva: " + notaDefinitiva + " (" + resultado + ")");
            i++;
        }

        // Calcular la nota promedio del grupo
        double calificacionPromedio = sumaCalificaciones / NumeroAlumnos;

        // Imprimir las estadísticas finales
        System.out.println("Cantidad de alumnos con calificación inferior a 2: " + estudiantesCalifInferior2);
        System.out.println("Cantidad de estudiantes con calificación superior a 4: " + estudiantesCalifSuperior4);
        System.out.println("Calificación promedio del grupo: " + calificacionPromedio);
        System.out.println("Código del alumno con la calificación máxima: " + codigoAlumnoMaxima);
        System.out.println("Calificación Máxima: " + maximaCalificacion);
    }
}
    
