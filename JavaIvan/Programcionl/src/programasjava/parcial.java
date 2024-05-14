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
public class parcial {
    public static void main(String arg[]) {
//declaracion de variables
int n;
float nf;
Scanner leer = new Scanner (System.in);

//pedir datos
System.out.println("digite numero de habitantes de la ciudad de Cartagena: ");

n = leer.nextInt();

//expresion algoritmica para calcular el numero final de habitantes
nf = (float) (n - (n*0.02) + (n*0.018) + (n*0.017) - (n*0.011));

System.out.println("el total de habtantes de Cartagena son: " + nf);
    
}
}
