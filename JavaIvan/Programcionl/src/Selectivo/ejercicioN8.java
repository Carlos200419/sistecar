/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selectivo;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class ejercicioN8 {
    public static void main(String[] args) {
        //Decalacracion de variable
        byte edad;
        short peso;
        float estatura;
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Diite edad");
        edad = leer.nextByte();
        System.out.println("Digite peso");
        peso = leer.nextShort();
        System.out.println("Digite estatura");
        estatura = leer.nextFloat();
        
        if (edad<18 && estatura>=1.8 && peso<=80)
            System.out.println("Si cumple las condiciones. Apto para jugar.");
        else
            System.out.println("No cumple con las condiciones.");
}
    }
