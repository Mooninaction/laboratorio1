/*
 - Suma los dígitos de un número ingresado por el usuario de forma recursiva.
Ejemplo: el usuario ingresa 1596
El programa debe sumar 1 + 5 + 9 + 6
 */
package ejercicioveintidos;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioVeintidos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduce un numero entero >0 ");
            num = sc.nextInt();
        } while (num <= 0);
        
        
        System.out.printf("%nLa suma de los dígitos del número %d es %d", num, sumaDigitos(num));
    }

    private static int sumaDigitos(int n) {
        if (n == 0) {
             
            return 0;
        } else {
            
            return sumaDigitos(n / 10) + n % 10;
        }
    }
}
