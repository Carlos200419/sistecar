/*
 *
 */
package Repetitivo;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Estudiantes {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int x,suma,valor,promedio;
        x=1;
        suma=0;
        while (x<=10) {
            System.out.print("Ingrese un valor:");
            valor=leer.nextInt();
            suma=suma+valor;
            x=x+1;
        }
        promedio=suma/10;
        System.out.print("La suma de los 10 valores es:");
        System.out.println(suma);
        System.out.print("El promedio es:");
        System.out.print(promedio);
    }
}
    
