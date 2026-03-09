// 5. El Inspector de Eficiencia (Duelo de Métodos)
// Algoritmos obligatorios: Selección vs Inserción
//
// Contexto: Un analista de sistemas quiere saber cuál algoritmo
// es más "pesado" en términos de operaciones para un caso específico.
//
// Detalle del ejercicio: El usuario ingresa 6 números enteros desordenados.
// El programa aplicará ambos métodos al mismo conjunto de datos.
// Para ello se usa una copia del arreglo original.
//
// Lógica de Conteo:
// En Selección: se cuenta cada vez que ocurre un swap (intercambio).
// En Inserción: se cuenta cada vez que un elemento se mueve hacia
// la izquierda dentro del ciclo interno.
//
// Resultado esperado: Mostrar cuántos intercambios hizo Selección
// y cuántos movimientos hizo Inserción, y decir cuál fue más eficiente.

import java.util.Arrays;
import java.util.Scanner;

public class DueloMetodos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] datos = new int[6];

        System.out.println("Ingrese 6 números enteros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            datos[i] = sc.nextInt();
        }

        int[] seleccion = Arrays.copyOf(datos, datos.length);
        int[] insercion = Arrays.copyOf(datos, datos.length);

        int swaps = 0;

        for (int i = 0; i < seleccion.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < seleccion.length; j++) {
                if (seleccion[j] < seleccion[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = seleccion[i];
                seleccion[i] = seleccion[min];
                seleccion[min] = temp;
                swaps++;
            }
        }

        int movimientos = 0;

        for (int i = 1; i < insercion.length; i++) {

            int clave = insercion[i];
            int j = i - 1;

            while (j >= 0 && insercion[j] > clave) {
                insercion[j + 1] = insercion[j];
                j--;
                movimientos++;
            }

            insercion[j + 1] = clave;
        }

        System.out.println("\nArreglo original: " + Arrays.toString(datos));
        System.out.println("Ordenado con Selección: " + Arrays.toString(seleccion));
        System.out.println("Ordenado con Inserción: " + Arrays.toString(insercion));

        System.out.println("\nIntercambios (Selection Sort): " + swaps);
        System.out.println("Movimientos (Insertion Sort): " + movimientos);

        sc.close();
    }
}