/*
 *Elabore un algoritmo que calcule la nota definitiva de un estudiante a partir de las siguientes notas 
parciales que tienen, cada una, un valor en porcentaje: 
examen escrito (50%), 
trabajos (20%), 
qüices (20%) 
participación (10%), y averigüe si la nota definitiva es aprobatoria o no.
 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EjN13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        double ExamenE, taller, quiz, participacion, NotaD;
                
        System.out.println("NOTAS FINALES DEL ESTUDIANTE");
        System.out.println("Nota de examen escrito");
        ExamenE = leer.nextDouble();
        
        System.out.println("Nota del taller");
        taller = leer.nextDouble();
        
        System.out.println("Nota de quiz");
        quiz = leer.nextDouble();
        
        System.out.println("Nota de participacion");
        participacion = leer.nextDouble();
        
        NotaD = ExamenE * 0.5 + taller * 0.2 * quiz * 0.2 + participacion * 0.1;
        System.out.println("La Nota definitiva es"+ NotaD);
        
        if (NotaD>=6.0)
            System.out.println("El estudiante Aprobo");
        if (NotaD<=5.0)
            System.out.println("El estudiante Reprobo");
        
    }
}
