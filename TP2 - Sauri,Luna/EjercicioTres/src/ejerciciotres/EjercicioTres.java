/*
Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 -
999) y por medio del uso de las operaciones matemáticas módulo 10 y división
por 10 efectué la suma de los 3 dígitos del número.

Ejemplo ingreso 563, salida del algoritmo 14.
 */
package ejerciciotres;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioTres {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número de 3 dígitos");
        int num = sc.nextInt();
        
        int sum=0;
          while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        
        System.out.println("La suma es de " + sum);
        
        
    }
    
}
