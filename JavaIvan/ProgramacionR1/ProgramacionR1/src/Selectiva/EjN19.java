/*
 * Elabore un algoritmo que lea dos números e imprima el cociente entre el primero y el segundo. Si el 
segundo es cero no ejecute el caso sino que muestre el mensaje: ‘la división no es posible’.

 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EjN19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Digite la nota del examen escrito (50%): ");
        double examenE = leer.nextDouble();

        System.out.print("Digite la nota de los trabajos (20%): ");
        double trabajos = leer.nextDouble();

        System.out.print("Digite la nota de los quices (20%): ");
        double quices = leer.nextDouble();

        System.out.print("Digite la nota de participación (10%): ");
        double participacion = leer.nextDouble();

       
        double NotaD = (examenE * 0.5) + (trabajos * 0.2) + (quices * 0.2) + (participacion * 0.1);

        
        System.out.println("La definitiva del estudiante es: " + NotaD);

        if (NotaD >= 3.0) {
            System.out.println("El estudiante aprobó.");
        } else {
            System.out.println("El estudiante reprobó.");
       }
    }
    
}
