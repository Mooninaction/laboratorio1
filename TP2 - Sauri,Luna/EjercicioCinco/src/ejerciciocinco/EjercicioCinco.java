/*
Solicite el ingreso de un número y conviértalo a un String mediante
String.valueOf
*/
package ejerciciocinco;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioCinco {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num = sc.nextInt();
        
         System.out.println("El número en string es " + String.valueOf(num));
    }
    
}
