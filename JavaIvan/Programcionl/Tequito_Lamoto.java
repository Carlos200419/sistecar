
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class Tequito_Lamoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float n, mat, ves,noc;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite N promedio de infracciones en el mes: ");
        n = leer.nextFloat();
        
        mat = (float) (n*0.2/30);
        ves = (float) (n*0.35/30);
        noc = (float) (n*0.45/30);
        
        System.out.println ("Infracciones de rutinas diarias: " + mat 
                + "\nInfracciones vespertinas diarias: " + ves 
                + "\nInfracciones nocturnas diarias: " + noc);
     
        
    }
    
}
