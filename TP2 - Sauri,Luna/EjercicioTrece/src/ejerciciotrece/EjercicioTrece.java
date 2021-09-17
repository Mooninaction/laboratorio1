/*
 - Pedir el ingreso de dos cadenas por por teclado, 
indicar si la segunda cadena se
encuentra dentro de la primera (usar indexOf o contains).
 */
package ejerciciotrece;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioTrece {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de palabras");
        String cadena1 = sc.nextLine();
        System.out.println("Ingrese otra cadena de palabras");
        String cadena2 = sc.nextLine();
        
        if (cadena1.indexOf(cadena2) > 0) {
            System.out.println("La segunda cadena se encuentra dentro de la primera");
        }else{
            System.out.println("La segunda cadena NO se encuentra dentro de la primera");
        }
        
    }
    
}
