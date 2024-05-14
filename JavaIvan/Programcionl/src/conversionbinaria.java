
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class conversionbinaria {
     public static void main(String[] args) {
     long numero, aux, digito, decimal;
     int exponente;
     boolean esBinario;
     Scanner entrada = new Scanner(System.in);
     //entrada
     do {
     System.out.print("Introduce un numero binario: ");
     numero = entrada.nextLong();
         
    esBinario = true;
    aux = numero;
    while (aux != 0) {
    digito = aux % 10; 
    if (digito != 0 && digito != 1) { 
    esBinario = false;
                     }
    aux = aux / 10;                       
    }
    } while (!esBinario); 
    exponente = 0;
     decimal = 0; 
     while (numero != 0) {
               
    digito = numero % 10;
                                         
    decimal = decimal + digito * (int) Math.pow(2, exponente);
              
    exponente++;
               
    numero = numero / 10;
      }
      System.out.println("Decimal: " + decimal);
    }
    }
