/*
Trabajo Practico - Ejercicios: (Arreglos unidimensionales)

 5. Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares
del 1 al 100, de los cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético
 */
package ejerciciocinco;

public class EjercicioCinco {

    public static void main(String[] args) {

        int[] vector = new int[20];
        int[] igual = new int[20];
        int[] mayor = new int[20];
        int[] menor = new int[20];

        //LLeno el vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (100) + 1);
        }

        //Recorro el vector
        System.out.println("\n" + "El vector queda: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [ " + vector[i] + " ] ");
        }

        // PROMEDIO_ARITMÉTICO (x1+x2+x3+...+xn)/n
        double suma = vector[0];
        for (int i = 1; i < vector.length; i++) {
            suma += vector[i];

        }
        
        for (int i = 1; i < vector.length; i++) {
            suma += vector[i];
        }
        System.out.println("\n" +" Su promedio aritmético es: " + suma);
        
        for (int i = 1; i < vector.length; i++) {
            
            if (suma == vector[i]) {
                
                for (int j = 0; j < igual.length; j++) {
                    igual[j] = vector[i];
                     
                }
            }
            if (suma < vector[i]) {
                for (int j = 0; j < mayor.length; j++) {
                    mayor[j] = vector[i];
                }
            }
            if (suma > vector[i]) {
                for (int j = 0; j < menor.length; j++) {
                    menor[j] = vector[i];
                }
            }
        }

        

        System.out.println("\n" +" Los números que son iguales al promedio aritmético son: " );
        for (int i = 0; i < igual.length; i++) {
            System.out.print(" [ " + igual[i] + " ] ");
        }
        
        System.out.println("\n" +" Los números que son mayores que el promedio aritmético son: ");
         for (int i = 0; i < mayor.length; i++) {
            System.out.print(" [ " + mayor[i] + " ] ");
        }
        System.out.println("\n" +" Los números que son menores que el promedio aritmético son: ");
        for (int i = 0; i < menor.length; i++) {
            System.out.print(" [ " + menor[i] + " ] ");
        }
    }

}
