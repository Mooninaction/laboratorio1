/*
 Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII.
Muéstralos en línea recta, separados por un espacio entre cada carácter.
 */
package ejercicionueve;

/**
 *
 * @author Luna
 */
public class EjercicioNueve {

    public static void main(String[] args) {
        
         String cadena = "La lluvia en Mendoza es escasa";
        
        System.out.println("El tamaño de la siguiente cadena: " + "\n" + cadena 
                + "\n" + "es de: " + cadena.length() + " caracateres ");
        
        for (int i = 0; i < cadena.length(); i++) {
            
            //Hacemos un casting para convertir el char a int
            System.out.print((int)cadena.charAt(i)+" ");
            
        }
        
    }
    
}
