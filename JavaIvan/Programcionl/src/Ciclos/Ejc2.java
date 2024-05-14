/*
 * Leer un numero e indicar si es positivo o negativo.
   El proceso se repetira hasta que se introduca un cero "0".
https://es.stackoverflow.com/questions/238253/problema-con-bucle-usando-while-termina-inesperadamente
 */
package Ciclos;
import javax.swing.JOptionPane;
/**
 *
 * @author ivand
 */
public class Ejc2 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
        while (num>0 && num !=0){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
            
            JOptionPane.showInternalMessageDialog(null, "el numero es: "+ num + "es positivo");
            
            if (num<0 && num !=0)
            JOptionPane.showInternalMessageDialog(null, "el numero es: "+ num + "es negativo");
            
        }
    }
}
