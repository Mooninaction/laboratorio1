/*
 Declara dos variables numéricas (con el valor que desees), 
muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).

 */
package ejerciciotrestp;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioTresTP {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;
        String escape = "N";

        System.out.println("Ingrese el primer número");
        int num1 = Integer.parseInt(leer.nextLine());
        System.out.println("Ingrese el segundo número");
        int num2 = Integer.parseInt(leer.nextLine());

        while (!escape.equals("S")) {

            mostrarOpciones();

            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion) {
                case 1:
                    int sum = num1 + num2;
                    System.out.println("La suma es de " + sum);
                    break;
                case 2:
                    int res = num1 - num2;
                    System.out.println("La resta es de " + res);
                    break;
                case 3:
                    int mult = num1 * num2;
                    System.out.println("La multiplicación es de " + mult);
                    break;
                case 4:
                    int div = num1 / num2;
                    System.out.println("La división es de " + div);
                    break;
                case 5:
                    System.out.println("¿Está seguro que quiere salir? (S/N)");
                    String salida = leer.nextLine();
                    escape = salida;
                    break;
                default:
                    System.out.println("El número ingresado no corresponde a una opción ");
                    break;

            }
        }
    }

    public static void mostrarOpciones() {
        System.out.println("** MENU **");
        System.out.println(" 1. SUMAR ");
        System.out.println(" 2. RESTAR ");
        System.out.println(" 3. MULTIPLICAR ");
        System.out.println(" 4. DIVIDIR ");
        System.out.println(" 5. SALIR ");
        System.out.println("** ELIJA OPCIÓN **");
    }

}
