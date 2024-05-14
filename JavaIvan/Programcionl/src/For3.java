/*
 * 
 */
import java.util.Scanner;
/**
 * ciclo for 
 * for (inicializacion; condicion; aumento o decremento){
 *     intrucciones;
 * }
 * 
 * @author ivand
 */
public class For3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int contador;
        
        System.out.print("digite la cantidad: ");
        contador = leer.nextInt();
        
        
        for( int i=2; i<=contador; i+=2){
            System.out.println(i);
            
        }
        
    }  
}
