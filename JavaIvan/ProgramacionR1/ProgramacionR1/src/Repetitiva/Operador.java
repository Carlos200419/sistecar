/*
 * 
 */
package Repetitiva;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Operador {
    public static void main(String[] args) {
        int n1, n2;
        char operador;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Digite primer numeros: ");
        n1 = leer.nextInt();
        System.out.print("Digite segundo numeros: ");
        n2 = leer.nextInt();
        System.out.print("Digite un operador (*, +, - , /): ");
        operador = leer.next().charAt(0); //se pide un char
        
        switch(operador){
            case '*': 
                        System.out.println("la multiplicacion es: " + (n1*n2));
                        break;
            case '+': 
                        System.out.println("la suma es: " + (n1+n2));
                        break;
            case '-':
                        System.out.println("la resta es: " + (n1-n2));
                        break;
            case '/': 
                       System.out.println("la division es: " + (n1/n2)); 
                       break;
            default: System.out.println("Operador no valido");
        }
        
        /*if(operador=='*')
            System.out.println("la multiplicacion es: " + (n1*n2));
        else if(operador=='+')
            System.out.println("la suma es: " + (n1+n2));
        else if(operador=='-')
            System.out.println("la resta es: " + (n1-n2));
        else if(operador=='/')
            System.out.println("la division es: " + (n1/n2));
        else System.out.println("Operador no valido");*/
        
    }
}
