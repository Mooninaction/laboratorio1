/*
Crea una aplicación que nos pida un día de la semana 
y que nos diga si es un dia laboral o no (siendo sábado y domingo no laborales).
 Usa un switch para ello. 

Valida que el número ingresado sea un valor entre 1 y 7, 
caso contrario solicite el valor nuevamente. 
 */
package ejerciciodocetp;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioDoceTP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia;
        
        do {
            System.out.println("Ingrese un día de la semana ");
            dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("El día es laboral");
                break;
            case 2:
                System.out.println("El día es laboral");
                break;
            case 3:
                System.out.println("El día es laboral");
                break;
            case 4:
                System.out.println("El día es laboral");
                break;
            case 5:
                System.out.println("El día es laboral");
                break;
            case 6:
                System.out.println("El día NO es laboral");
                break;
            case 7:
                System.out.println("El día NO es laboral");
                break;
        }
        } while (dia < 1 || dia > 7);

    }

}
