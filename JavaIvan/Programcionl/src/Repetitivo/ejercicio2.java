/*
 * //2. Elaborar un algoritmo que imprima los números pares comprendidos entre 1 y 1000
 */
package Repetitivo;

/**
 *
 * @author Ing. Yeneris Blanco
 */
public class ejercicio2 {
    public static void main(String[] args) {
        int i;
        i = 1;
        while(i<=1000){
            if(i%2==0)
                System.out.println("i=" + i);
            i=i+1;
        }
        System.out.println("Fin de ciclo i=" + i);
       
    }
    
}
