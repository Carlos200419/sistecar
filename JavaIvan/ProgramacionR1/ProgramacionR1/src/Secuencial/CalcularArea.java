/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Secuencial;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class CalcularArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
     Scanner entrada = new Scanner(System.in);
     //variables
     double area,volumen,longitud;
     //entrada
     System.out.print("digite el area del cubo:");
     area = entrada.nextDouble();
     System.out.print("digite el volumen del volumen:");
     volumen = entrada.nextDouble();
     //proceso
     longitud = area+volumen;
     //salida
     System.out.print("el area del cubo es:"+volumen);
     System.out.print("la lungitud de los lados del cubo son:"+area);
    }
    
}
