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
public class dolar {
    public static void main(String[] args) {
    
    float dolar, pesos;
    Scanner leer = new Scanner(System.in);
    
    System.out.print("digite la cantidad de la cantidad de dolares: ");
    dolar = leer.nextFloat();
    
    pesos = dolar*4000;
    
    System.out.print("son " + pesos + "pesos");
    
}
}
