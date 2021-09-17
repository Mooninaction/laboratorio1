/*
 - Indique que sucede si realizo la siguiente declaración de variable:
int numero = null;
¿Qué debo modificar para poder asignar null a la variable?

 */
package ejercicioquince;

public class EjercicioQuince {

    public static void main(String[] args) {

        //int numero = null;
        /*
        Un int no es nulo, puede ser 0 si no se inicializa. 
        Si desea que un entero pueda ser nulo, debe usar Integer en lugar de int.
        Las primitivas no tienen valor nulo. el valor predeterminado para int es 0.
         */
        int numero = 0;
    }

}
