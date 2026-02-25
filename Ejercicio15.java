// Ejercicio 15 — Árbol de decisiones (no lineal)
// Construye el siguiente árbol de decisiones para clasificar un número ingresado:
//
//           ¿Número > 0?
//           /           \
//         Sí             No
//     ¿Par o Impar?    ¿Es cero?
//     /         \       /     \
//   Par        Impar  Sí      No
//                   (Cero) (Negativo)
//
// Pide al usuario un número entero. Navega el árbol para clasificarlo como:
// Par positivo, Impar positivo, Cero o Negativo.

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Par positivo");
            } else {
                System.out.println("Impar positivo");
            }
        } else {
            if (num == 0) {
                System.out.println("Cero");
            } else {
                System.out.println("Negativo");
            }
        }

        sc.close();
    }
}