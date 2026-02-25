// Ejercicio 6 — Demostración por valor
// Pide al usuario dos números enteros a y b.
// Asigna b = a, luego pide un nuevo valor para b.
// Imprime a y b después del cambio y explica con un mensaje en consola por qué a no cambió.
// Datos de entrada: int a, int b (dos veces)
// Salida esperada:
// a = 10  ← no cambió, se pasó por VALOR
// b = 99  ← esta sí cambió

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor de a: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el valor de b: ");
        int b = sc.nextInt();
        b = a;
        System.out.print("Ingresa un nuevo valor para b: ");
        b = sc.nextInt();

        System.out.println("\na = " + a + "  ← no cambió, se pasó por VALOR");
        System.out.println("b = " + b + "  ← esta sí cambió");
        sc.close();
    }
}