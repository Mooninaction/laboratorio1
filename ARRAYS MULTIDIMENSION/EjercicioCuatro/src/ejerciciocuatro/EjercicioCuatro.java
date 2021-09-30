/*
Arreglos Multidimensionales.

Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o
igual a 10. Cree un arreglo de tamaño [X,X] de tipo int, 

nos piden hacer un menú con estas opciones:
a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
c) Suma de una columna que se pedirá al usuario (controlar que elija una
correcta)
d) Sumar la diagonal principal
e) Sumar la diagonal inversa
f) La media de todos los valores de la matriz
IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se
deberán de ejecutar, simplemente mostrar un mensaje que diga que debes
rellenar la matriz. Mostrar por pantalla el resultado de la ejecución de cada una de
las opciones del menú.

 */
package ejerciciocuatro;

import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor entero X mayor o igual a 3 y menor o igual a 10");
        int x = sc.nextInt();

        int[][] array = new int[x][x];
        boolean salir = false;
        
        do {
            mostrarMenu();
            System.out.println("Seleccione opcion del menú");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                    //Llenar array
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array.length; j++) {
                            System.out.print("Ingrese el valor para la posicion i=" + i + " j=" + j + " : ");
                            array[i][j] = sc.nextInt();
                        }
                    }
                    break;

                case "b":
                    //sumaFila();
                    int sumaFila = 0;
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array.length; j++) {
                            sumaFila = sumaFila + array[i][j];
                        }
                    }
                    break;
                case "c":
                    //sumaComuna();
                    int sumaColumna = 0;
                    for (int j = 0; j < array.length; j++) {
                        for (int i = 0; i < array.length; i++) {
                            sumaColumna = sumaColumna + array[i][j];
                        }
                    }
                    break;
                case "d":
                    //sumaDiagonal();
                    int sumaDiagonal = 0;
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array.length; j++) {
                            if (i == j) {
                                sumaDiagonal = sumaDiagonal + array[i][j];
                            }
                        }
                    }
                    break;
                case "e":
                    //sumaDiagonalInversa();
                    int sumaDiagonalInversa = 0;
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array.length; j++) {
                            if (i + j == array.length) {
                                sumaDiagonalInversa = sumaDiagonalInversa + array[i][j];
                            }
                        }
                    }
                    break;
                case "f":

                    //mediaMatriz();
                    int sumatoria = 0; // Aquí iremos sumando cada valor
                    int cantidadDeElementos = 0; // Contar los elementos

                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            int numeroActual = array[i][j];
                            sumatoria = sumatoria + numeroActual;
                            cantidadDeElementos = cantidadDeElementos + 1;
                        }
                    }
                    float promedio = (float) sumatoria / cantidadDeElementos;
                    System.out.printf("La sumatoria es %d y el promedio es %f", sumatoria, promedio);
                    break;
                case "g":
                    salir = true;
            }
        }while(salir==true);

    
    }

    private static void mostrarMenu() {
        System.out.println(" ** MENU ** \n"
                + "a) Rellenar TODA la matriz de números, debes pedírselo al usuario.\n"
                + "b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)\n"
                + "c) Suma de una columna que se pedirá al usuario (controlar que elija una correcta)\n"
                + "d) Sumar la diagonal principal\n"
                + "e) Sumar la diagonal inversa\n"
                + "f) La media de todos los valores de la matriz\n"
                + "g) SALIR ");
    }

}
