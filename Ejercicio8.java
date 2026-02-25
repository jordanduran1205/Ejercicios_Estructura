// Ejercicio 8 — Copia real vs referencia
// Pide al usuario 3 calificaciones para llenar notas[].
// Crea una copia real en notasRespaldo[] copiando elemento por elemento.
// Modifica notas[0] con un valor que el usuario ingrese.
// Muestra ambos arreglos y verifica que notasRespaldo no cambió.
//
// Datos de entrada: double × 3 notas, double nuevo valor para notas[0]
//
// Salida esperada:
//
// notas[0]         = 4.5  ← cambió
// notasRespaldo[0] = 3.2  ← no cambió, es una copia independiente

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[3];
        double[] notasRespaldo = new double[3];


        System.out.println("Ingresa 3 calificaciones:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + i + ": ");
            notas[i] = sc.nextDouble();
        }


        for (int i = 0; i < notas.length; i++) {
            notasRespaldo[i] = notas[i];
        }


        System.out.print("\nIngresa un nuevo valor para notas[0]: ");
        notas[0] = sc.nextDouble();


        System.out.println("\nnotas[0]         = " + notas[0] + "  ← cambió");
        System.out.println("notasRespaldo[0] = " + notasRespaldo[0] + "  ← no cambió, es una copia independiente");

        System.out.println("\nArreglo notas: " + Arrays.toString(notas));
        System.out.println("Arreglo notasRespaldo: " + Arrays.toString(notasRespaldo));

        sc.close();
    }
}