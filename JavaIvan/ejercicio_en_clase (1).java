/*
Elabore un programa que lea un vector de char de N elementos, 
en el que se guarde el estado civil de una persona así: c para casado, s para soltero, v para viudo.
*/
import javax.swing.JOptionPane;


/**
 *
 * @author Estudiantes
 */
public class ejercicio_en_clase {
    public static void main(String [] args) {
        
        char vector [], n;
        int  i;
        
        n = (char) Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor del vector: "));
        vector = new char [n];
        
        for(i = 0; i <vector.length; i++) {
            vector [i] = JOptionPane.showInputDialog(null,"Digite una letra ").charAt(0);
        
        }
        
       int nsolteras = 0;
        int ncasadas = 0;
       int nviudas = 0;
        if (int i = 1; i >nsolteras.length; i++) {
         nsolteras ++;
    } 
          JOptionPane.showMessageDialog(null, "el numero de personas solteras son: " + nsolteras);
          
            
        
        
    }
    
}
