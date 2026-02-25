// Ejercicio 11 — Lista de pasajeros (lineal)
// Pide al usuario cuántos pasajeros tiene un vuelo (máximo 8).
// Luego pide el nombre de cada uno.
// Muestra la lista numerada con número de asiento y nombre.
// Al final, indica cuántos asientos quedan disponibles sobre el total de 8.
//
// Datos de entrada: int cantidad, String nombres

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TOTAL_ASIENTOS = 8;
        String[] pasajeros = new String[TOTAL_ASIENTOS];

        System.out.print("¿Cuántos pasajeros tiene el vuelo? (máximo 8): ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        if (cantidad > TOTAL_ASIENTOS) {
            cantidad = TOTAL_ASIENTOS;
            System.out.println("Se ajustó la cantidad al máximo permitido (8).");
        }


        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre del pasajero para asiento " + (i + 1) + ": ");
            pasajeros[i] = sc.nextLine();
        }


        System.out.println("\nLista de pasajeros:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Asiento " + (i + 1) + ": " + pasajeros[i]);
        }

        int disponibles = TOTAL_ASIENTOS - cantidad;
        System.out.println("\nAsientos disponibles: " + disponibles + " de " + TOTAL_ASIENTOS);

        sc.close();
    }
}