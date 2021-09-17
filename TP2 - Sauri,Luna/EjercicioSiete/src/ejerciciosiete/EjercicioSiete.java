/*
 Solicite el ingreso de una cadena 
y determine el tamaño de la misma 
y cuantas vocales tiene en total (recorre el String con charAt)
 */
package ejerciciosiete;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioSiete {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de texto");
        String cadena = sc.nextLine();
        
        System.out.println("El tamaño de la cadena es de: " + cadena.length());
        
        int vocales = 0;
        
        
        for (int i = 0; i < cadena.length() ; i++) {

            if ((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') 
                    || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') 
                    || (cadena.charAt(i)=='u')){
                
            vocales++;
            } 
            
        }
        
        System.out.println("La cadena de texto tiene " + vocales + " vocales: ");
        
    }
    
}
