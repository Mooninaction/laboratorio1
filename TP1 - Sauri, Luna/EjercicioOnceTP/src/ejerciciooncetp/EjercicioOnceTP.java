/*
Escribe una aplicación con un String
que contenga una contraseña cualquiera. 
Después se te pedirá que introduzcas la contraseña, con 3 intentos.
 Cuando aciertes ya no pedirá más la contraseña y mostrara un mensaje
diciendo “Acceso Correcto”. 
Piensa bien en la condición de salida 
(3 intentos y si acierta sale, aunque le queden intentos).
 */
package ejerciciooncetp;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioOnceTP {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); 
        
        int usuario = 0;
        int contrasenia = 0;
        int intentos = 1;
        int maximo = 3;

        while ((usuario != 1809) || (contrasenia != 1234) && (intentos < maximo)) {

            System.out.print("Ingrese su usuario: ");
            usuario = teclado.nextInt();
            
            System.out.print("Ingrese su contraseña:");
            contrasenia = teclado.nextInt();

            if (intentos == 3) {
                System.out.println(">> Acceso Denegado <<");
                intentos = intentos - maximo;
            }
            intentos++;
        }
        System.out.println(">> Acceso Correcto <<");
    }
}
