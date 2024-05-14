/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Secuencial;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class errores {
 public static void main(String[] args) {
        // Declaracion de error
        float cel;
        double far;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite los grados de la temperatura en celcius:");
        cel = leer.nextFloat();
        
        far = cel * 1.8 + 32;
        System.out.println("La temperatura en grados farengeit es:"+ far);
}
}