// 3. El Salto de Shell (Optimización de Datos)
// Algoritmo obligatorio: Ordenamiento Shell (Shell Sort)
//
// Contexto: Una empresa de logística maneja paquetes con diferentes pesos
// y necesita ordenarlos de forma más eficiente que el método de burbuja
// o inserción simple.
//
// Detalle del ejercicio: El usuario ingresa el peso de N paquetes.
// Se recomienda probar con al menos 10 valores.
//
// Lógica de Shell: El algoritmo empieza comparando elementos lejanos
// usando un salto (gap) de N/2. Luego el salto se reduce a la mitad
// hasta llegar a 1.
//
// Explicación: Este método es más rápido que inserción simple porque
// primero mueve elementos que están muy lejos de su posición correcta.
// Así cuando el gap llega a 1, el arreglo ya está casi ordenado y
// el trabajo final es mucho menor.
//
// Resultado esperado: Mostrar el arreglo original y el arreglo
// final ordenado.

import java.util.Arrays;
import java.util.Scanner;

public class EmpresaLogistica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de paquetes: ");
        int n = sc.nextInt();

        int[] pesos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Peso del paquete " + (i + 1) + ": ");
            pesos[i] = sc.nextInt();
        }

        System.out.println("\nArreglo original:");
        System.out.println(Arrays.toString(pesos));

        for (int gap = n / 2; gap > 0; gap = gap / 2) {

            for (int i = gap; i < n; i++) {

                int temp = pesos[i];
                int j = i;

                while (j >= gap && pesos[j - gap] > temp) {
                    pesos[j] = pesos[j - gap];
                    j = j - gap;
                }

                pesos[j] = temp;
            }
        }

        System.out.println("\nArreglo ordenado:");
        System.out.println(Arrays.toString(pesos));

        sc.close();
    }
}