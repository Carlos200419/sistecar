/*
 *Elabore un algoritmo lea la longitud y el diámetro de una pieza en forma de varilla y muestre un 
mensaje que indique si se acepta o rechaza la pieza, de acuerdo con los siguientes criterios:
a. Su longitud debe ser mayor de 7,5 cm pero no puede exceder los 9 cm.
b. Su diámetro no debe ser menor que 0,5 cm ni mayor que 1,3 cm.
c. Por ningún motivo su masa debe exceder los 5,8 gr. (masa = volumen * densidad, densidad = 3,5 
gr/cm3
).
 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class EjN24 {
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        
        double densidad = 3.5, volumen, masa;
        
        System.out.println("longitud y el diámetro de una pieza en forma de varilla");
        System.out.println("Digite el longitud de la varilla");
        double longitud = leer.nextDouble();
        System.out.println("Digite el diametro de la varilla");
        double diametro = leer.nextDouble();
        
        volumen = (3.14 *Math.pow(diametro,2)/4* longitud);
        masa = volumen * densidad;
        if (longitud > 7.5 && longitud <= 9 && diametro >= 0.5 && diametro <= 1.3 && masa <= 5.8){
            System.out.println("si se acepta la pieza");
           }
        else {
           System.out.println("no se acepta la pieza");
        }
   }    
}

