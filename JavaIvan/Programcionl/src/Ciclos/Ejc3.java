/*
 * Leer un numero hasta que se introduzca un 0. 
   Para uno indicar si es par o impar 
 */
package Ciclos;
import javax.swing.JOptionPane;
/**
 *
 * @author ivand
 */
public class Ejc3 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        while (num != 0) {// mientras el numero sea distinto de 0

            if (num % 2 == 0)//si el numero es par
            {
                System.out.println("El numero es par" + num);

            } else {
                System.out.println("el numero es impar" + num);
            }

            num = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));

        }
    }
}
