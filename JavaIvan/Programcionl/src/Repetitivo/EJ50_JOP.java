/*
 //A los N estudiantes de un grupo de algoritmos se les dice que su nota definitiva será calculada a partir de cuatro 
notas parciales que tendrán los siguientes valores: 25% cada una si todas son aprobadas; si la primera se pierde y las 
otras se ganan, la primera valdrá 10% y las otras 30% c/u; si las dos primeras se pierden y las dos últimas se ganan, 
las dos primeras valdrán 20% c/u y las dos últimas valdrán 30% c/u; en cualquier otro caso las dos primeras tendrán 
un valor de 30% c/u y las otras dos 20% c/u.
A usted se le pide que elabore un algoritmo que permita calcular la nota definitiva de cada uno de los estudiantes del 
grupo y provea además lo siguiente:
* Número de estudiantes con nota definitiva mayor que 4.
* Número de estudiantes que no aprobaron.
* Nota definitiva promedio del grupo
* Nota definitiva máxima.

 */
package Repetitivo;
import javax.swing.JOptionPane;
/**
 *
 * @author ivand
 */
public class EJ50_JOP {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de estudiantes:"));

        int ENM4 = 0;   //estudiantesNotaMayor4
        int ENA = 0;   // estudiantesNoAprobados
        double SN = 0; //sumaNotas
        double NM = 0; //notaMaxima

        for (int i = 0; i < N; i++) {
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota 1 (de 0 a 5):"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota 2 (de 0 a 5):"));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota 3 (de 0 a 5):"));
            double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota 4 (de 0 a 5):"));

            double nf = calcularNotaFinal(nota1, nota2, nota3, nota4); 
            SN += nf;

            if (nf > 4) {
                ENM4++; //ESTUDIANTE NOTA MAYOR A 4
            }

            if (nf < 3) {
                ENA++; //ESTUDIANTE NO APROBADO
            }

            if (nf > NM) {
                NM = nf;
            }

            JOptionPane.showMessageDialog(null, "Nota definitiva del estudiante " + (i + 1) + ": " + nf);
        }

        double NP = SN / N;

        JOptionPane.showMessageDialog(null, "Número de estudiantes con nota definitiva mayor que 4: " + ENM4 +
                "\nNúmero de estudiantes que no aprobaron: " + ENA + //ESTUDIATES NO APROBADOS
                "\nNota definitiva promedio del grupo: " + NP + //NOTA PROMEDIO
                "\nNota definitiva máxima: " + NM); //NOTA MAXIMA
    }

    public static double calcularNotaFinal(double nota1, double nota2, double nota3, double nota4) {
        if (nota1 >= 3 && nota2 >= 3 && nota3 >= 3 && nota4 >= 3) {
            return (nota1 + nota2 + nota3 + nota4) * 0.25;
            
        } else if (nota1 < 3 && nota2 >= 3 && nota3 >= 3 && nota4 >= 3) {
            return (nota1 * 0.1 + nota2 * 0.3 + nota3 * 0.3 + nota4 * 0.3);
            
        } else if (nota1 < 3 && nota2 < 3 && nota3 >= 3 && nota4 >= 3) {
            return (nota1 * 0.2 + nota2 * 0.2 + nota3 * 0.3 + nota4 * 0.3);
            
        } else if (nota1 >= 3 && nota2 >= 3 && nota3 < 3 && nota4 < 3) {
            return (nota1 * 0.3 + nota2 * 0.3 + nota3 * 0.2 + nota4 * 0.2);
            
        } else {
            return (nota1 * 0.3 + nota2 * 0.3 + nota3 * 0.2 + nota4 * 0.2);
        }
    }
}
    