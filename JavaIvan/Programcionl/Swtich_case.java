/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Selectiva;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Swtich_case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char vocal;
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una vocal: ");
        vocal = leer.next().charAt(0);
         
        switch(vocal){
            case 'a': System.out.println("Ana");break;
            case 'e': System.out.println("Esteban");break;
            case 'i': System.out.println("Ichigo");break;
            case 'o': System.out.println("Oscar");break;
            case 'u': System.out.println("Ulises");break;
            default: System.out.println("No es una vocal: ");
        }
    }
    
}
