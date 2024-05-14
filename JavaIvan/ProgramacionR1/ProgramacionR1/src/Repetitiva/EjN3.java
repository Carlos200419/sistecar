/*
 * Elaborar un algoritmo que imprima los números impares comprendidos entre 1 y 1000.
 */
package Repetitiva;

/**
 *
 * @author ivand
 */
public class EjN3 {
    public static void main(String[] args) {
    int i;
      i = 1;    
        // Utilizamos un bucle for para imprimir los números naturales del 1 al 100.
        while (i<= 20){
            if(i %2 !=0)//si el numero es par
            System.out.println(i);
            i = i + 1;
        }
               System.out.println("Fin del ciclo i: " + i );
    }
}
        
        
        
        
        
        
        /**
        
        for (int i=1; i <=1000; i++){
            if(i %2 !=0){
                System.out.println(i);
            }
        }
     }
}
*/