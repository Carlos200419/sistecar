/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Elabore un algoritmo que calcule el área y el volumen de un cubo, a partir de la longitud de sus lados.
//Área del cubo = 6l2
 //Volumen del cubo = l3
package Secuencial;
import java.util.Scanner;
/**
 *
 * @author1 Ivan David Castro Jimenez
 * @author2 Wender Felipe Botero Consuegra
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double area, volumen;
        System.out.println("EJERCICIO PROPUESTO N.22 ");
        System.out.print("Ingrese la longitud del lado del cubo: ");
        double lado = leer.nextDouble();

        area = 6 * lado * lado;
        volumen = lado * lado * lado;

        System.out.println("El área del cubo es: " + area);
        System.out.println("El volumen del cubo es: " + volumen);
    }
}