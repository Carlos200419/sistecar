/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
 // Elabore un algoritmo que calcule la nota definitiva de un estudiante a partir de las siguientes notas
 //parciales que tienen, cada una, un valor en porcentaje: examen escrito (50%), trabajos (20%), quices
 //(20%) y participación (10%).
 
package Selectivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class ejercicio19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
       

        // ingrese las notas parciales 
        System.out.print("Digite la nota del examen escrito (50%): ");
        double examenEscrito = leer.nextDouble();

        System.out.print("Digite la nota de los trabajos (20%): ");
        double trabajos = leer.nextDouble();

        System.out.print("Digite la nota de los quices (20%): ");
        double quices = leer.nextDouble();

        System.out.print("Digite la nota de participación (10%): ");
        double participacion = leer.nextDouble();

       
        double notaDefinitiva = (examenEscrito * 0.5) + (trabajos * 0.2) + (quices * 0.2) + (participacion * 0.1);

        
        System.out.println("La definitiva del estudiante es: " + notaDefinitiva);

        if (notaDefinitiva >= 3.0) {
            System.out.println("El estudiante aprobó.");
        } else {
            System.out.println("El estudiante reprobó.");
       }
    }
}
    
    

