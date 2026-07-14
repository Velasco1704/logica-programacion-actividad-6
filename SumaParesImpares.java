import java.util.Scanner;

public class SumaParesImpares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int TAM = 10;
        int[] numeros = new int[TAM];

        int sumaPares = 0;
        int sumaImpares = 0;

        // 1) Llenar el arreglo con 10 numeros enteros
        System.out.println("--- Ingrese 10 numeros enteros ---");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Posicion " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 2) Recorrer el arreglo y clasificar cada numero
        for (int i = 0; i < TAM; i++) {
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
            } else {
                sumaImpares += numeros[i];
            }
        }

        // 3) Mostrar las dos sumatorias
        System.out.println("\nLa sumatoria de numeros pares es:   " + sumaPares);
        System.out.println("La sumatoria de numeros impares es:  " + sumaImpares);

        sc.close();
    }
}
