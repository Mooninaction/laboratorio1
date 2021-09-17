/*
 Crea un programa donde se pida el ingreso de una cadena 
y por medio de recursión mostrar la cadena de forma inversa.
Ejemplo: Ingreso “computadora de escritorio”
Invertir cadena “oirotircse ed arodatupmoc”
 */
package veintitres;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class Veintitres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto ");
        String cadena = sc.nextLine();

        sc.close();
        String invertida = invertirCadena(cadena);
        System.out.printf("Cadena introducida: %s%n", cadena);
        System.out.printf("Cadena invertida: %s", invertida);
    }

    private static String invertirCadena(String cadena) {
        if (cadena.length() == 1) {
            return cadena;
        } else {
            return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
        }
    }


}
