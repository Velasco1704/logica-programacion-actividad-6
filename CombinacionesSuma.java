import java.util.Scanner;

public class CombinacionesSuma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int TAM = 6;                      // tamano fijo de cada arreglo
        int[] arreglo1 = new int[TAM];          // primer arreglo de 6 posiciones
        int[] arreglo2 = new int[TAM];          // segundo arreglo de 6 posiciones

        // 1) Leer la constante k
        System.out.print("Ingrese el valor de la constante k: ");
        int k = sc.nextInt();

        // 2) Llenar el primer arreglo (6 numeros)
        System.out.println("\n--- Ingrese los 6 numeros del PRIMER arreglo ---");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Arreglo 1 - posicion " + (i + 1) + ": ");
            arreglo1[i] = sc.nextInt();
        }

        // 3) Llenar el segundo arreglo (6 numeros)
        System.out.println("\n--- Ingrese los 6 numeros del SEGUNDO arreglo ---");
        for (int j = 0; j < TAM; j++) {
            System.out.print("Arreglo 2 - posicion " + (j + 1) + ": ");
            arreglo2[j] = sc.nextInt();
        }

        // 4) Recorrer todas las combinaciones posibles (arr1[i] + arr2[j])
        int contador = 0;                     
        System.out.println("\nCombinaciones cuya suma es igual a " + k + ":");

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (arreglo1[i] + arreglo2[j] == k) {
                    contador++;                
                    System.out.println("  (" + arreglo1[i] + ", " + arreglo2[j] + ")");
                }
            }
        }

        // 5) Mostrar el resultado final
        if (contador == 0) {
            System.out.println("  No existen combinaciones que sumen " + k + ".");
        }
        System.out.println("\nTotal de combinaciones encontradas: " + contador);

        sc.close();
    }
}
