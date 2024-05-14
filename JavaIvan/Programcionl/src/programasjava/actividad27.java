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
public class actividad27 {
    public static void main(String[] args) {
        
        //variables a utilizar en el codigo
        int n, mañana, tarde, noche;
        Scanner leer = new Scanner (System.in);
        
        //pedir el promedio de infracciones al usuario
        System.out.print("Digite el numero de promedio de infracciones reportadas en el mes por tequito lamoto: ");
        n = leer.nextInt();
        
        //operaciones para calcular el promedio diario de infracciones segun la jornada del dia
        mañana = (int) (n*0.2/30);
        tarde = (int) (n*0.35/30);
        noche = (int) (n*0.45/30);
        
        
        //resultado de cada una de las operaciones
        System.out.print("el promedio de infracciones matutinas diarias es: " + mañana +
                "\nel promedio de infracciones vespertinas diarias es: " + tarde +
                "\nel promedio de infracciones nocturnas diarias es: " + noche);
        
        
    }
    }
    

