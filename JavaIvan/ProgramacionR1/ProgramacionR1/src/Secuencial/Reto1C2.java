/*
 *Con base en el sumador de 2 bit.
Diseñe una solución a nivel de software que permita sumar dos números de dos bit y que muestre el resultado en binario y en decimal.
 */
package Secuencial;
import javax.swing.JOptionPane;


/**
 *
 * @author IvanDavidCastroJimenez
 */
public class Reto1C2 {
    public static void main(String[] args) {
        
        String bit1;
        String bit2;
        int num1 = 0;
        int num2 = 0;

        while ((bit1 = (JOptionPane.showInputDialog(null, "Ingrese el primer numero"))).length() != 1){
            JOptionPane.showMessageDialog(null,"Ingrese solo un numero","Error",JOptionPane.ERROR_MESSAGE);
        }
        while ((bit2 = (JOptionPane.showInputDialog(null, "Ingrese el segundo numero"))).length() != 1){
            JOptionPane.showMessageDialog(null,"Por favor ingrese solo un numero","Error",JOptionPane.ERROR_MESSAGE);
        }

        try {
            num1 = Integer.parseInt(bit1);
            num2 = Integer.parseInt(bit2);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error no es un numero","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(num1 > 3 || num2 > 3) {
            JOptionPane.showMessageDialog(null, "Los numeros deben ser maximo 3", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "La suma rn decimales es " + (num1 + num2));
            try {
                JOptionPane.showMessageDialog(null, "La suma en binarios es " + Integer.toBinaryString( num1 + num2 ));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error convertiendo a binarios","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

    

