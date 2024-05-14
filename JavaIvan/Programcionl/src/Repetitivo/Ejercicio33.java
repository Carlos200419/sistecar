/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repetitivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class Ejercicio33 {
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
//declaro variables
String n_t;
double h_a, grado=0;
int t_d,t_p;

System.out.println("Digite Nombre Del Trabajador: ");
n_t = leer.next();
System.out.println("Digite Horas De Ausencia: ");
h_a = leer.nextDouble();
System.out.println("Digite Tornillos defectuosos: ");
t_d = leer.nextInt();
System.out.println("Digite Tornillos producidos: ");
t_p = leer.nextInt();

if (h_a <= 3.5 && t_d < 300 && t_p >10000)
grado =20;
else
if(h_a>3.5 && t_d < 300 && t_p > 10000)
grado=15;
else
if (h_a<= 3.5 && t_d>=300 && t_p >10000)
grado=13;
else
if (h_a<= 3.5 && t_d<300 && t_p <10000)
grado =12;
else
if(h_a> 3.5 && t_d>300 && t_p >10000)
grado=9;
else
if (h_a> 3.5 && t_d<300 && t_p <10000)
grado=8;
else
if (h_a<= 3.5 && t_d>300 && t_p <10000)
grado =7;
else
if (h_a> 3.5 && t_d>=300 && t_p <=10000)
grado =5;
System.out.println("El Trabajador " + n_t + " Grado: " + grado);


}

}


    

