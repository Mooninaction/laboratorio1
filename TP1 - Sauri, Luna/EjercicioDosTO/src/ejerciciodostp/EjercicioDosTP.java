/*
    Modifica la aplicación anterior,
    para que nos pida el nombre que queremos introducir 
    (aplica Scanner y JOptionPane).
 */
package ejerciciodostp;

import javax.swing.JOptionPane;

/**
 *
 * @author Luna
 */
public class EjercicioDosTP {

  
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        JOptionPane.showMessageDialog(null,"Bienvenido " + nombre );
        
    }
    
}
