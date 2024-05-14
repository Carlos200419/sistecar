/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *Ciclo do while
 * do{
 * instrucciones;
 * }while(condicion);
 * @author ivand
 */
public class while2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("digite la cantidad");
        int contador = leer.nextInt();
        // do while
        do {
            
            System.out.println("Estoy en la vuenlta: " + contador);
            contador = contador + 1;
        } while (contador<=10);
        
    }
}

