/*
 Declara un String que contenga tu nombre, 
 después muestra un mensaje de bienvenida por consola.
 Por ejemplo: 
    si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
 */
package ejerciciounotp;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioUnoTP {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nombre = sc.nextLine();
        
        System.out.println("Bienvenido "+ nombre);
    }

}
