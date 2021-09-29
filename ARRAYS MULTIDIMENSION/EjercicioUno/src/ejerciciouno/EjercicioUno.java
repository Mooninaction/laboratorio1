/*
Arreglos Multidimensionales.

 Crea un programa que pida por pantalla cuatro países y a continuación tres
ciudades de cada uno de estos países. Los nombres de ciudades deben
almacenarse en un array multidimensional cuyo primer índice sea el número
asignado a cada país y el segundo índice el número asignado a cada ciudad. Es decir
el array deberá tener un tamaño de 4x4

Ejemplo de resultados que debe mostrar el programa:
País: Argentina Ciudades: Buenos Aires Cordoba La Plata
País: España Ciudades: Madrid Lugo Sevilla
País: Francia Ciudades: Paris Niza Lyon
País: Italia Ciudades: Roma Napoles Sicilia
 */
package ejerciciouno;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] paises = new String[4][4];

        for (int i = 0; i < paises.length; i++) {
            for (int j = 0; j < paises.length; j++) {
                if (j == 0) {
                    System.out.print("Ingrese un pais ");
                    paises[i][j] = sc.nextLine();
                } else {
                    System.out.print(" Ingrese una ciudad para " + paises[i][0] + " ");
                    paises[i][j] = sc.nextLine();
                }
            }
        }
        for (int i = 0; i < paises.length; i++) {
            for (int j = 0; j < paises.length; j++) {
                
                 if (j == 0) {
                    System.out.print("\n Pais: "+ paises[i][j]+ "         Ciudades: ");
                    
                } else {
                    System.out.print(" " + paises[i][j]+ " ");
                    
                }
            }
        }

    }

}
