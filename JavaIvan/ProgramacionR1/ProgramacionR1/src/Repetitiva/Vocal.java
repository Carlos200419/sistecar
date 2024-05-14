/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repetitiva;
import java.util.Scanner;


/**
 *
 * @author Estudiantes
 */
public class Vocal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Digite una vocal:");
        char vocal = leer.next().charAt(0);

        switch (vocal) {
            case 'a':
            case 'A':
                System.out.println("Ana");
                break;
            case 'e':
            case 'E':
                System.out.println("Elianis");
                break;
            case 'i':
            case 'I':    
                System.out.println("Ivan");
            case 'o':
            case 'O':    
                System.out.println("Orlando");
                break;
            default:
                System.out.println("No imprima nombre con esa vocal");
                
                
                leer.close();
        }
    }
}
