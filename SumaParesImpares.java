/*
 * =====================================================================
 *  Actividad 6 - Ejercicios Practicos Java (trabajo colaborativo)
 *  Programa 2: Sumatoria de numeros pares e impares de un arreglo
 * ---------------------------------------------------------------------
 *  Autor: Daniel Velasco
 *  IDE:   Eclipse / NetBeans (Java estandar)
 *
 *  Descripcion:
 *  Se llena un arreglo de 10 posiciones con numeros enteros ingresados
 *  por el usuario. Luego se recorre el arreglo acumulando por separado
 *  la suma de los numeros PARES y la suma de los numeros IMPARES, y al
 *  final se imprimen las dos sumatorias.
 *
 *  Ejemplo: arreglo (4,7,8,9,10,11,13,6,2,1)
 *    Suma de pares   = 30  (4+8+10+6+2)
 *    Suma de impares = 41  (7+9+11+13+1)
 * =====================================================================
 */

import java.util.Scanner;

public class SumaParesImpares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // objeto para leer datos por teclado

        final int TAM = 10;                     // tamano fijo del arreglo
        int[] numeros = new int[TAM];           // arreglo de 10 posiciones

        int sumaPares = 0;                      // acumulador de numeros pares
        int sumaImpares = 0;                    // acumulador de numeros impares

        // 1) Llenar el arreglo con 10 numeros enteros
        System.out.println("--- Ingrese 10 numeros enteros ---");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Posicion " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 2) Recorrer el arreglo y clasificar cada numero
        for (int i = 0; i < TAM; i++) {
            if (numeros[i] % 2 == 0) {          // residuo 0 => es par
                sumaPares += numeros[i];
            } else {                            // en caso contrario => es impar
                sumaImpares += numeros[i];
            }
        }

        // 3) Mostrar las dos sumatorias
        System.out.println("\nLa sumatoria de numeros pares es:   " + sumaPares);
        System.out.println("La sumatoria de numeros impares es:  " + sumaImpares);

        sc.close();
    }
}
