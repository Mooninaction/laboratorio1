/*
Trabajo Practico - Ejercicios: (Arreglos unidimensionales)

 En Argentina cada persona está identificada con un Documento Nacional de Identidad
(DNI) en el que figura un número y una letra, por ejemplo 56999545W
La letra que sigue al número se calcula siguiendo la metodología que vamos a indicar.

Crea un programa que calcule la letra de un DNI a partir del número de DNI que introduzca el usuario. 
Es decir, se debe pedir el DNI sin la letra por teclado y el programa
nos devolverá el DNI completo (con la letra).

Para calcular la letra, se debe tomar el resto de dividir nuestro número de DNI entre 23.
El resultado debe estar por tanto entre 0 y 22.
Crea un método obtenerLetra(int numeroDNI) donde según el resultado de la anterior
fórmula busque en un array de caracteres la posición que corresponda a la letra. 
Esta es la tabla de caracteres:
Posición 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
Letra T R W A G M Y F P D X B N J Z S Q V H L C K E
Por ejemplo, si introducimos el DNI 20267079, el resto de dividirlo por 23 sería 8, luego
la letra sería la P, que es la que ocupa esa posicion en la matriz de caracteres.
 */
package ejercicionueve;

import java.util.Scanner;

public class EjercicioNueve {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca número del DNI: ");
        int numDNI = sc.nextInt();
        System.out.println("\nEl DNI con letra es: " + numDNI + obtenerLetraDNI(numDNI));

    }

    private static String obtenerLetraDNI(int numDNI) {
        int resto = numDNI % 23;
        if (resto < 0 || resto > 22) {
            return "ERROR";
        } else {
            switch (resto) {
                case 0:
                    return "T";
                case 1:
                    return "R";
                case 2:
                    return "W";
                case 3:
                    return "A";
                case 4:
                    return "G";
                case 5:
                    return "M";
                case 6:
                    return "Y";
                case 7:
                    return "F";
                case 8:
                    return "P";
                case 9:
                    return "D";
                case 10:
                    return "X";
                case 11:
                    return "B";
                case 12:
                    return "N";
                case 13:
                    return "J";
                case 14:
                    return "Z";
                case 15:
                    return "S";
                case 16:
                    return "Q";
                case 17:
                    return "V";
                case 18:
                    return "H";
                case 19:
                    return "L";
                case 20:
                    return "C";
                case 21:
                    return "K";
                case 22:
                    return "E";
            }
        }
        return " ";
    }

}
