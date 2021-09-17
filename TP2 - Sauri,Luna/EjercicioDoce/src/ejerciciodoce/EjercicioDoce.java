/*
 Dada una cadena, extraer la cuarta y quinta letra usando el método substring
 */
package ejerciciodoce;

/**
 *
 * @author Luna
 */
public class EjercicioDoce {

    public static void main(String[] args) {

        String cadena = "Pablito clavó un clavito en la calva de un calvito."
                + "Un clavito clavó Pablito en la calva de un calvito. "
                + "¿Qué clavito clavó Pablito? ";

        System.out.println("La cadena es: " + "\n" + cadena);

                
        System.out.println("La cuarta posición es: " + cadena.substring(3,4));
        System.out.println("La quinta posición es: " + cadena.substring(4,5));
    }

}
