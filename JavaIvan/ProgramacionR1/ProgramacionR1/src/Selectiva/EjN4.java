/*
 * Elaborar un algoritmo que lea el nombre, la edad, el sexo y el estado civil de una persona e imprima su 
nombre de la persona si corresponde a un hombre casado mayor de 40 años o una mujer soltera menor de 
50 años.
 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EjN4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String nombre, sexo;
        byte edad;
        char estado;
        
        System.out.println("Digite el nombre");
        nombre = leer.next();
        
        System.out.println("Digite su edad");
        edad = leer.nextByte();
        
        System.out.println("Digite sexo (hombre/mujer):");
        sexo = leer.next();
        
        System.out.print("Digite estado civil(c-casado, s-soltero, d-divorciado, v-viudo): "); 
        estado = leer.next().charAt(0);
        
        if ((sexo.equalsIgnoreCase("hombre")&& estado =='c' && edad>40)
          ||(sexo.equalsIgnoreCase("mujer")&& estado =='s' && edad<50))
            System.out.println("El nombre es" + nombre);
    }
}