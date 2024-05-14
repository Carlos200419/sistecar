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
public class ejercicio14 { 
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos.
        Scanner Scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los datos del empleado.
        System.out.print("Nombre del empleado: ");
        String nombreEmpleado = Scanner.nextLine();

        System.out.print("Salario básico por hora: ");
        double salarioBasicoHora = Scanner.nextDouble();

        System.out.print("Horas ordinarias trabajadas: ");
        double horasOrdinarias = Scanner.nextDouble();

        System.out.print("Horas extras diurnas trabajadas: ");
        double horasExtrasDiurnas = Scanner.nextDouble();

        System.out.print("Horas extras nocturnas trabajadas: ");
        double horasExtrasNocturnas = Scanner.nextDouble();

        System.out.print("Horas extras dominicales trabajadas: ");
        double horasExtrasDominicales = Scanner.nextDouble();

        // Calcular el salario bruto, considerando los recargos por horas extras.
        double salarioBruto = (salarioBasicoHora * horasOrdinarias) +
                (salarioBasicoHora * 1.25 * horasExtrasDiurnas) +
                (salarioBasicoHora * 1.5 * horasExtrasNocturnas) +
                (salarioBasicoHora * 1.75 * horasExtrasDominicales);

        // Calcular el valor de las horas extras para la retención en la fuente.
        double valorHorasExtras = (salarioBasicoHora * 1.25 * horasExtrasDiurnas) +
                (salarioBasicoHora * 1.5 * horasExtrasNocturnas) +
                (salarioBasicoHora * 1.75 * horasExtrasDominicales);

        // Calcular la retención en la fuente si el valor de las horas extras es mayor a $200,000.
        double retencionEnFuente = 0.0;
        if (valorHorasExtras > 200000) {
            retencionEnFuente = 0.1 * valorHorasExtras;
        }

        // Calcular el salario neto restando la retención en la fuente.
        double salarioNeto = salarioBruto - retencionEnFuente;

        // Imprimir los resultados.
        System.out.println("Nombre del empleado: " + nombreEmpleado);
        System.out.println("Salario neto a pagar: $" + salarioNeto);
        System.out.println("Valor de la retención en la fuente: $" + retencionEnFuente);
        
        // Cerrar el objeto Scanner.
        Scanner.close();

    }
 }

    

