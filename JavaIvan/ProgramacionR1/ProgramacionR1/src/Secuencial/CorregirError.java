/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Secuencial;
import java.util.Scanner;

/**
 *
 * @author Ivan David Castro Jimenez
 */
public class CorregirError {
    public static void main(String[] args) {   
        // Declaracion de error
        double cel;
        double far;
       Scanner leer = new Scanner(System.in);
        
        //Entradas
        System.out.println("Digite la temperatura en grados celcius:");
        cel = leer.nextDouble();
        
        //Exprecion para el calculo
        far = cel * 1.8 + 32;
        
        //Salida
        System.out.println("La temperatura en grados farengeit es de" +far);
    }
}
