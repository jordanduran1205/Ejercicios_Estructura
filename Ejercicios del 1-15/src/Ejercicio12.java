// Ejercicio 12 — Registro de temperaturas (lineal)
// Pide al usuario las temperaturas máximas de los 7 días de la semana.
// Calcula e imprime:
// - El promedio semanal
// - El día más caluroso (índice 0 = lunes)
// - El día más frío
// - Qué días estuvieron por encima del promedio
//
// Datos de entrada: double × 7 temperaturas

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] temperaturas = new double[7];
        double suma = 0;


        System.out.println("Ingresa las temperaturas máximas de los 7 días:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Día " + i + " (0=Lunes): ");
            temperaturas[i] = sc.nextDouble();
            suma += temperaturas[i];
        }


        double promedio = suma / 7;


        int indiceMax = 0;
        int indiceMin = 0;

        for (int i = 1; i < 7; i++) {
            if (temperaturas[i] > temperaturas[indiceMax]) {
                indiceMax = i;
            }
            if (temperaturas[i] < temperaturas[indiceMin]) {
                indiceMin = i;
            }
        }


        System.out.println("\nPromedio semanal: " + promedio);
        System.out.println("Día más caluroso: índice " + indiceMax + " con " + temperaturas[indiceMax] + "°");
        System.out.println("Día más frío: índice " + indiceMin + " con " + temperaturas[indiceMin] + "°");

        System.out.println("\nDías por encima del promedio:");
        for (int i = 0; i < 7; i++) {
            if (temperaturas[i] > promedio) {
                System.out.println("Índice " + i + 
                                   " con " + temperaturas[i] + "°");
            }
        }

        sc.close();
    }
}