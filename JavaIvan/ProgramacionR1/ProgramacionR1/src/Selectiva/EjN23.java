/*
 * 
 *Elabore un algoritmo que lea tres números (A, B y C) y diga cuál es el mayor.
 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EjN23 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double A, B, C;
        
        System.out.println("Digite el primer numero A");
        A = leer.nextDouble();
        
        System.out.println("Digite el segundo numero B");
        B = leer.nextDouble();
        
        System.out.println("Digite el tercer numero C");
        C = leer.nextDouble();
        
        
        if (A>B && A>C){
            System.out.println("El numero mayor es" + A);
        }else if (B>A && B>C) {
            System.out.println("El numero mayor es" + B);
        } else {
            System.out.println("El numero mayor es" + C);
        }
    }
}
