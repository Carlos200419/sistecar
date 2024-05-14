/*
 * Coldeportes Bolívar está interesada en promover el Basketbol y para ello desea conocer personas que 
tengan las siguientes características:
Edad: Menor de 18 años.
Estatura: Mínima, 1,80 cm.
Peso: Máximo, 80 Kg.
Elaborar un algoritmo que lea la edad, la estatura y el peso de un deportista y verifique si cumple o no las 
condiciones exigidas.
 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EjN8 {
    public static void main (String []args){
        Scanner leer = new Scanner(System.in);
        //Decalacracion de variable
        byte edad;
        float estatura;
        int peso;

        System.out.println("Digite su edad");
        edad = leer.nextByte();
        
        System.out.println("Digite su peso(kilogramo)");
        peso = leer.nextInt();
        
        System.out.println("Digite su estatura(metros)");
        estatura = leer.nextFloat();
        
        if (edad<=18 && peso<=80 && estatura>=1.80)
            System.out.println(" Aprobado");
        else
            System.out.println(" Reprobado");
    }    
}
