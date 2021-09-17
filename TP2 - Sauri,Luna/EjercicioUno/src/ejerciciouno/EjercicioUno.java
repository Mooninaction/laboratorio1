/*
CASTEO: Codifique un programa que solicite el ingreso de un numero decimal y
asigne el mismo a una variable valorDecimal de tipo double, aplique las
operaciones de CASTING para convertir la variable a los siguientes tipos de
datos, short, int, long, String, float investigue las diferentes formas de lograr la
conversión. Muestre por pantalla el resultado de las conversiones.

 */
package ejerciciouno;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número decimal");
        double num = sc.nextDouble();
        
        System.out.println("------- CASTING -------");
        System.out.println("Short: " + (short)num );
        System.out.println("Int: " + (int)num );
        System.out.println("Long: " + (long)num );
        System.out.println("String: " + Double.toString(num));
        System.out.println("Float: " + (float)num);
        
        
        
    }
    
}
