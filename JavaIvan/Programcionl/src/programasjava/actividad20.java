/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programasjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class actividad20 {
   public static void main(String[] args) {
String nombre;
float paghor,horord, hordiu, hornoc, hordom;
double salbas, saldiu, salnoc, saldom, salext,retencion, salneto;
Scanner leer = new Scanner (System.in);

//pedir datos
System.out.println("Digite nombre: ");
nombre = leer.nextLine();
System.out.println("Ingrese su salario por hora: ");
paghor = leer.nextFloat();
System.out.println("Digite horas ordinarias: ");
horord = leer.nextFloat();
System.out.println("Digite horas extras diurnas: ");
hordiu = leer.nextFloat();
System.out.println("Digite horas extras nocturnas: ");
hornoc = leer.nextFloat();
System.out.println("Digite horas dominicales: ");
hordom = leer.nextFloat();


//operaciones para calcular datos
salbas = paghor * horord;
saldiu = hordiu * (paghor * 0.25);
salnoc = hornoc * (paghor * 0.50);
saldom = hordom * (paghor * 0.75);

salext = saldiu+salnoc+saldom;

retencion = (float) salext*0.1;


salneto = salbas + salext - retencion;


//solucion al problema 
System.out.println("Empleado: "+nombre);
System.out.println("Su salario neto es de "+salneto+"$");
System.out.println("La retencion es de "+retencion+"$");

   }
   
}
