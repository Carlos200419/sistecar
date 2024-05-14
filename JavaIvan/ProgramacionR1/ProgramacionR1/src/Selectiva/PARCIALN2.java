/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class PARCIALN2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese la nota del examen escrito: ");
        double examenEscrito = leer.nextDouble();
        
        System.out.print("Ingrese la nota de los trabajos: ");
        double trabajos = leer.nextDouble();
        
        System.out.print("Ingrese la nota de los quizes: ");
        double quizes = leer.nextDouble();
        

        
        double def;
                def = examenEscrito *0.3 + trabajos *0.4+ quizes*0.3;
                
                System.out.println("definitiva : "+def );
        
        if (def == 0.7) {
            System.out.println("la profe me tiene la mala");
        } else if (def == 0.9) {
            System.out.println("El estudiante es deseccionante");
        } else if (def == 1.0) {
            System.out.println("El estudiante es deseccionante");
            } else if (def == 1.9) {
            System.out.println("El estudiante es deseccionante");
            } else if (def == 2.0) {
            System.out.println("El estudiante es deseccionante");
            } else if (def == 2.9) {
            System.out.println("El estudiante es deseccionante");
            } else if (def == 3.0) {
            System.out.println("pasaste de leche");
            } else if (def == 3.5) {
            System.out.println("Por no practicar mas");
            } else if (def == 3.6) {
            System.out.println("la misma vaina");
            } else if (def == 4.0) {
            System.out.println("Alto");
            } else if (def == 4.1) {
            System.out.println("Alto");
            } else if (def ==4.5) {
            System.out.println("Muy alto");
            } else if (def == 4.6) {
            System.out.println("Sobresaliente");
            } else if (def == 5.0) {
            System.out.println("Sobresaliente");
        }
    }
}
