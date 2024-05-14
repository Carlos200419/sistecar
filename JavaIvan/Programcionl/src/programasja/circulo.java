/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programasja;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float pi, radio, area;
        Scanner leer = new Scanner(System.in);
        
        pi = (float) 3.14;
        
        System.out.print("digite el radio del circulo: ");
        radio=leer.nextFloat();
        area=(float) (pi*Math.pow(radio, 2));
        
        System.out.print("el area del circulo es:" + area);
        
    }
    
}
