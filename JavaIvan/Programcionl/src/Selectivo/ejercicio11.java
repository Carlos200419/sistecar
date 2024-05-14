/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selectivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class ejercicio11 {
    public static void main(String[] args) {
     //Digite variable
        Scanner leer = new Scanner (System.in);
       
        // ingrese datos del trabajo
        System.out.print("Ingrese nombre del empleado: ");
        String nombre = leer.nextLine();
        
        System.out.print("Ingrese salario básico por hora: ");
        double salarioBasico = leer.nextDouble();
        
        System.out.print("Ingrese número de horas trabajadas: ");
        int horasTrabajadas = leer.nextInt();
        
        double salarioNeto;
        
        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;
            double recargoHorasExtras = salarioBasico * 1.4;
            double salarioExtra = horasExtras * (salarioBasico + recargoHorasExtras);
            salarioNeto = 40 * salarioBasico + salarioExtra;
        } else {
            salarioNeto = horasTrabajadas * salarioBasico;
        }
        
        System.out.println("El salario neto de " + nombre + " es: " + salarioNeto);

                   
    }
    
}
