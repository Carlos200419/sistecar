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
public class ejercicioN3 {
    public static void main(String[] args) {
        int num;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite numero:");
        num = leer.nextInt();
        
        if(num>0)
            System.out.println("cubo"+ (Math.pow(num,3)));
        
         if(num<0)
            System.out.println("cubo"+ (Math.pow(num,2)));
        
    }
    
}
