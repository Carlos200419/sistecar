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
public class actividad24 {
    public static void main(String[] args) {
            int nc, nb, a,  cartagena, bolivar, nc2, nb2, nb1, nc1, salen, entran, nacen, mueren, total, total2;
            Scanner leer = new Scanner(System.in);
            

//pedir datos base
            System.out.println("Digite el numero de personas en Cartagena al comenzar el año: ");
            nc = leer.nextInt();
            System.out.println("Digite el numero de personas en Bolivar al comenzar el año: ");
            nb = leer.nextInt();
            
            //operaciones para llevar a cabo las modificaciones
            salen = (int) (nc*0.02);
            nc1 = (int) (nc - salen);
            nb1 = (int) (nb + salen);
            
            entran = (int) (nc*0.005);
            nc2 = (int) (nc1 + entran);
            nb2 = (int) (nb1 - entran);
            
            nacen = (int) (nc2*0.05);
            total = (int) (nc2 + nacen);
            
            mueren = (int) (total*0.08);
            total2 = (int) (total - mueren);
            
            
            
            
            
            System.out.println("la poblacion total de Cartagena fue de:  " + total2 + " personas");
            System.out.println("La poblacion total en el resto de Bolivar fue de: " + nb2 + " personas");
            

        }
    }
    
    

