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
public class pq00 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número
        System.out.print("Por favor, ingrese un número: ");
        double numero = scanner.nextDouble();
        
        // Comprobar si el número es positivo o negativo
        if (numero >= 0) {
            // El número es positivo, calcular y mostrar su cubo
            double cubo = Math.pow(numero, 3);
            System.out.println("El cubo de " + numero + " es: " + cubo);
        } else {
            // El número es negativo, calcular y mostrar su cuadrado
            double cuadrado = Math.pow(numero, 2);
            System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        }
    }
}
