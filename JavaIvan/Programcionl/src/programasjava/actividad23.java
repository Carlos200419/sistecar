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
/**este es mi codigo libre basado en la actividad 23 del archivo "ejercicios propuestos"
pidiendo el tipo de dato "Char"**/
public class actividad23 {
    public static void main (String[] args) {
        
        Scanner leer = new Scanner(System.in);
      
        float area, volumen, pi, radio;
        char p1;
        pi = (float) 3.14;
        
        //pedir el dato principal
        System.out.println("Digite el radio de la esfera: ");
        radio = leer.nextFloat();
        
        
        //calculos establecidos
        area = (float) (4*pi*Math.pow(radio, 2));
        volumen= (float) ((4/3)*pi*Math.pow(radio, 3));
        
        //instruccion para dar el valor seleccionado
        System.out.println("Presione 'a' para mostrar el area de la esfera." + 
                "\ningrese 'v' para mostrar el volumen de la esfera.");
        
        p1 = leer.next().charAt(0);
        
        
        //condicional para dar el valor seleccionado
        if (p1 == ('a'))
            System.out.println("El area de la esfera es: " + area);
         else if (p1 == ('v')) {
            System.out.println("El volumen de la esfera es: " + volumen);
       
            
        } else  {
            System.out.println("Dato invalido");
        }
    }
}
        
        
        
        
       
    

