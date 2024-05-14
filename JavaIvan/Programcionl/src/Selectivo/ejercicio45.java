/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selectivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class ejercicio45 {
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar las cuatro notas al usuario
        System.out.println("Ingrese la primera nota: ");
        double nota1 = leer.nextDouble();

        System.out.println("Ingrese la segunda nota: ");
        double nota2 = leer.nextDouble();

        System.out.println("Ingrese la tercera nota: ");
        double nota3 = leer.nextDouble();

        System.out.println("Ingrese la cuarta nota: ");
        double nota4 = leer.nextDouble();

        // Calcular la nota definitiva promediando las cuatro notas
        double notafinal = (nota1 + nota2 + nota3 + nota4) / 4.0;

    }
}
