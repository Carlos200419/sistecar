/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selectivo;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author ivand
 */
public class ejercicio12 {
  public static void main(String[] args) {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        
        // Fecha de nacimiento de la persona (ejemplo: 01/01/1990)
        LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1);
        
        // Calcular la diferencia entre las fechas
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        
        // Obtener la edad en años, meses y días
        int edadAnios = periodo.getYears();
        int edadMeses = periodo.getMonths();
        int edadDias = periodo.getDays();
        
        // Imprimir la edad
        System.out.println("Edad: " + edadAnios + " años, " + edadMeses + " meses, " + edadDias + " días");
        
        // Determinar si es mayor o menor de edad (18 años o más)
        if (edadAnios >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}