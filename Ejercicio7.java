// Ejercicio 7 — Arreglo compartido (inventario)
// Pide al usuario 4 precios para llenar un arreglo precios[].
// Crea preciosAuditoria = precios (misma referencia).
// Pide al usuario el índice y el nuevo precio para hacer una corrección desde preciosAuditoria.
// Muestra ambos arreglos y verifica que el cambio se refleja en los dos.
// Datos de entrada: double × 4 precios, int índice, double nuevo precio

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precios = new double[4];

        System.out.println("Ingresa 4 precios:");
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Precio " + i + ": ");
            precios[i] = sc.nextDouble();
        }

        double[] preciosAuditoria = precios;

        System.out.print("\nIngresa el índice a corregir (0-3): ");
        int indice = sc.nextInt();

        System.out.print("Ingresa el nuevo precio: ");
        double nuevoPrecio = sc.nextDouble();

        preciosAuditoria[indice] = nuevoPrecio;

        System.out.println("\nArreglo precios: " + Arrays.toString(precios));
        System.out.println("Arreglo preciosAuditoria: " + Arrays.toString(preciosAuditoria));

        sc.close();
    }
}