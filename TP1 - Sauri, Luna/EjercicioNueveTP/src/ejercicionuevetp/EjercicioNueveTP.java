/*
 Muestra los números del 1 al 100 (ambos incluidos)
divisibles entre 2 y 3. Utiliza el bucle que desees.
 */
package ejercicionuevetp;

/**
 *
 * @author Luna
 */
public class EjercicioNueveTP {

   
    public static void main(String[] args) {
      
        System.out.println("Numeros del 1 al 100 divisibles entre 2 y 3: ");
        
        for (int i = 1; i < 101; i++) {
            if (i%2==0 && i%3==0){
                System.out.println(i);
            }
            
        }
    }
    
}
