/*
 - Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo,
compareToIgnoreCase)
 */
package ejercicioonce;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioOnce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        String palabra1 = sc.nextLine();

        System.out.println("Ingrese paralabra para igualar");
        String palabra2 = sc.nextLine();

        if (palabra1.equalsIgnoreCase(palabra2)) {

            if (palabra1.equals(palabra2)) {
                System.out.println("Las palabras son iguales con sus mayusculas y minusculas ");

            } else {
                System.out.println("Las palabras son iguales sin importar mayusculas y minusculas");
            }

        } else {
            System.out.println("Las palabras son distintas");
        }

    }

}
