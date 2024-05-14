/*
 Elabore un algoritmo que convierta una cantidad de dinero dada en dolares (E.U.) a su equivalente en
pesos colombianos. Nota: desprecie los centavos de la moneda colombian
 */
package Secuencial;

import java.util.Scanner; // Debo importar esta libreria

/**
 *
 * @author ivand
 */
public class CalculoArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variable
        double pesos, dolares;
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Digite un valor en pesos colombianos: ");
        pesos = leer.nextDouble(); // pedir al usuario
        dolares = pesos/4600; //expresion para convertir pesos a dolares
        System.out.print("Los dolares son: "+dolares); // muestro el resultado
    }
    
}
