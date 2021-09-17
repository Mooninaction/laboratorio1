/*
 - Convertir una frase a mayúsculas o minúsculas,
que daremos opción a que el usuario lo pida y 
mostraremos el resultado por pantalla.
 */
package ejerciciodiez;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioDiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la palabra o frase");
        String cadena = sc.nextLine();
        
        System.out.println("---- MENU ----");
        System.out.println(" 1 - Convertir a MAYÚSCULA ");
        System.out.println(" 2 - Convertir a minúscula ");
        int opcion = sc.nextInt();
        
        
        switch (opcion) {
            case 1 :
                System.out.println(cadena.toUpperCase());
                break;
                
            case 2 :
                System.out.println(cadena.toLowerCase());
                break;
        }
    }
    
}
