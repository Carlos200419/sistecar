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
import javax.swing.JOptionPane;
/**
 *
 * @author ivand
 */
public class EJ31_JOP {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de estudiantes:"));

        double NM = 0;    //notaMaxima 
        String CM = "";  //codigoMaxima 
        int ENI2 = 0;     //estudiantesNotaInferior2 
        int ENS4 = 0;    //estudiantesNotaSuperior4 
        double SN = 0;  //sumaNotas 

        for (int i = 0; i < N; i++) {
            String codigoEstudiante = JOptionPane.showInputDialog("Ingrese código del estudiante:");
            double notaParcial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del parcial escrito (%):"));
            double notaTalleres = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de talleres (%):"));
            double notaQuis = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de quices (%):"));
            double notaParticipativa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de participación (%):"));

            // Calcula la nota final del estudiante
            double notaDefinitiva = (notaParcial * 0.5) + (notaTalleres * 0.2) + (notaQuis * 0.2) + (notaParticipativa * 0.1);

            // Verifica si el estudiante aprobó o no
            String mensajeAprobacion = notaDefinitiva >= 3 ? "Aprobado" : "Reprobado";

            // Actualiza las estadísticas
            if (notaDefinitiva < 2) { //Nota final
                ENI2++;
            } else if (notaDefinitiva > 4) {
                ENS4++;
            }

            // Calcula la nota promedio del grupo
            SN += notaDefinitiva;

            // Actualiza la información de la nota máxima y su código
            if (notaDefinitiva > NM) {
                NM = notaDefinitiva;
                CM = codigoEstudiante;
            }

            JOptionPane.showMessageDialog(null, "Código del estudiante: " + codigoEstudiante +
                    "\nNota Definitiva: " + notaDefinitiva + "\n" + mensajeAprobacion);
        }
         // NOTA PROMEDIO = SUMA NOTAS / N
        double NP = SN / N;

        JOptionPane.showMessageDialog(null, "Número de estudiantes con calificación inferior a 2: " + ENI2 +
                "\nNúmero de estudiantes con calificación superior a 4: " + ENS4 +
                "\nNota promedio del grupo: " + NP +
                "\nCódigo del estudiante con la nota más alta: " + CM +
                "\nNota más alta: " + NM);
    }
}


