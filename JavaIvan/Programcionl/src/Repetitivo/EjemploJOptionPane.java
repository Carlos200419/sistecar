
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Estudiantes
 */
public class EjemploJOptionPane {
     public static void main(String[] args) {
        // TODO code application logic here
        int i;
        float f;
        double d;
        char c;
        String s; 
        
        //Para pedir datos
        s = JOptionPane.showInputDialog(null, "Digite una cadena: ");
        // Obtener el primer caracter(0) del String digitado
        c = JOptionPane.showInputDialog(null, "Digite una letra:  ").charAt(0); 
        
        i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un valor entero:  "));
        f = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite un valor real-float:  "));
        d = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite un valor real-double:  "));
        
        
        //Imprimir datos
        JOptionPane.showMessageDialog(null, "Es un mensaje Simple de Información");
        JOptionPane.showMessageDialog(null, "Este es un mensaje de Advertencia", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "String: "+s); // Imprime el String 
        JOptionPane.showMessageDialog(null, "char: "+c); //Imprime el char

        JOptionPane.showMessageDialog(null, "entero: "+i); 
        JOptionPane.showMessageDialog(null, "real-float: "+f);
        JOptionPane.showMessageDialog(null, "real-double: "+d);
        
 
        //Otro tipo
        //int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para multiplicarlo por 2"));
        Object color = JOptionPane.showInputDialog(null, "Mensaje", "Titulo", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Seleccione", "Amarillo", "Azul", "Rojo"}, "Seleccione");
        JOptionPane.showMessageDialog(null, "El color elegido es: "+ color);
        
       /* //System.out.println("" + color);
        int resp = JOptionPane.showConfirmDialog(null, "Usas mucho el JOptionPane?");
        if (JOptionPane.OK_OPTION == resp) {
            System.out.println("Selecciona opción Afirmativa");
        } else {
            System.out.println("No selecciona una opción afirmativa");
        }
       */
    } 
}
 
