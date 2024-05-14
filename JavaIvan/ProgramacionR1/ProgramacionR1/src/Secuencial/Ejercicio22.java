/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Secuencial;
import java.util.Scanner;
/**
 *
 * @author1 Ivan David Castro Jimenez
 * @author2 Wender Felipe Botero Consuegra
 * 
 */

public class Ejercicio22 {
  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double yardas, pulgadas, centimetros, metros;
                
      
        System.out.print("Ingrese la medida en pies: ");
        double pies = leer.nextDouble();

         yardas = pies / 3;
         pulgadas = pies * 12;
         centimetros = pulgadas * 2.54;
         metros = centimetros / 100;

        System.out.println("La medida en yardas es: " + yardas);
        System.out.println("La medida en pulgadas es: " + pulgadas);
        System.out.println("La medida en centímetros es: " + centimetros);
        System.out.println("La medida en metros es: " + metros);
    }
}
