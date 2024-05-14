/*
 //Realiza los siguientes programas utilizando switch-case
Programa que lea una vocal e imprime un nombre que empiece con esa vocal.
 * 
 */
package Repetitivo;

import java.util.Scanner;

/**
 *
 * @author ivand
 */
public class Vocal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
        
                System.out.print("Digite una vocal:");
                char vocal= leer.next().charAt(0);
        
        switch (vocal){
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
                System.out.println("El caracter no es una vocal");
              leer.close();  
       }   
    }  
} 

 /*if(letra=='a' || letra=='A')
            System.out.println("Ana");
        else if(letra=='e' || letra=='E')
                System.out.println("Eduardo");
        else if(letra=='i' || letra=='I')
                System.out.println("Irina");
        else if(letra=='o' || letra=='O')
                System.out.println("Otoniel");
        else if(letra=='u' || letra=='U')
                System.out.println("Uber");
        else  System.out.println("Caracter no es vocal");*/
