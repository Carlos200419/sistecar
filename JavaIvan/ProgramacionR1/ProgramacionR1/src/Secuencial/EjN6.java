/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *Para un empleado se tienen los siguientes datos:
· Nombre del empleado.
· Salario básico por hora.
· Horas ordinarias trabajadas.
· Horas extras trabajadas.
elabore un algoritmo que calcule e imprima:
Þ Nombre del empleado.
Þ Salario neto a pagar.
Þ Valor de la retención en la fuente.
Teniendo en cuenta que las horas extras tienen un recargo del 40% y la retención en la fuente (10%) se
aplica a las horas extras trabajadas
*/

package Secuencial;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class EjN6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int HO, HEX;
        double salarioNeto, retencion;
        
        System.out.println("SITUACIION FINANCIERA DEL EMPLEADO");
        System.out.println("Ingrese nombre del empleado:");
        String nombreEmpleado = leer.nextLine();

        System.out.println("Ingrese salario básico por hora:");
        double salarioB = leer.nextDouble();

        System.out.println("Ingrese horas ordinarias trabajadas:");
        HO = leer.nextInt();

        System.out.println("Ingrese horas extras trabajadas:");
        HEX = leer.nextInt();


        // Cálculo del salario neto
        salarioNeto = (salarioB * HO) + (salarioB * 1.4 * HEX);

        // Cálculo de la retención en la fuente
        retencion = salarioB * 0.4 * HEX;

        System.out.println("Nombre del empleado: " + nombreEmpleado);
        System.out.println("Salario neto a pagar: " + salarioNeto);
        System.out.println("Valor de la retención en la fuente: " + retencion);

        leer.close();
    }
}
   
  