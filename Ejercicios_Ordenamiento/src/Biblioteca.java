// 2. Organización de Biblioteca Dinámica
// Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)
//
// Contexto: Un bibliotecario recibe una caja de libros y los va colocando
// uno a uno en el estante en su posición correcta.
//
// Detalle del ejercicio: El usuario debe ingresar la cantidad de libros
// y luego el código ISBN (número entero) de cada uno.
//
// Lógica de Inserción: El algoritmo toma cada elemento y lo compara con
// los que están a su izquierda, desplazando los mayores para insertar
// el nuevo valor en su posición correcta.
//
// Visualización Paso a Paso: En cada ciclo del ordenamiento, el programa
// debe imprimir cómo va quedando el arreglo para observar cómo se ordena.

import java.util.Arrays;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de libros: ");
        int n = sc.nextInt();

        int[] isbn = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ISBN del libro " + (i + 1) + ": ");
            isbn[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {

            int clave = isbn[i];
            int j = i - 1;

            while (j >= 0 && isbn[j] > clave) {
                isbn[j + 1] = isbn[j];
                j--;
            }

            isbn[j + 1] = clave;

            System.out.println("Paso " + i + ": " + Arrays.toString(isbn));
        }

        System.out.println("\nArreglo ordenado:");
        System.out.println(Arrays.toString(isbn));

        sc.close();
    }
}