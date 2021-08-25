/*
Codifique un programa de consola en Java que permita realizar las siguientes acciones:
Generar un número aleatorio entre 0 y 100, para ello use la siguiente función:
int x = new Double(Math.random() * 100).intValue();
Una vez generado el número codifique la lógica necesaria para encontrar el número aleatorio
ayudando al usuario informando al mismo si el número ingresado es mayor o menor al número
aleatorio buscado. Una vez encontrado el número muestre la cantidad de intentos necesarios
para lograrlo.
Ejemplo:
Número aleatorio generado: 63
Ingrese un número entre 0 y 100.
Numero Ingresado: 50
Respuesta: Es muy bajo
Ingrese un número entre 0 y 100.
Numero Ingresado: 75
Respuesta: Es muy alto
Ingrese un número entre 0 y 100.
Numero Ingresado: 60
Respuesta: Es muy bajo
Ingrese un número entre 0 y 100.
Numero Ingresado: 65
Respuesta: Es muy alto
Ingrese un número entre 0 y 100.
Numero Ingresado: 63
Respuesta: Correcto, numero encontrado, cantidad de intentos 5
 */
package ejerciciocatorcetp;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioCatorceTP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numAdivinar = new Double(Math.random() * 100).intValue();

        int intentosRealizados = 0;

        System.out.println("¡Hola! ¿Cómo te llamas?");

        String miNombre = sc.nextLine();

        System.out.println(miNombre + ", estoy pensando en un número entre 1 y 100");

        while (intentosRealizados < 11) {

            System.out.println("Intenta adivinar");

            int estimacion = sc.nextInt();

            intentosRealizados = intentosRealizados + 1;

            if (estimacion < numAdivinar) {
                System.out.println("Tu estimación es muy baja");
            }
            if (estimacion > numAdivinar) {
                System.out.println("Tu estimación es muy alta");
            }

            if (estimacion == numAdivinar) {
                System.out.println(" ¡Buen trabajo, " + miNombre
                        + "¡Has adivinado mi número en " + intentosRealizados
                        + " intentos!");
                break;
            }

            if (intentosRealizados > 10) { 
                
                System.out.println("Pues no. El número que estaba pensando era "
                        + numAdivinar);
            }
        }
    }
}
