/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author Sala de Sistemas
 */
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String number;
       String resultado = "";
       
       int opcion;
       
       opcion = parseInt(JOptionPane.showInputDialog("Por favor ingrese opcion \n 1.Decimal a binario \n 2.Binario a decimal \n 3. Hex a Decimal"));
       number = JOptionPane.showInputDialog("Por favor ingrese numero");

       switch(opcion){
           case 1 -> {
               try{
                   resultado = Integer.toBinaryString(parseInt(number));
               }catch(NumberFormatException e){
                   JOptionPane.showMessageDialog(null, "El numero no es un decimal", "Error", opcion);
                   System.exit(0);
               }
            }

           case 2 -> {
               try{
                   resultado = String.valueOf(Integer.parseInt(number, 2));                   
               }catch(NumberFormatException e){
                   JOptionPane.showMessageDialog(null, "El numero no es un binario", "Error", opcion);
                   System.exit(0);
               }
            }

           case 3 -> {
               try{
                   resultado = String.valueOf(Integer.parseInt(number,16));
               }catch (NumberFormatException e){
                   JOptionPane.showMessageDialog(null, "El numero no es un hexadecimal", "Error", opcion);
                   System.exit(0); 
               }
            }

           default -> {
            }
       }
       

       JOptionPane.showMessageDialog(null, resultado);
       
    }
}
