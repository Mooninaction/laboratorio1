/*
Cree una clase OperacionesFraccion que contenga un método main donde 
se solicite al usuario el ingreso de 4 valores numéricos enteros
con los cuales se crearan 2 objetos Fracción
y finalizada la creación de los mismos


se ejecutaran los 4 métodos implementados anteriormente 
asignando el resultado a una nueva variable de tipo Fracción y 

mostrando por pantalla el resultado de las operaciones realizadas.

 */
package ejercicioveinte;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class OperacionesFraccion {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese numerador seguido de su denominador de la primera fraccion");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Fraccion f1 = new Fraccion(num1, num2);
        System.out.println("La fraccion queda como: " + f1.Fraccion(num1, num2));
        
        System.out.println("Ingrese numerador seguido de su denominador de la segunda fraccion");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        Fraccion f2 = new Fraccion(num3, num4);
        System.out.println("La fraccion queda como: " + f2.Fraccion(num3, num4));
        
        
        
        System.out.println("******* OPERACIONES *******");
        
        Fraccion f3 = new Fraccion();
        
        System.out.println("*** SUMA *** " +
                f3.sumarFracciones(f1.Fraccion(num1, num2), f2.Fraccion(num3, num4)));
        
        System.out.println("*** RESTA *** " + 
                f3.restarFracciones(f1.Fraccion(num1, num2), f2.Fraccion(num3, num4)));
      
        System.out.println("*** MULTIPLICACION *** " + 
                f3.multiplicarFracciones(f1.Fraccion(num1, num2), f2.Fraccion(num3, num4)));
        
        System.out.println("*** DIVISION *** " +
                f3.dividirFracciones(f1.Fraccion(num1, num2), f2.Fraccion(num3, num4)));
        
        
    }
    
}
