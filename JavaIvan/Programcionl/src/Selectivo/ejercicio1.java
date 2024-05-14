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
public class ejercicio1 {
    public static void main(String[] args) {
        //Decalacracion de variable
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite numero:");
        num = leer.nextInt(); //pido el numero
        
        if(num%2==0)
            System.out.println("par");
        else
            System.out.println("impar");
    }
    
}
