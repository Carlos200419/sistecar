/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programasjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class areatriangulo {
    public static void main(String[] args){
    
    float base, altura, area;
        Scanner leer = new Scanner (System.in);
        
        System.out.println("digite el valor de la altura: ");
        altura = leer.nextFloat();
        System.out.println("digite el valor de la base: ");
        base = leer.nextFloat();
        area = base*altura/2;
        
        System.out.println("el area es: " + area);
}
}