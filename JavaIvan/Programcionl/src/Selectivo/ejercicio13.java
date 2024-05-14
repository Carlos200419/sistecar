/*
 * Elabore un algoritmo que calcule la nota definitiva de un estudiante a partir de las siguientes notas 
parciales que tienen, cada una, un valor en porcentaje: examen escrito (50%), trabajos (20%), qüices 
(20%) y participación (10%), y averigüe si la nota definitiva es aprobatoria o no.
 */
package Selectivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class ejercicio13 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CALCULAR LA NOTA DEL ESTUDIANTE");
        System.out.print("Ingrese la nota del examen escrito: ");
        double examenEscrito = scanner.nextDouble();
        
        System.out.print("Ingrese la nota de los trabajos: ");
        double trabajos = scanner.nextDouble();
        
        System.out.print("Ingrese la nota de los quizes: ");
        double quizes = scanner.nextDouble();
        
        System.out.print("Ingrese la nota de la participación: ");
        double participacion = scanner.nextDouble();
        
        double notaDefinitiva = examenEscrito * 0.5 + trabajos * 0.2 + quizes * 0.2 + participacion * 0.1;
        
        System.out.println("La nota definitiva es: " + notaDefinitiva);
        
        if (notaDefinitiva >= 3.0) {
            System.out.println("El estudiante ha aprobado");
        } else {
        System.out.println("El estudiante ha reprobado.");
            
       }            
    }
}
