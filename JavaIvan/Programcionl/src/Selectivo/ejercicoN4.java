/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selectivo;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class ejercicoN4 {
 public static void main(String[] args) {
        String nombre, sexo;
        char estado;
        byte edad;
        Scanner leer = new Scanner(System.in);
        
        //Pedir datos
        System.out.print("Digite nombre: "); 
        nombre = leer.nextLine();
        System.out.print("Digite edad: "); 
        edad = leer.nextByte();
        System.out.print("Digite sexo(hombre o mujer): "); 
        sexo = leer.next();
        System.out.print("Digite estado civil(c-casado, s-soltero, d-divorciado, v-viudo): "); 
        estado = leer.next().charAt(0);
        
        if((sexo.equalsIgnoreCase("hombre") && estado=='c' && edad>40) || (sexo.equalsIgnoreCase("mujer") && estado=='s' && edad<50))
            System.out.println("El nombre es: "+ nombre);
    }
}